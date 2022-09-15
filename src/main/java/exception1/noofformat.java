package exception1;

public class noofformat {

	public static void main(String[] args[]) {
		try {
			int num=Integer.parseInt("xyz");
			System.out.println(num);
		}
		catch(NumberFormatException e)
		{
		System.out.println("number format exception occured");
		}

	}

}
