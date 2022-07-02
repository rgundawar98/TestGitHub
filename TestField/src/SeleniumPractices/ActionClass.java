package SeleniumPractices;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
//import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class ActionClass {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver","C:/Users/Admin/Downloads/chromedriver_win32 (1)/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();

		driver.manage().window().maximize();
//		driver.get("https://www.facebook.com/login/");
//		Actions act = new Actions(driver);
//		WebElement user = driver.findElement(By.id("email"));
		//To hold the below method we have to use with help of actions(interface) we can use 
//		Action all =act.sendKeys(user, "Rahul").sendKeys(Keys.SHIFT).sendKeys("gundawar").build();
//		all.perform();
		driver.get("https://www.google.com/");
		//To perform many actions in one line we use Actions class
		Actions act = new Actions(driver);
		WebElement search = driver.findElement(By.name("q"));
		search.sendKeys("Selenium ");
		//Return type of build() method will be Action interface
		Action all =act.sendKeys(search, Keys.ARROW_DOWN).sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.ENTER).build();
		all.perform();
		
	}

}
