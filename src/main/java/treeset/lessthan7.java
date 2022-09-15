package treeset;

import java.util.Iterator;
import java.util.TreeSet;

public class lessthan7 {

	public static void main(String[] args) {
		TreeSet<Integer> al=new TreeSet<Integer>();
		TreeSet<Integer>treeheadset=new TreeSet<Integer>();
		al.add(1);
		al.add(2);
		al.add(3);
		al.add(4);
		al.add(5);
		al.add(6);
		al.add(7);
		al.add(8);
		al.add(9);
		al.add(10);
		treeheadset=(TreeSet)al.headSet(7);
		Iterator iterator;
		iterator = treeheadset.iterator();
		System.out.println("Treesetdata");
		while (iterator.hasNext()) {
		System.out.println(iterator.next() +" ");
		}
	}

}
