package array;

public class DuplicateValue {
	
	public static void main(String[] args)
	{
		int []v1= {1,2,2,3,4,4};
		
		for(int i=0; i<v1.length; i++)
		{
			for(int j=i+1; j<v1.length; j++)
			{
				if(v1[i]==v1[j])
				System.out.print(" "+v1[i]);
			}
			
		}
	}

}
