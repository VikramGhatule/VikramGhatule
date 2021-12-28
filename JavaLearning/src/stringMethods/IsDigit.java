package stringMethods;

public class IsDigit {
	
	
	public static void main(String [] args)
	{
		String s1="vik5am";
		
		char op = s1.charAt(3);				// it will get single character of that perticular string
		boolean op1 = Character.isDigit(op);  // it will check character is digit or not and return boolean output
		System.out.print(op1);
	}

}
