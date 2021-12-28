package inheritance;

public class Hierarchal_Child1 extends Hierarchical_parent
{
	
	void m3()
	{
		System.out.println("Hierarchal_Child1 m3");
	}
	void m4()
	{
		System.out.println("Hierarchal_Child1 m4");
	}
	
	public static void main(String[] args) {
		
		
		Hierarchal_Child1 obj = new Hierarchal_Child1();
		obj.m1();
		obj.m2();
		Hierarchal_Child3 obje = new Hierarchal_Child3();
		obje.m6();
	}
	

}
