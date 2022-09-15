package day3;

import java.util.LinkedList;

public class getthelastandthefirst {

	public static void main(String[] args) {
		LinkedList<String> linkedlist=new LinkedList<String>();
		linkedlist.add("a");
		linkedlist.add("b");
		linkedlist.add("c");
		linkedlist.add("e");
		linkedlist.add("f");
		System.out.println("Original linked list:"+linkedlist);
		Object first_element = linkedlist.getFirst();
	    System.out.println("First Element is: "+first_element);
	 
	   
	    Object last_element = linkedlist.getLast();
	    System.out.println("Last Element is: "+last_element);
		

	}

}

