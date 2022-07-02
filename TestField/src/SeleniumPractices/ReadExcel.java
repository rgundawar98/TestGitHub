package SeleniumPractices;

import java.io.File;
import java.io.FileInputStream;
//import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadExcel {

	public static void main(String[] args) throws IOException
	{
      File file = new File("C:\\Users\\Admin\\Documents\\AutomationTestData.xlsx");
      
      FileInputStream fis = new FileInputStream(file);
      
      XSSFWorkbook xsf = new XSSFWorkbook(fis);
      
      Sheet sheet = xsf.getSheet("sheet1");
      
      Row row = sheet.getRow(4);
      
      Cell cell = row.getCell(4);
      
      String val =cell.getStringCellValue();
      
      System.out.println(val);
      
      xsf.close();
		
	}

}
