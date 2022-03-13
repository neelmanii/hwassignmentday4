package com.threadpriority;

public class Mani {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student s=new Student();
		Thread t1=new Thread(s,"StudentThread");
		t1.setPriority(10);
		t1.start();
		
		Employee e=new Employee();
		Thread t2=new Thread(e,"EmployeeThread");
		t2.setPriority(8);
		t2.start();
	}

}
