
public class primenumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int b,i,f=0;
		for(int a=1;a<100;a++) {
			b=a/2;
			i=2;
			f=0;
			while(i<=b)
			{
				if(a%i==0)
				{
					f++;
				}
				i++;
			}
			if(f==0)
				System.out.println(a);
			
		}
		

	}

}
