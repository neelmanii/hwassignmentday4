package com.thrad.sleep;

public class MyThread extends Thread {

	@Override
	public void run() {
		for (int i = 1; i <= 10; i++) {
			System.out.println("Hii, I am ThreadExample " + i);
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}
