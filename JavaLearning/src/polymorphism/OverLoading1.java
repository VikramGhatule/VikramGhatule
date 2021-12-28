package polymorphism;

public class OverLoading1 {
	
	public void method1(int a,int b)
	{
		System.out.println(a);
	}
	public void method1(int a)
	{
		System.out.println("Defalut Method is running");
	}
	public void method1(int b,char c)
	{
		System.out.println("Result is: " +b + " " + c);
	}
	public void method1(boolean a)
	{
		System.out.println(a);
	}

}
