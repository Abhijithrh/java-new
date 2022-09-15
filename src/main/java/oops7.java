
class Degree
{
	public void getDegree()
	{
		System.out.println("i got a degree");
	}
}
class underGraduate
{
	public void show()
	{
		System.out.println("i am undergraduate");
	}
}
class postgraduate
{
	public void show()
	{
		System.out.println("i am postgraduate");
	}
}
public class oops7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		underGraduate u=new underGraduate();
		postgraduate p=new postgraduate();
		Degree d=new Degree();
		d.getDegree();
		u.show();
		p.show();

	}

}
