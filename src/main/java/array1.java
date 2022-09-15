import java.util.Scanner;
public class array1 {

	public static void main(String[] args) {
		int n;
		Scanner sc=new Scanner(System.in);
				System.out.print("enter the number of element is needed");
				n=sc.nextInt();
				int[] array=new int[10];
				for(int i=0;i<n;i++)
				{
					array[i]=sc.nextInt();
				}
				System.out.println("Array element");
				for(int i=0;i<n;i++)
				{System.out.println(array[i]);
				
				}
						

	}

}
