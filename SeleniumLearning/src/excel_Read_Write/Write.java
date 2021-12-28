package excel_Read_Write;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Write {
	
	public static void main(String[] args) throws IOException
	{
		
		File path = new File("D:\\Velocity\\Excel Read Write.xlsx");
		FileInputStream Load= new FileInputStream(path);
		XSSFWorkbook workbook = new XSSFWorkbook(Load);
		XSSFSheet sheet1 = workbook.getSheetAt(0);
		
		FileOutputStream write = new  FileOutputStream(path);
		sheet1.createRow(0).createCell(0).setCellValue("Congratulations Vikram For New Job!!!");
		workbook.write(write);
		
		
	}

}
