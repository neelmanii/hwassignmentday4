package com.join;

public class Main {

	public static void main(String[] args) throws InterruptedException {
		
		
		System.out.println("Main Thread Started");
		
		MyThread m1 = new MyThread();
		m1.start();
		m1.join();
		System.out.println(m1.getName()+" ended");
		
		MyThread m2 = new MyThread();
		m2.start();
		m2.join();
		System.out.println(m2.getName()+" ended");
		
		MyThread m3 = new MyThread();
		m3.start();
        m3.join();
        System.out.println(m3.getName()+" ended");
        
        System.out.println("Main Thread Ended");
	}

}
