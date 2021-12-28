package constructor;

public class Ini_DataMembr_this {
	
	int a;
	int b;
	int c=50;
	public Ini_DataMembr_this(int a, int b)
	{
		this.a=a;
		this.b=b;
		System.out.println(" " +this.c);
	}
	public static void main(String[] args) {
		Ini_DataMembr_this obj = new Ini_DataMembr_this(10,25);
	}

}
