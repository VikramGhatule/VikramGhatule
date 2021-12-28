package variables;

public class StaticVariable_using_ClassName {
	
	static int a=100;
	
	public void m1()
	{
		int a=50;
		System.out.println(a);
		System.out.println(StaticVariable_using_ClassName.a);
	}
	public static void main(String[] args)
	{
		StaticVariable_using_ClassName obj = new StaticVariable_using_ClassName();
		obj.m1();
	}
	
}
