package arguments_AND_returnType;

public class WithArgument_AND_WithoutReturntype {
	
	public void m1(int a,int b)
	{
		int c=a-b;
		System.out.println(c);
	}
	public static void main(String[] args) {
		
		WithArgument_AND_WithoutReturntype obj =new WithArgument_AND_WithoutReturntype();
		obj.m1(100,200);
	}

}
