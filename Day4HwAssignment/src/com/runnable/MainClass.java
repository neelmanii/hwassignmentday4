package com.runnable;

public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Thread t1 = new Thread(new MyThread());
		t1.start();
		
		Thread t2 = new Thread(new MyThread());
		t2.start();
		
		Thread t3 = new Thread(new MyThread());
		t3.start();
	}

}
