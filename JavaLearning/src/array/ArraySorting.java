package array;

import java.util.Arrays;

public class ArraySorting {
	
	public static void main(String[] args)
	{
		int [] arr= {125,548,7885,6654,8745,85487,6614,65514,86521,4};
		
		for(int j=0;j<arr.length;j++)
			System.out.print(" "+arr[j]);
		System.out.println();
		Arrays.sort(arr);
		for(int i=0;i<arr.length;i++)
			System.out.print(" "+arr[i]);
	}

}
