class Rectangle
{
	int len,wid;
	Rectangle(int a,int b)
	{
		len=a;
		wid=b;
	}
	public void area()
	{
		System.out.println(len*wid);
	}
	public void perimeter()
	{
		System.out.println(2*(len+wid));
	}
}
class Square extends Rectangle
{
	Square(int s)
	{
		super(s,s); 
	}
}
public class oops3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Square[] c=new Square[9];
		c[0]=new Square(1);
		c[0].area();
		c[0]=new Square(2);
		c[0].area();
		c[0]=new Square(3);
		c[0].area();
		c[0]=new Square(4);
		c[0].area();
		c[0]=new Square(5);
		c[0].area();
		c[0]=new Square(6);
		c[0].area();
		c[0]=new Square(7);
		c[0].area();
		c[0]=new Square(8);
		c[0].area();
				

	}

}
