package exceptionHandling;

import java.util.Scanner;

public class CustomizedException {

	public void exceptionn()
	{
		
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter Student Mark :");
		int mark = sc.nextInt();
		if(mark<35)
			throw new IllegalArgumentException("Student is Failed..");
		else
			System.out.println("Student Is Passed.");
	}
	
	public static void main(String[] args)
	{
		CustomizedException obj = new CustomizedException();
		obj.exceptionn();
	}

}
