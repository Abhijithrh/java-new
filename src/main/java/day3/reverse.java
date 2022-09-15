package day3;

import java.util.Iterator;
import java.util.LinkedList;

import exception1.string;

public class reverse {

	public static void main(String[] args) {
		LinkedList<String> LinkedList= new LinkedList<String>();
		LinkedList.add("america");
		LinkedList.add("3");
		LinkedList.add("4");
		LinkedList.add("8");
		Iterator<String> iterator = LinkedList.descendingIterator();
				while (iterator.hasNext())
				{
			System.out.println(iterator.next());
				}
				

	}

	
		
	}


