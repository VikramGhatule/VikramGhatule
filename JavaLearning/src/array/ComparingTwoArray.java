package array;

import java.util.Arrays;

public class ComparingTwoArray {
	
	public static void main(String[] args)
	{
		
		int []a1= {10,23,45,56,67,87};
		int []a2= {10,23,45,56,67,87};
		int []a3= {23,34,45,465,656,7};
		
			System.out.println(Arrays.equals(a1, a2));
			System.out.println(Arrays.equals(a2, a3));
			System.out.println(Arrays.equals(a1, a3));
	}

}
