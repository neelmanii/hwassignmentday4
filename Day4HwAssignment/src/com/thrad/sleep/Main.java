package com.thrad.sleep;

import com.thread.MyThread;

public class Main {

	public static void main(String[] args) throws InterruptedException {
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

	}

}