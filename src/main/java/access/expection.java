package access;

public class expection {
	

	public static void main(String[] args) {
		try {
			int dividebyZero=(5/0);
			System.out.println("try code");
		}
		catch(ArithmeticException e)
		{
			System.out.println("arthemtic exp"+e.getMessage());
		}

	}

}
