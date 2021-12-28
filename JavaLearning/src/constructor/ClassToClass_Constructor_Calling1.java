package constructor;

public class ClassToClass_Constructor_Calling1 extends ClassToClass_Constructor_Calling {
	
	public ClassToClass_Constructor_Calling1(boolean a)
	{
		System.out.println(a);
	}
	public static void main(String[] args)
	{
		ClassToClass_Constructor_Calling1 obj =new ClassToClass_Constructor_Calling1(true);
	}

}
