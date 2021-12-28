package variables;

public class LocalVariable_Using_this_keyword {
	
	int a=50;
	
	public void m1()
	{
		int a=10;
		System.out.println(a);
		System.out.println(this.a);
		
	}
	public static void main(String[] args)
	{
		LocalVariable_Using_this_keyword ob = new LocalVariable_Using_this_keyword();
		ob.m1();
	}

}
