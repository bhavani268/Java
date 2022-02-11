package collectins;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayllistInteger {

	public static void main(String[] args) {
		ArrayList<Integer> numbers=new ArrayList<>();
		numbers.add(2);
		numbers.add(3);
		numbers.add(4);
		numbers.add(5);
		numbers.add(6);
		numbers.add(7);
		Iterator<Integer> t=numbers.iterator();
		while(t.hasNext())
		{
			System.out.println(t.next());
		}
		

	}

}
