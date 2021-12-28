package stackOverflow;

public class StackOverflow {
	
	public void m1()
	{
		System.out.println("M1 is running");
		m2();
	}
	
	public void m2()
	{
		System.out.println("m2 is running");
		m1();
	}
	public static void main(String[] args) {
		
		StackOverflow ref = new StackOverflow();
	ref.m1();
	}

}
