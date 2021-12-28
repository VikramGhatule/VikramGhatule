package break_continue_program;

public class Break_Continue_Program {
	
	public static void main(String[] args)
	{
		for(int i=0;i<=100;i++)
		{
			if(i%2==0)
			{
				if((i==40) || (i==50))
				{
					continue;
				}
				System.out.print(" "+i);
				if(i==60)
				{
					break;
				}
			}
			
		}
	}

}
