package Tetris.src.com.tarena.tetris.test;

import javax.swing.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

/**
 * ���̼���
 */
public class KeyTest {
	public static void main(String[] args) {
		JFrame frame = new JFrame();
		JPanel panel = new JPanel();
		frame.add(panel);
		frame.setSize(300, 200);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
		// �󶨼����¼������
		KeyListener l = new KeyChecker();
		panel.addKeyListener(l);
		panel.requestFocus();// panel���� ��������Ľ���
	}
}

class KeyChecker implements KeyListener {
	@Override
	// e �����а���: ʱ��, �ص�, ����
	public void keyTyped(KeyEvent e) {
		// �����û�
		System.out.println(e.getWhen());
		System.out.println("Typed:" + e.getKeyChar());
	}

	@Override
	public void keyPressed(KeyEvent e) {
		// ��������
		System.out.println("Pressed" + e.getKeyChar());
	}

	@Override
	public void keyReleased(KeyEvent e) {
		// �����ͷ�
		System.out.println("Released" + e.getKeyChar());
	}
}
