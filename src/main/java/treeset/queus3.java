package treeset;

import java.util.PriorityQueue;

public class queus3 {

	public static void main(String[] args) {
		int c=0;
		PriorityQueue<String> p=new PriorityQueue<String>();
		p.add("red");
		p.add("green");
		System.out.println(p);
		for(String i:p)
		{
			c++;
			
		}
		System.out.println(p.size());

	}

}
