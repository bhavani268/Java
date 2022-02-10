package com.xyz;

public class ThreadCtrl extends Thread {
	Thread t=new Thread(); 
	
	public void run() {  

		try {

			for (int i = 0; i<10; i++) {
				if(i>=5)
				{
				System.out.println("Thread " + i);
				Thread.sleep(5000);
				}
				else 
				{
					System.out.println("Thread "  + i);
				}
			}

		} catch (InterruptedException e) {

			System.out.println("Thread has been interrupted");
		}

	} 
	public static void main(String[] args) {
		
		ThreadCtrl t1 =  new ThreadCtrl();   //first thread created
		t1.start();

	}

}
	

	