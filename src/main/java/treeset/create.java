package treeset;

import java.util.Iterator;
import java.util.TreeSet;

public class create {

	public static void main(String[] args) {
		TreeSet<String> al =new TreeSet<String>();
		al.add("Green");
		al.add("RED");
		al.add("yellow");
		Iterator<String> itr=al.iterator();
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}

	}

}
