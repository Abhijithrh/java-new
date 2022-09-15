class shape
{
	public void show()
	{
		System.out.println("this is shape");
	}
}
class rectangle extends shape
{
	public void showr()
	{
		System.out.println("this is rectangular shape");
	}
}
class Circle extends shape
{
	public void showc()
	{
		System.out.println("this is circular shape");
	}
}
class Square extends rectangle
{
	public void shows()
	{
		System.out.println("this is rectangle shape");
	}
}
class circle extends shape
{
	public void showc()
	{
		System.out.println("square is rectangle");
	}
}

public class oops4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Square obj =new Square();
		obj.show();
		obj.showr();

	}

}
