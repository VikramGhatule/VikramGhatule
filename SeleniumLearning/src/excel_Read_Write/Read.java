package excel_Read_Write;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Read {
	
	public static void main(String[] args) throws IOException
	{
		
		File path = new File("D:\\Velocity\\Excel Read Write.xlsx");
		FileInputStream load = new FileInputStream(path);
		XSSFWorkbook workbook = new XSSFWorkbook(load);
		XSSFSheet sheet1 = workbook.getSheetAt(0);
		String DataFromSheet = sheet1.getRow(0).getCell(0).getStringCellValue();
		System.out.println("Data reading task Successfull  :"+DataFromSheet);
		
	}

}
