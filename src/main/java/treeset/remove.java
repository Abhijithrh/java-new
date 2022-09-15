package treeset;

import java.util.HashMap;

public class remove {

	public static void main(String[] args) {
		HashMap <Integer,String> ai = new HashMap <Integer,String> ();
		 ai.put(1, "Red");
		  ai.put(2, "Green");
		  ai.put(3, "Black");
		  ai.put(4, "White");
		  ai.put(5, "Blue");
		  
		  System.out.println("The Original linked map: " + ai);
		  
		  ai.clear();
		  System.out.println("The New map: " + ai);

	}

}
