package encapsultion;

public class EmployeeMain {
	
	public static void main(String[] args)
	{
		int sal;
		EmployeeSalary obj = new EmployeeSalary();
		sal=obj.getSalary();
		System.out.println("Your previous Salary is :"+sal);
		
		obj.setSalary(99552);
		sal=obj.getSalary();
		System.out.println("Your updated salary is :"+sal);
	}

}
