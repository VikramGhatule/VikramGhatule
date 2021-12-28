package All_Program_Task;

public class SaraswatiVidyalaya {
	
	int maths;
	int chem;
	int phy;
	
	public SaraswatiVidyalaya(int maths ,int chem , int phy)
	{
		this.maths=maths;
		this.chem=chem;
		this.phy=phy;
	}
	public void m1()
	{
		int total;
		System.out.println("Maths :" +maths);
		System.out.println("Chemistry :" +chem);
		System.out.println("Physics :" +phy);
		total=maths+chem+phy;
		System.out.println("Total marks of student is :" +total);
		
	}
	public static void main(String[] arg)
	{
		SaraswatiVidyalaya vikram =new SaraswatiVidyalaya(67,77,88);
		vikram.m1();
		
	}
	

}
