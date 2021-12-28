package stringMethods;

public class EqualsIgnoreCase {
	
	public static void main(String[] args)
	{
		String a="vikram";
		String b="VIKRAM ";
		
		boolean op = a.equalsIgnoreCase(b);  // it is comparing to two strings contents exactly match or not with case sencetive
		
		System.out.println(op);
	}

}
