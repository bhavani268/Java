package com.xyz;

public class RandomColr implements Runnable {
	String colr[]= {"white","bllue","black","green","red","yellow"};
	public void run()
	{
		for(int i=0;i<colr.length;i++)
		{
			if(colr[i]=="red")
			{
				break;
			}
			else
			{
				System.out.println("colors :" +colr[i]);
			}
		}
	}

	public static void main(String[] args) {
		RandomColr rc= new RandomColr();
		Thread t= new Thread(rc);
		t.start();
		

	}
}
