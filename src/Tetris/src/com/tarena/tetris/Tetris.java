package Tetris.src.com.tarena.tetris;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.image.BufferedImage;
import java.util.Arrays;
import java.util.Timer;
import java.util.TimerTask;

import javax.imageio.ImageIO;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class Tetris extends JPanel {
	/** ��Ϸ�ĵ�ǰ״̬: RUNNING PAUSE GAME_OVER */
	private int state;
	public static final int RUNNING = 0;
	public static final int PAUSE = 1;
	public static final int GAME_OVER = 2;
	/** �ٶ� */
	private int speed;
	/** �Ѷȼ��� */
	private int level;
	/** ��������� �� index%speed==0 ʱ������һ�� */
	private int index;

	public static final int ROWS = 20;
	public static final int COLS = 10;
	/** ǽ */
	private Cell[][] wall = new Cell[ROWS][COLS];
	/** ��������ķ��� */
	private Tetromino tetromino;
	/** ��һ�������ķ��� */
	private Tetromino nextOne;
	/** �������� */
	private int lines;
	/** �÷� */
	private int score;

	/** ��Tetris�������Ӷ�ʱ�� */
	private Timer timer;

	/** ��Tetris������� ����ͼƬ���� */
	private static BufferedImage background;
	private static BufferedImage gameOver;
	private static BufferedImage pause;
	public static BufferedImage T;
	public static BufferedImage I;
	public static BufferedImage S;
	public static BufferedImage Z;
	public static BufferedImage J;
	public static BufferedImage L;
	public static BufferedImage O;
	static {// ��̬�����
		try {
			// ע�� Tetris����tetris.png������һ��
			// package��!
			background = ImageIO.read(Tetris.class.getResource("tetris.png"));
			gameOver = ImageIO.read(Tetris.class.getResource("game-over.png"));
			pause = ImageIO.read(Tetris.class.getResource("pause.png"));
			T = ImageIO.read(Tetris.class.getResource("T.png"));
			S = ImageIO.read(Tetris.class.getResource("S.png"));
			Z = ImageIO.read(Tetris.class.getResource("Z.png"));
			J = ImageIO.read(Tetris.class.getResource("J.png"));
			L = ImageIO.read(Tetris.class.getResource("L.png"));
			I = ImageIO.read(Tetris.class.getResource("I.png"));
			O = ImageIO.read(Tetris.class.getResource("O.png"));

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/** ��Tetris ����, ��дpaint */
	@Override
	public void paint(Graphics g) {
		// ���Ʊ���ͼƬ
		g.drawImage(background, 0, 0, null);
		g.translate(15, 15);
		paintWall(g);
		paintTetromino(g);
		paintNextOne(g);
		paintScore(g);
		paintState(g);// ������Ϸ��״̬
	}

	private void paintState(Graphics g) {
		switch (state) {
		case PAUSE:
			g.drawImage(pause, -15, -15, null);
			break;
		case GAME_OVER:
			g.drawImage(gameOver, -15, -15, null);
			break;
		}
	}

	/** ���Ʒ��� */
	private void paintScore(Graphics g) {
		int x = 292;
		int y = 162;
		g.setColor(new Color(0xffffff));
		Font font = new Font(Font.MONOSPACED, Font.BOLD, 28);
		g.setFont(font);
		g.drawString("SCORE:" + score, x, y);
		y += 56;
		g.drawString("LINES:" + lines, x, y);
		y += 56;
		g.drawString("LEVEL:" + level, x, y);
		x = 290;
		y = 160;
		g.setColor(new Color(0x667799));
		g.drawString("SCORE:" + score, x, y);
		y += 56;
		g.drawString("LINES:" + lines, x, y);
		y += 56;
		g.drawString("LEVEL:" + level, x, y);
	}

	public void paintTetromino(Graphics g) {
		if (tetromino == null) {
			return;
		}
		Cell[] cells = tetromino.cells;
		for (int i = 0; i < cells.length; i++) {
			Cell cell = cells[i];
			int x = cell.getCol() * CELL_SIZE;
			int y = cell.getRow() * CELL_SIZE;
			g.drawImage(cell.getImage(), x, y, null);
		}
	}

	public void paintNextOne(Graphics g) {
		if (nextOne == null) {
			return;
		}
		Cell[] cells = nextOne.cells;
		for (int i = 0; i < cells.length; i++) {
			Cell cell = cells[i];
			int x = (cell.getCol() + 10) * CELL_SIZE;
			int y = (cell.getRow() + 1) * CELL_SIZE;
			g.drawImage(cell.getImage(), x, y, null);
		}
	}

	public static final int CELL_SIZE = 26;

	/** ��װ�˻���ǽ�㷨 */
	private void paintWall(Graphics g) {
		for (int row = 0; row < wall.length; row++) {
			for (int col = 0; col < wall[row].length; col++) {
				int x = col * CELL_SIZE;
				int y = row * CELL_SIZE;
				// row=0 1 2 ... 19
				// col=0 1 2 ... 9
				// cell ����ǽ�ϵ�ÿ������
				Cell cell = wall[row][col];
				if (cell == null) {
					// g.drawRect(x, y,
					// CELL_SIZE, CELL_SIZE);
				} else {
					g.drawImage(cell.getImage(), x, y, null);
				}
			}
		}
	}

	/** ��Tetris��������������(action)���� */
	public void action() {
		// score = 2033;
		// wall[1][2] = new Cell(2,4,S);
		// wall[19][4] = new Cell(2,4,T);
		tetromino = Tetromino.randomOne();
		nextOne = Tetromino.randomOne();
		state = RUNNING;
		this.repaint();// �ػ����,�������paint����ǽ...
		this.addKeyListener(new KeyAdapter() {
			@Override
			// Java 5 �ṩ, �������Ƿ�����д
			public void keyPressed(KeyEvent e) {
				int key = e.getKeyCode();
				switch (state) {
				case GAME_OVER:
					processGameoverKey(key);
					break;
				case PAUSE:
					processPauseKey(key);
					break;
				case RUNNING:
					processRunningKey(key);
				}
				repaint();
			}
		});
		this.setFocusable(true);
		this.requestFocus();
		// ��Action ���������,��ʱ�ƻ�����
		timer = new Timer();
		timer.schedule(new TimerTask() {
			public void run() {
				speed = 40 - (lines / 100);
				speed = speed < 1 ? 1 : speed;
				level = 41 - speed;
				if (state == RUNNING && index % speed == 0) {
					softDropAction();
				}
				index++;
				repaint();
			}
		}, 10, 10);
	}

	private void processPauseKey(int key) {
		switch (key) {
		case KeyEvent.VK_Q:
			System.exit(0);
			break;
		case KeyEvent.VK_C:
			index = 0;
			state = RUNNING;
			break;
		}
	}

	protected void processRunningKey(int key) {
		switch (key) {
		case KeyEvent.VK_Q:
			System.exit(0);
			break;
		case KeyEvent.VK_RIGHT:
			Tetris.this.moveRightAction();
			break;
		case KeyEvent.VK_LEFT:
			Tetris.this.moveLeftAction();
			break;
		case KeyEvent.VK_DOWN:
			softDropAction();
			break;
		case KeyEvent.VK_SPACE:
			hardDropAction();
			break;
		case KeyEvent.VK_UP:
			rotateRightAction();
			break;
		case KeyEvent.VK_P:
			state = PAUSE;
			break;
		}

	}

	protected void processGameoverKey(int key) {
		switch (key) {
		case KeyEvent.VK_Q:
			System.exit(0);
			break;
		case KeyEvent.VK_S:
			/** ��Ϸ���¿�ʼ */
			this.lines = 0;
			this.score = 0;
			this.wall = new Cell[ROWS][COLS];
			this.tetromino = Tetromino.randomOne();
			this.nextOne = Tetromino.randomOne();
			this.state = RUNNING;
			this.index = 0;
			break;
		}
	}

	/** Tetris ������ӷ��� */
	public void rotateRightAction() {
		// System.out.println(tetromino);
		tetromino.rotateRight();
		if (outOfBounds() || coincide()) {
			tetromino.rotateLeft();
		}
		// System.out.println(tetromino);
	}

	/** Tetris ������ӷ��� */
	public void moveRightAction() {
		// ��������ķ������ƶ�
		tetromino.moveRight();
		// ���(��������ķ���)�����߽�(Bounds)
		if (outOfBounds() || coincide()) {
			// ��������ķ������ƶ�
			tetromino.moveLeft();
		}
	}

	public void moveLeftAction() {
		tetromino.moveLeft();
		// coincode: �غ� ���4�񷽿���ǽ�Ƿ��غ�
		if (outOfBounds() || coincide()) {
			tetromino.moveRight();
		}
	}

	/** ����غ� */
	private boolean coincide() {
		Cell[] cells = tetromino.cells;
		for (int i = 0; i < cells.length; i++) {
			Cell cell = cells[i];
			int row = cell.getRow();
			int col = cell.getCol();
			if (wall[row][col] != null) {
				return true;
			}
		}
		return false;
	}

	/** ��� (��������ķ���)�Ƿ񳬳��߽� */
	private boolean outOfBounds() {
		// ��������ķ����ĳ�����ӳ���, ���ǳ���
		Cell[] cells = tetromino.cells;
		for (int i = 0; i < cells.length; i++) {
			Cell cell = cells[i];
			int row = cell.getRow();
			int col = cell.getCol();
			if (row < 0 || row >= ROWS || col < 0 || col >= COLS) {
				return true;
			}
		}
		return false;
	}

	/** Ӳ����, һ�µ��� */
	public void hardDropAction() {
		while (canDrop()) {
			tetromino.softDrop();
		}
		landIntoWall();
		int lines = destroyLines();
		this.lines += lines;
		this.score += scoreTable[lines];
		if (isGameOver()) {
			state = GAME_OVER;
		} else {
			tetromino = nextOne;
			nextOne = Tetromino.randomOne();
		}
	}

	/** �÷ֱ� */
	private int[] scoreTable = { 0, 1, 10, 100, 500 };

	/** Tetris ��������䶯�� */
	public void softDropAction() {
		// 1 ����ܹ����������
		// 2 ����������� ��½��ǽ����
		// 3 �����Ѿ�������
		// 4 ���û�н���, �Ͳ�����һ������
		if (canDrop()) {
			tetromino.softDrop();
		} else {
			landIntoWall();
			int lines = destroyLines();
			this.lines += lines;
			// lines = 0 1 2 3 4
			// {0,1,10,100,500};
			this.score += scoreTable[lines];
			if (isGameOver()) {
				state = GAME_OVER;
			} else {
				tetromino = nextOne;
				nextOne = Tetromino.randomOne();
			}
		}
	}

	/** ��鵱ǰ�����Ƿ��ܹ����� */
	private boolean canDrop() {
		// 1 �����ĳ�������е���19�Ͳ���������
		// 2 �����ĳ�����Ӷ�Ӧǽ�ϵ��·�����
		// ���ӾͲ���������
		Cell[] cells = tetromino.cells;
		for (int i = 0; i < cells.length; i++) {
			Cell cell = cells[i];
			int row = cell.getRow();
			if (row == ROWS - 1) {
				return false;// ����������
			}
		}
		for (int i = 0; i < cells.length; i++) {
			Cell cell = cells[i];
			int row = cell.getRow();
			int col = cell.getCol();
			if (wall[row + 1][col] != null) {
				return false;
			}
		}
		return true;
	}

	/** ��½��ǽ���� */
	private void landIntoWall() {
		// ����ÿ�����ӵ�λ��, ���뵽ǽ�϶��ڵ�λ��
		Cell[] cells = tetromino.cells;
		// ��ǿ��forѭ��, Java 5 �ṩ,����������
		// (��������"��׼�������"�ļ򻯰�)
		for (Cell cell : cells) {
			int row = cell.getRow();
			int col = cell.getCol();
			wall[row][col] = cell;
		}
	}

	/** �����Ѿ�������, ������������ */
	private int destroyLines() {
		// ��0 ~ 19 ���в���, ����ҵ�����, ��
		// ɾ������
		int lines = 0;
		for (int row = 0; row < ROWS; row++) {
			if (isFullCells(row)) {
				deleteRow(row);
				lines++;
			}
		}
		return lines;
	}

	/** ���row�����Ƿ��Ǹ��� */
	private boolean isFullCells(int row) {
		Cell[] line = wall[row];
		for (Cell cell : line) {
			if (cell == null) {
				return false;
			}
		}
		return true;
	}

	/** ɾ��һ��, row���к� */
	private void deleteRow(int row) {
		for (int i = row; i >= 1; i--) {
			// ����: wall[i-1] -> wall[i]
			System.arraycopy(wall[i - 1], 0, wall[i], 0, COLS);
		}
		Arrays.fill(wall[0], null);// fill���
	}

	/** �����Ϸ�Ƿ���� */
	private boolean isGameOver() {
		// �����һ������û�г���λ����, ����Ϸ����
		// ����: ��һ����������ÿ���������ж�Ӧ��
		// ǽ��λ������и���, ����Ϸ����
		Cell[] cells = nextOne.cells;
		for (Cell cell : cells) {
			int row = cell.getRow();
			int col = cell.getCol();
			if (wall[row][col] != null) {
				return true;
			}
		}
		return false;
	}

	// ��Ϸ�����߳�
	public static void main(String[] args) {
		JFrame frame = new JFrame("Tetris");
		Tetris tetris = new Tetris();
		frame.add(tetris);
		frame.setSize(525, 550);
		frame.setAlwaysOnTop(true); // ��������
		frame.setUndecorated(true); // ȥ���߿�
		frame.setLocationRelativeTo(null);
		// Default Ĭ�� Close�ر� Operation����
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);// ������� paint()
		tetris.action();// ��main�����е���action
	}

}
