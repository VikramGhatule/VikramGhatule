package labling_of_loop;

public class Labling_Loop {
	
	public static void main(String[] args)
	{
	outerLoop:	for(int i=1;i<7;i++)
		{
			for(int j=1;j<=6;j++)
			{
				System.out.print(" "+j);
				if(j==5)
				{
					break outerLoop;
				}
			}
			System.out.println(" ");
		}
	}

}
