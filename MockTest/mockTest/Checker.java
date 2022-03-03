package mockTest;

import java.util.Comparator;

public class Checker implements Comparator<Player>{

	    public int compare(Player a, Player b) {
	        // If 2 Players have the same score
	        if(a.score == b.score){
	            // Order alphabetically by name
	        	System.out.println("scores are equal");
	            return a.name.compareTo(b.name);
	        }    

	        // Otherwise, order higher score first 
	        System.out.println("scores are not  equal");
	        return ((Integer) b.score).compareTo(a.score);
	    }

}
