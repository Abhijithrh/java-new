package day3;

import java.util.LinkedList;

public class specifiedposition {

	public static void main(String[] args) {
		LinkedList <String> linkedlist = new LinkedList <String> ();
		linkedlist.add("blue");
		linkedlist.add("green");
		linkedlist.add("yellow");
		linkedlist.add("red");
		
	    System.out.println("Let add the Yellow color after the Red Color: " + linkedlist);
		linkedlist.add(0, "Yellow");
		linkedlist.add(5,"violet");
		
		System.out.println("The linked list:" + linkedlist);

	}

}
