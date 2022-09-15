class Parent
{
	public void show() {
		System.out.println("this parent");
	}
}
 class Child extends Parent
{
	public void show()
	
	
		{
			System.out.println("this is child class");
		}
	
}
public class pattern10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Parent p=new Parent();
		Child c=new Child();
		p.show();

	}

}
