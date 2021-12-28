package abstractt;

 class Class3 extends Class2{
	
	
	void m3() 
	{
		System.out.println("Class2 implimented method");
	}
	Class3()
	{
		System.out.println("Class3 constructor is running");
	}
	
	public static void main(String[] args)
	{
		Class3 obj = new Class3();
		obj.m1();
		obj.m2();
		obj.m3();
	}
	@Override
	void m1() {
		// TODO Auto-generated method stub
		
	}

}
