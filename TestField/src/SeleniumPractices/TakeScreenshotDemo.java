package SeleniumPractices;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
//import org.openqa.selenium.WebDrier;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TakeScreenshotDemo {
//    @Test
	public void TestSCreenshot() throws IOException 
	{ 
      WebDriver driver;
      
      System.setProperty("webdriver.chrome.driver","C:/Users/Admin/Downloads/chromedriver_win32 (1)/chromedriver.exe");
	  driver = new ChromeDriver();
	  
	  driver.get("https://www.facebook.com/reg/");
	  
	  TakeScreenshotDemo.takeSnapshot(driver, "C://Users//Admin//workspace//TestField//src//SeleniumPractices");	
	}
    public static void takeSnapshot(WebDriver webdriver , String filewithpath) throws IOException
    {
    	TakesScreenshot scrshot = ((TakesScreenshot)webdriver);
    	
    	File srcfile = scrshot.getScreenshotAs(OutputType.FILE);
    	
    	File DestFile = new File(filewithpath);
    	
    	FileUtils.copyFile(srcfile, DestFile);
    	
    	
    }

}
