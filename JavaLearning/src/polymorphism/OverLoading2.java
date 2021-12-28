package polymorphism;

public class OverLoading2 extends OverLoading1
{
	
	public static void method1(boolean b, int c)
	{
		System.out.println("Inherited class Static method is running");
		System.out.println(" "+ true +c);
	}
	public void method1()
	{
		System.out.println("Inherited class 3 intiger value method is running");
	}
	public static void main(String[] args)
	{
		OverLoading2 obj =new OverLoading2();
	
	}

}
