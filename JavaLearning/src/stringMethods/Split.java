package stringMethods;

public class Split {
	
	
	public static void main(String[] args)
	{
		String s1="vik ram";
		
		String[] op = s1.split("\\s");		//it will break the string from where found space in string and return the string array.
		for(String arr:op)
			System.out.println(arr);
	}

}
