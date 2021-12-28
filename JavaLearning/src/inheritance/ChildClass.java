package inheritance;

public class ChildClass extends ParentClass
{
	
	void child1()
	{
		System.out.println("Child 1 method");
	}
	void child2()
	{
		System.out.println("Child 2 method");
	}
	static void child3()
	{
		System.out.println(" static Child 3 method");
	}
		
	
	public static void main(String[] args)
	{
		child3();
		parent3();
		ChildClass obj = new ChildClass();
		obj.child1();
	}
}
