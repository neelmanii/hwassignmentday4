package com.threadpriority;

public class Student implements Runnable{

	@Override
	public void run() {
		System.out.println("Student is Studying");
		
	}
}
