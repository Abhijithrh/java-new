package treeset;

import java.util.TreeSet;

public class iterate {

	public static void main(String[] args) {
		TreeSet<String> al=new TreeSet<String>();
		al.add("1");
		al.add("2");
		al.add("4");
		al.add("5");
		for (String element : al)
		{
			System.out.println(element);
		}
		

	}

}
