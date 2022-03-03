package mockTest;

import java.util.Scanner;

public class OccuranceOfString {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String a=sc.next();
		char b='g';
		int count=1;
		for(int i=0;i<a.length();i++)
		{
			if(a.charAt(i)==b)
			{
				count=count+1;
			}
		}
		System.out.println(count);
		
	}

}
