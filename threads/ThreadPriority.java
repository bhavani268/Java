package com.xyz;

public class ThreadPriority extends Thread {
	Thread t=new Thread();
	public void run()
	{
		System.out.println("thread priority");
	}
	public static void main(String[] args) {
		ThreadPriority tp=new ThreadPriority();
		ThreadPriority tp1=new ThreadPriority();
		ThreadPriority tp2=new ThreadPriority();
		System.out.println(tp.getPriority());//prints default priority value ie., NORM_PRIORITY
		System.out.println(tp1.getPriority());
		System.out.println(tp2.getPriority());
		tp.setPriority(MAX_PRIORITY);
		tp1.setPriority(MIN_PRIORITY);
		tp2.setPriority(NORM_PRIORITY);
		System.out.println("priority of 1st thread is: " + tp.getPriority());
		System.out.println("priority of 2nd thread is: " + tp1.getPriority());
		System.out.println("priority of 3rd thread is: " + tp2.getPriority());
		tp2.setPriority(6);
		System.out.println("priority of 3rd thread is: " + tp2.getPriority());

	}

}
