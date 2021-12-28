package do_while;

public class Odd_Numbers_While {
	
	public static void main(String[] args)
	{
		int a=0;
		while(a<=100)
		{
			if(a%2!=0)
			{		
				System.out.print(a);
				System.out.print(" ");
			}
			a++;
		}
	}

}
