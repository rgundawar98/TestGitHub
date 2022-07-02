package SeleniumPractices;

import java.io.File;
import java.io.FileInputStream;
//import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadDataFromExcel {

	
	public static void main(String args[]) throws IOException
	{
//	  System.setProperty("log4j.configurationFile","./path_to_the_log4j2_config_file/log4j2.xml");

		
	  File file =new File("C:\\Users\\Admin\\Documents\\AutomationTestData.xlsx");
	  
	  FileInputStream fis = new FileInputStream(file);
      
	  //for .xslx we use XSSFWorkbook and for .xls file we use HSSFWoekbook 
	  XSSFWorkbook xsf = new XSSFWorkbook(fis);
	  
	  XSSFSheet sheet = xsf.getSheetAt(0);

	  Row row = sheet.getRow(4);
	  
	  Cell cell = row.getCell(4);
	  
	  String value= cell.getStringCellValue();
	  
	  System.out.println("The data in the box is" +value);
	  
	  xsf.close();
	  
	  
	  
 	}

}

//	  String entry1 = sheet.getRow(4).getCell(4).getStringCellValue();