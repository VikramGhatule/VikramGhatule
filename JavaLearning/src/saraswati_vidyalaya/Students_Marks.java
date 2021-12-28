package saraswati_vidyalaya;

public class Students_Marks {
	
	int marathi,hindi,eng;
	
	public void m1()
	{
		Students_Marks Vikram = new Students_Marks();
		Students_Marks Nikita = new Students_Marks();
		Students_Marks Neha = new Students_Marks();
		
		Vikram.marathi=98;
		Vikram.hindi=99;
		Vikram.eng=100;
		
		Nikita.marathi=96;
		Nikita.hindi=95;
		Nikita.eng=97;
		
		Neha.marathi=92;
		Neha.hindi=87;
		Neha.eng=95;
		
		System.out.println("Vikram Marathi" +Vikram.marathi);
		System.out.println("Vikram Hindi" + Vikram.hindi);
		System.out.println("Vikram English" +Vikram.eng);
		
		System.out.println("Nikita Marathi" +Nikita.marathi);
		System.out.println("Nikita Hindi" + Nikita.hindi);
		System.out.println("Nikita English" +Nikita.eng);
		
		System.out.println("Neha Marathi" +Neha.marathi);
		System.out.println("Neha Hindi" + Neha.hindi);
		System.out.println("Neha English" +Neha.eng);
	}
	
	public static void main(String[] args)
	{
		Students_Marks obje = new Students_Marks();
		obje.m1();
	}

}
