package interfaceLearning;

public class Class3 implements Class1, Class2 {

	public void m4()
	{
		System.out.println("M4 method is implimented");
	}

	public void m1()
	{
		System.out.println("M1 method is implimented");
	}

	public void m2() 
	{

		System.out.println("M2 method is implimented");
	}

	public void m3()
	{

		System.out.println("M3 method is implimented");
	}

	public static void main(String[] args)
	{
		Class3 ref = new Class3();
		ref.m1();
		ref.m2();
		ref.m3();
		ref.m4();
		Class2.m5();
		
	}

}
