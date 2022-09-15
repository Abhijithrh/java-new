import java.util.Scanner;

public class oddeven {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int sum=0,sum1=0,b,r;
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
		b=a;
		for(int i=0;b!=0;i++)
		{
			r=b%10;
			if(r%2==0)
				sum=sum1+r;
			else
				sum=sum1+r;
			b=b/10;
		}
System.out.println("sum of even=" +sum);
System.out.println("sum of odd=" +sum1);
sc.close();
	}

}
