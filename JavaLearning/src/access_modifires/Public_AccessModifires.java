package access_modifires;

public class Public_AccessModifires extends ProtectedAccessModifire {
	
	public static void main(String[] args) {
	
		Public_AccessModifires ref = new Public_AccessModifires();
		System.out.println(ref.a);
		ref.a=20;
		ref.m1();
	}

}
