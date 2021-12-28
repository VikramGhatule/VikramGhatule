package encapsultion;

import java.util.Scanner;

public class EmployeeSalary {
	
	private int salary=90512;
	
	public int getSalary()
	{
		 Scanner sc = new Scanner(System.in);
		 String password;
		 System.out.println("Enter Password :");
		 password=sc.nextLine();
		 if(password.equals("Vikram2665@#"))
		 {
			 return salary;
		 }
		 else
		 {
			 System.out.println("You have entered wrong password");
			 return (Integer) null;
		 }
			 
	}
	public void setSalary(int salary)
	{
		this.salary=salary;
	}

}
