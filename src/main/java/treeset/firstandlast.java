package treeset;

import java.util.TreeSet;

public class firstandlast {

	public static void main(String[] args) {
		TreeSet<String> al=new TreeSet<String>();
		al.add("green");
		al.add("yellow");
		al.add("red");
		al.add("violet");
		Object first_element = al.first();
		System.out.println("First element is" + first_element  );
		Object last_element = al.last();
		System.out.println("Last element is" + last_element);
		
	

	}

}
