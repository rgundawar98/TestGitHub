package SeleniumPractices;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class XpathDynamicvalue {

	public static void main(String[] args) 
	{
	 SelectGender("Male");	
	}
	public static void SelectGender(String gender)
	{
		System.setProperty("webdriver.chrome.driver" ,"C:/Users/Admin/Downloads/chromedriver_win32 (1)/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://en-gb.facebook.com/reg/");
		//It will render towards the female radiobutton 
		WebElement radiobtn = driver.findElement(By.xpath("//label[text()='"+gender+"']/preceding::input[1]"));
		radiobtn.click();
	}

}
