package practicing;
public class Parentcls extends Thread {
	public void run()
	{
		for(int i=1;i<=5;i++)
		{
			try {
				Thread.sleep(20);
			} catch (InterruptedException e) {
				
				e.printStackTrace();
			}
		System.out.println("hlo bhavani");
	}
	}
}

	public class Mythread extends Thread {
		int v[]= {2,3,4,5,6,7,8};
		public void run()
		{
			for(int i=0;i<=100;i++)
			{
				v[i]=v[i]*2;
				try {
					Thread.sleep(200);
				} catch (InterruptedException e) {
					
					e.printStackTrace();
				}
				System.out.println(v[i]);
			}
			
		}
		
		public static void main(String args[])
		{
			Parentcls a=new Parentcls();
			Mythread t1=new Mythread();
			t1.start();
			a.start();
		}
	}
		


