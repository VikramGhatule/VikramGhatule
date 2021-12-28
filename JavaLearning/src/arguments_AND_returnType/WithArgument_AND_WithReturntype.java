package arguments_AND_returnType;

public class WithArgument_AND_WithReturntype {
	
	public int m1(int a,int b)
	{
		int c=a+b;
		return c;
		
	}
	public static void main(String[] args) {
		WithArgument_AND_WithReturntype v1 =new WithArgument_AND_WithReturntype();
		System.out.println(v1.m1(10, 20));
		
		
	}

}
