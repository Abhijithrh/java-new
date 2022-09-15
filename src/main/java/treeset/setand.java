package treeset;

import java.util.LinkedHashSet;
import java.util.Set;

public class setand {

	public static void main(String[] args) {
		Set<String> t= new LinkedHashSet<String>();
		t.add("1");
		t.add("2");
		t.add("3");
		Set<String> h=new LinkedHashSet<String>();
		h.add("1");
		h.add("7");
		h.add("9");
		for(String i:t)
		{
			for(String j:h)
			{
				if(i==j)
					System.out.println(i);
			}
		}
		

	}

}
