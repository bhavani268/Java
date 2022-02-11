package collectins;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.Scanner;

public class LinkedList1 {
	Scanner sc= new Scanner(System.in);
	LinkedList<Integer> a1=new LinkedList<Integer>();
	Integer n=sc.nextInt();
	public void EvenNumbers()
	{
		
	
		/*for(int i=0;i<n;i++)
		{
			if(i%2==0)
			{
			a1.add(i);
			}
		}*/
		a1.add(2);
		a1.add(3);
		a1.add(4);
		a1.add(5);
		a1.add(26);
		a1.add(7);
		a1.add(44);
		a1.add(23);
		a1.add(21);
		a1.add(26);
		a1.add(27);
		
	}
		public void PrintEvenNumbers()
		{
			Iterator<Integer> x=a1.iterator();
			while(x.hasNext())
			{
				Integer z=x.next();
				if(z%2 == 0)
				{
		System.out.println(z*2);
			}
			}
	}
		public void PrintEvenNumb() {
			LinkedList<Integer> k=a1;
			if(k.contains(n))
			{
				System.out.println("true");
			}
			else 
			{
				System.out.println("false");
			}
			}
		public static void main(String[] args) {
			ass1 a=new ass1();
			a.EvenNumbers();
			a.PrintEvenNumbers();
			a.PrintEvenNumb();
		
	}

}


