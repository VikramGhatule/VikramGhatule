package access_modifires;

public class PrivateAccessModifire {
	
	private void m1()
	{
		System.out.println("Private method");
	}
	public static void main(String[] args) {
		
		PrivateAccessModifire ref =new PrivateAccessModifire();
		ref.m1();
	}

}
