import java.util.HashMap;

public class keyvalue {

	public static void main(String[] args) {
		HashMap <Integer,String> ai = new HashMap <Integer,String> ();
		  ai.put(1, "Red");
		  ai.put(2, "Green");
		  ai.put(3, "Black");
		  ai.put(4, "White");
		  ai.put(5, "Blue");
		  
		  boolean result = ai.isEmpty();
		  
		  System.out.println("Is hash map empty: " + result);
		  
		  ai.clear();
		  
		  result = ai.isEmpty();
		  
		  System.out.println("Is hash map empty: " + result);

	}

}
