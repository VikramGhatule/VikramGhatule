package do_while;

public class Do_While_Odd_Number {
	
	
	public static void main(String[] args)
	{
		int a=0;
		
		do
		{
			if(!(a%2==0))
				System.out.println(a);
			a++;
		}
		while(a<=150);
	}

}
