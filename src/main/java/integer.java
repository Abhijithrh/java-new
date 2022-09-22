class print1{
	public void show(int n,char c)
	{
		System.out.println("first");
	}
	public  void shoe(char c,int n)
	{
		System.out.println("second");
	}
}


public class integer {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		print1 p=new print1();
		p.show(1, 'c');
		p.show(2, 'c');

	}

}
