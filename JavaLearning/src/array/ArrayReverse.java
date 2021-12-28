package array;

public class ArrayReverse {
	
	public static void main(String[] args) throws InterruptedException
	{
		int vik[]= {5448,45,454,54,3232,78};
		
		for(int i=0;i<vik.length;i++)
			System.out.print(" "+vik[i]);
		
		System.out.println();
		
		for(int i=vik.length-1;i>=0;i--)
			System.out.print(" "+vik[i]);
	}

}
