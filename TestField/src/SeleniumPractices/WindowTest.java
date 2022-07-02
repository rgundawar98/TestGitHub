package SeleniumPractices;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowTest {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver",
				"C:/Users/Admin/Downloads/chromedriver_win32 (1)/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();

		driver.get("https://en-gb.facebook.com/reg/");

		WebElement terms = driver.findElement(By.id("terms-link"));
		terms.click();
        //To handle multiple windows in Selenium we have to use two methods getWindowHandle() and getWindowHandles()
		String mainWindow = driver.getWindowHandle();
	    Set<String> all = driver.getWindowHandles();
	    Iterator<String> it =all.iterator();
	    while(it.hasNext())
	    {
	    	String childWindow =it.next();
	    	if(!mainWindow.equals(childWindow))
	    	{
	    		//To switch from one window to another we uses driver.switchTo().window() method
	    		driver.switchTo().window(childWindow);
	    		WebElement btn = driver.findElement(By.xpath("//a[@href='/r.php?locale=en_GB']"));
	    		btn.click();
	    		driver.switchTo().window(mainWindow);
	    		WebElement fname =driver.findElement(By.name("firstname"));
	    		fname.sendKeys("Rupali");
	    		
//	    		WebElement lname =driver.findElement(By.name("lastname"));
//	    		lname.sendKeys("Gundawar");
	      
	    	//To print the third window of grandchild
	      WebElement terms2 = driver.findElement(By.id("terms-link"));
	      terms2.click();
	      Thread.sleep(2000);
	            		
          Set<String> all2 = driver.getWindowHandles();
          
	      Iterator<String> it2 = all2.iterator();
	      
	      while(it2.hasNext())
	      {
	    	  String grandchild = it.next();
	    	  if(!grandchild.equals(mainWindow) && !grandchild.equals(childWindow))
	    	  {
	    		  driver.switchTo().window(grandchild);
	    	  }
	      }
	    		
	    		
	    	}
	    }
	   
	}

}
