package SeleniumPractices;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDowntest {

	public static void main(String[] args) 
	{
		System.out.println("Main Started");
		System.setProperty("webdriver.chrome.driver","C:/Users/Admin/Downloads/chromedriver_win32 (1)/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		
		driver.get("https://www.facebook.com/reg/");
		WebElement month= driver.findElement(By.id("month"));
		Select sel = new Select(month);
		//By using of the select method below we can get the webelement
//		sel.selectByIndex(10);
//		sel.selectByValue("4");
		sel.selectByVisibleText("Dec");

		
	}

}
