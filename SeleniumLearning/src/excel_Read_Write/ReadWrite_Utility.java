package excel_Read_Write;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadWrite_Utility {
	
	public String write(int SheetNum, int RowValue, int CellValue, String data) throws IOException
	{
		File path = new File("D:\\Velocity\\Excel Read Write.xlsx");
		FileInputStream load = new  FileInputStream(path);
		XSSFWorkbook workbook = new XSSFWorkbook(load);
		XSSFSheet sheet1 = workbook.getSheetAt(SheetNum);
		FileOutputStream write = new FileOutputStream(path);
		sheet1.createRow(RowValue).createCell(CellValue).setCellValue(data);
		workbook.write(write);
		return data ;
		
		
	}
	
	public String Read(int SheetNum, int RowValue, int CellValue, String data) throws IOException
	{
		File path = new File("D:\\Velocity\\Excel Read Write.xlsx");
		FileInputStream fileload = new FileInputStream(path);
		XSSFWorkbook workbook = new XSSFWorkbook(fileload);
		XSSFSheet sheet1= workbook.getSheetAt(SheetNum);
		String data1 = sheet1.getRow(RowValue).getCell(CellValue).getStringCellValue();
		return data1;
		
	}

}
