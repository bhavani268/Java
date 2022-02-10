package com.xyz;

public class threadJoin {
	public static void main(String[] args) {
	Thread d=new Thread(new Runnable() {
	public void run()
	{
		for(int i=0;i<=20;i++)
		{
		if(i%2 ==0)
		{
			System.out.println("even=" + i);
		}
	}
	}
	});
	
	Thread c=new Thread(new Runnable() {
	public void run()
	{
		for(int i=0;i<=20;i++)
		{
		if(i%2 !=0)
		{
			System.out.println("odd=" + i);
		}
		}
	}});
	d.start();
	c.start();
	try {
		d.join();
		c.join();
	} 
	catch (InterruptedException e) {
		System.out.println("exception" +e);
		e.printStackTrace();
	}
	
	
	}
}
