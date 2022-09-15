package access;
import java.io.File;

class Test {

public class createafile {

	public static void main(String[] args) {
		File fileobj = new File("example.text");
		try {
			boolean success= fileobj.createNewFile();
			if (success)
			{System.out.println("file create");
			
			}
			else {
				System.out.println("not create file");
				
			}
			
		}
		catch (Exception e) {
			System.out.println(e);
		
		
		

	}

}


	}

}
