package com.runnable.q2;

public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Thread t=new Thread(new MyRunnable());
		t.start();

	}

}
