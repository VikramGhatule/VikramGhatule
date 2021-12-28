package exceptionHandling;

public class Throws {
	
	public static void main(String[] args) throws InterruptedException
	{
		for(int i=1;i<=10;i++)
		{
			if(i<=10)
			{	
				Thread.sleep(500);
			}
			System.out.print(" "+i);
		}
	}

}
