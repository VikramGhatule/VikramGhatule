package if_else;

public class UseOf_if_Else {
	
	int maths;
	int chem;
	int phy;
	
	public UseOf_if_Else(int  maths, int chem, int phy)
	{
		this.maths=maths;
		this.chem=chem;
		this.phy=phy;
	}
	public void student()
	{
		System.out.println("Marks of Subject");
		System.out.println("Maths :" +maths);
		System.out.println("Chemistry :" +chem);
		System.out.println("Physics :"+phy);
		
		if((maths>=35) && (chem>=35) && (phy>=35))
		{
			System.out.println("Result is :" +"PASS");
		}
		else
		{
			System.out.println("Result is :" +"FAIL");
		}
	}
	public static void main(String[] args)
	{
		UseOf_if_Else vikram = new UseOf_if_Else(99,98,21);
		vikram.student();
	}

}
