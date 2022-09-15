package treeset;

import java.util.Iterator;
import java.util.TreeSet;

public class reverse {

	public static void main(String[] args) {
		TreeSet<String> al= new TreeSet<String>();
		al.add("red");
		al.add("green");
		al.add("yellow");
		Iterator it= al.descendingIterator();
		while (it.hasNext())
		{
			System.out.println(it.next());
		}
				
		

	}

}
