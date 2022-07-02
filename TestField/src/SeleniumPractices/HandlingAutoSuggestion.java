package SeleniumPractices;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingAutoSuggestion {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver","C:/Users/Admin/Downloads/chromedriver_win32 (1)/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		
		driver.get("https://www.google.com/");
		
		driver.findElement(By.name("q")).sendKeys("Selenium");
		Thread.sleep(2000);

		List<WebElement> all =driver.findElements(By.xpath("//*[contains(text(),'selenium')]"));
		
	    int size = all.size();
	    
	    System.out.println("Size of WebElement is " +size);
	    
	    for(int i=0; i<size; i++)
	    {
	    	String txt = all.get(i).getText();
	    	
	    	System.out.println(txt);
	    }
	}

}
