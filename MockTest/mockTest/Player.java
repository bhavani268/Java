package mockTest;

import java.util.Comparator;

public class Player {
	String name;
	int score;

public Player(String name, int score) {
		
	this.name=name;
	this.score=score;
	}

 
public static void main(String args[]) {
	Player a=new Player("shashi",456);
	Player b=new Player("siddu",456);
	Checker c=new Checker();
	System.out.println(c.compare(a,b));
}
}
