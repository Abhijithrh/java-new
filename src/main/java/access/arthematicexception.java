package access;

public class arthematicexception {

	public static void main(String[] args) {
		try
		{
			int d=(3/1);
			int a[]=new int[2];
			a[3]=4;
			System.out.println("try code work");
		}
		catch(ArithmeticException e)
		{
			System.out.println(e.getMessage());
		}
		catch(ArrayIndexOutOfBoundsException e)
		{
			System.out.println(e.getMessage());
		}

	}

}
