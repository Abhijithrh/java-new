package day3;

import java.util.Iterator;
import java.util.LinkedList;

public class iterator1 {

	public static void main(String[] args)
	{
		 LinkedList<String> l_list = new LinkedList<String>();
		   
		 l_list.add("Red");
		 l_list.add("Green");
		 l_list.add("Black");
		 l_list.add("White");
		 l_list.add("Pink");
		
		   Iterator p = l_list.listIterator(4);

		   
		   while (p.hasNext()) 
		   {
		   System.out.println(p.next());
		   }

	}

}
