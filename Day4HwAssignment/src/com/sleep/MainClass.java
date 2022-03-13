package com.sleep;

public class MainClass {

	public static void main(String[] args) throws InterruptedException {
		Thread t1 = new Thread(new MyThread());
		t1.start();
		t1.join();
		System.out.println(t1.getName()+" ended");
		
		Thread t2 = new Thread(new MyThread());
		t2.start();
		t2.join();
		System.out.println(t2.getName()+" ended");
		
		
		Thread t3 = new Thread(new MyThread());
		t3.start();
		t3.join();
		System.out.println(t3.getName()+" ended");
		

	}

}