package variables;

public class Non_Static_Variable {
	
	int a=10;
	
	public static void main(String[] args)
	{
		Non_Static_Variable obje = new Non_Static_Variable();
		System.out.println(obje.a);
		
		Non_Static_Variable obj = new Non_Static_Variable();
		obj.a=50;
		System.out.println(obj.a);
		
		Non_Static_Variable obj1 = new Non_Static_Variable();
		obj1.a=100;
		System.out.println(obj1.a);
	}
}
