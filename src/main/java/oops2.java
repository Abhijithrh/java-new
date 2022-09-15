class Member{
	String name,address;
	int age,pn;
	float salary;
	public void printSalary()
	{
		System.out.println(name);
		System.out.println(address);
		System.out.println(age);
		System.out.println(pn);
		System.out.println(salary);
	}
}
class Employee extends Member
{
	char spec,dept;
}
class Manager extends Member
{
	char spec,dept;
}

public class oops2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Manager m=new Manager();
		Employee e=new Employee();
		
		m.name="encyclopedia";
		m.address="world";
		m.age=22;
		m.pn=909876543;
		m.salary=7890;
		
		e.name="anisha";
		e.address="somw where";
		e.age=22;
		e.pn=123456789;
		e.salary=1234;
			
		m.printSalary();
		System.out.println();
		e.printSalary();
	
	

	}

}
