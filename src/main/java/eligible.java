import java.util.Scanner;

public class eligible {

	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
		int age;
		Scanner sc = new Scanner(System.in);
		System.out.print("enter your age");
		age = sc.nextInt();
		if (age>=18)
		{
			System.out.println(" eligible for vote");
			
			
		}
		else
		{
			System.out.println("not eligible");
			
		}
sc.close();
	}

}
