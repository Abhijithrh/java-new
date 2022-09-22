package exception;

public class stringerror {

	public static void main(String[] args) {
		try {
			String a="marvel";
					System.out.println(a.substring(20));
		}
		catch(StringIndexOutOfBoundsException e)
		{
			System.out.println(e.getMessage());
		}

	}



	}


