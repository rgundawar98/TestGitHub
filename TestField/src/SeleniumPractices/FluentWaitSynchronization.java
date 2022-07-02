package SeleniumPractices;

import java.time.Duration;
import java.util.NoSuchElementException;
//import java.util.concurrent.TimeUnit;
import java.util.function.Function;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;

public class FluentWaitSynchronization {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver",
				"C:/Users/Admin/Downloads/chromedriver_win32 (1)/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();

		driver.get("https://www.google.com/");

//		driver.manage().window().maximize();

		// Searching for the element which is in another page
		WebElement search = driver.findElement(By.name("q"));
		search.sendKeys("selenium");
		search.sendKeys(Keys.ENTER);

		//Fluent wait example
		Wait<WebDriver> wait = new FluentWait<WebDriver>(driver)
			       .withTimeout(Duration.ofSeconds(30))
			       .pollingEvery(Duration.ofSeconds(5))
			       .ignoring(NoSuchElementException.class);

			   WebElement SeleniumNPMLink = wait.until(new Function<WebDriver, WebElement>() {
			     public WebElement apply(WebDriver driver) 
			     {
			       return driver.findElement(By.xpath("//*[text()='selenium-webdriver - npm']"));
			     }
			   });
			   
			   SeleniumNPMLink.click();
			   
		
//		WebElement search2 = driver.findElement(By.linkText("selenium-webdriver - npm"));
//		search2.click();//will get NoSuchElementException here
		driver.close();

	}

}
