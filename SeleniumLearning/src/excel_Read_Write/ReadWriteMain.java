package excel_Read_Write;

import java.io.IOException;

public class ReadWriteMain {
	
	public static void main(String[] args) throws IOException {
		
		
		ReadWrite_Utility rwu = new ReadWrite_Utility();
		rwu.write(1, 0, 0, "Soft.Eng.Vikram Ghatule");
		
	String value = rwu.Read(1, 0, 0, null);
	System.out.println(value);
	}

}
