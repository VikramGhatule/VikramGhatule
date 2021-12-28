package inheritance;

public class Hierarchal_Child2 extends Hierarchical_parent {
	
	void m5()
	{
		System.out.println("Hierarchal_Child2 m5");
	}
	public static void main(String[] args) {
		
		Hierarchal_Child2 ob = new Hierarchal_Child2();
		ob.m1();
		ob.m2();
		ob.m5();
	}

}
