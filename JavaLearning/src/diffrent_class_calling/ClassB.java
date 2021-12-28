package diffrent_class_calling;

public class ClassB {
	
	public static void m3()
	{
		System.out.println("Class B>> Non static M3 method is running");
	}
	public void m4()
	{
		System.out.println("Class b>> Non static M4 method is running");
	}
	public static void main(String[] args)
	{
		
		ClassA.m1();
		ClassA obj = new ClassA();
		obj.m2();
		m3();
		ClassB obj1 = new ClassB();
		obj1.m4();
		
	}


}
