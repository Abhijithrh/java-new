package treeset;

import java.util.HashMap;
import java.util.Map;

public class specified1 {

	public static void main(String[] args) {
		HashMap<Integer,String> ai=new HashMap<Integer,String>();
		ai.put(1,"Red");
		ai.put(2,"green");
		ai.put(3," violet");
		for(Map.Entry x:ai.entrySet())
		{
			System.out.println(x.getKey()+" "+x.getValue());
			
		}
		
		
	}

}
