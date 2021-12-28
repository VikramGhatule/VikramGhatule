package stringMethods;

public class SubString {
	
	public static void main(String[] args)
	{
		String s1="VIKRAM";
		
		String op = s1.substring(2);   //BeginIndex// it will devide and create new string from given index number.
		System.out.println(op);
		
		
		String s2="vikramNIKITA";
		String op1 = s2.substring(5, 12); //BeginIndex and EndIndex
		System.out.println(op1);
	}

}
