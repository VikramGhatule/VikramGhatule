package task_HRM_utility;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.io.FileHandler;

public class HRM_Utility {
	
	public String Read(int Sheetnum, int Rownum, int Cellnum, String data) throws IOException
	{
		File path = new File("D:\\Velocity\\Excel Read Write.xlsx");
		FileInputStream load = new FileInputStream(path);
		XSSFWorkbook workbook= new XSSFWorkbook(load);
		XSSFSheet sheet1 = workbook.getSheetAt(Sheetnum);
		String opData= sheet1.getRow(Rownum).getCell(Cellnum).getStringCellValue();
		return opData;
		
	}
	
	public void ScreenShot(WebDriver driver) throws IOException
	{
		TakesScreenshot sc =(TakesScreenshot)driver;
		File output = sc.getScreenshotAs(OutputType.FILE);
		File path = new File("D:\\Velocity\\ScreenShot\\Vikram.png");
		FileHandler.copy(output, path);
	}

}
