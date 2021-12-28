package variables;

public class Static_Variable_Declaration {
	
	static int a;
	static boolean b;
	static char c=' ';
	// if we do not assign any value to static variable then JVM will assign default value. 
	public static void m1()
	{
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
	}
	public static void main(String[] args) {
		m1();
	}
}
