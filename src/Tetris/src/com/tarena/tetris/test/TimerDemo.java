package Tetris.src.com.tarena.tetris.test;

import java.util.Timer;
import java.util.TimerTask;

/**
 * TimerTask ��ʱ������
 * 
 */
public class TimerDemo {
	public static void main(String[] args) {
		final Timer timer = new Timer();
		TimerTask task = new TimerTask() {
			@Override
			public void run() {
				System.out.println("HI");
			}
		};
		timer.schedule(task, 1000, 1000);
		// schedule ʱ��ƻ�
		timer.schedule(new TimerTask() {
			public void run() {
				timer.cancel();
			}
		}, 1000 * 10);
	}
}
