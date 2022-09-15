package treeset;

import java.util.HashSet;

public class clone {

	public static void main(String[] args) {
		HashSet<String> t= new HashSet<String>();
		t.add("p");
		t.add("o");
		t.add("i");
		t.add("u");
		System.out.println(t);
		HashSet<String> h= new HashSet<String>();
		h=(HashSet) t.clone();
		System.out.println(h);

	}

}
