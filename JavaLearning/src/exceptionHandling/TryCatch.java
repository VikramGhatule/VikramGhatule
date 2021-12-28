package exceptionHandling;

public class TryCatch {
	
	public static void main(String[] args)
	{
		int a=10; int b=20;
		System.out.println("Addition is :" +(a+b));
		System.out.println("Multiplication is :"+ a*b);
		try
		{
			System.out.println("Division is :"+ a/0);
		}
		catch(ArithmeticException msg)
		{
			System.out.println("Here is a exception :"+msg.getMessage());
		}
		finally
		{
			System.out.println("Finally method is always run");
		}
		System.out.println("Substraction is :"+(a-b));
	}

}
