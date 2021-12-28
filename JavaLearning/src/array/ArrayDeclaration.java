package array;

public class ArrayDeclaration {
	
	
	public static void main(String[] args)
	{
		int[] obj =new int[4];      //// declarartion of array using new keyword
		
		obj[0]=100;
		obj[1]=1545;
		obj[2]=84847;
		obj[3]=777;
		
		for(int i=0; i<obj.length;i++)
			System.out.print(obj[i] +" ");
	}

}
