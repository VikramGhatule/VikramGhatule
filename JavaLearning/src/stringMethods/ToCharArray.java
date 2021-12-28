package stringMethods;

public class ToCharArray {
	
	public static void main(String[] args)
	{
		String s1= "vikram";
		
		char[] chararray = s1.toCharArray();
		
		for(int i=0;i<chararray.length;i++)
			System.out.print(" "+chararray[i]);
	}

}
