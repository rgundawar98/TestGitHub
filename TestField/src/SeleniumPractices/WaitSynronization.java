package SeleniumPractices;

import java.time.Duration;

//import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
//import org.openqa.selenium.support.ui.ExpectedConditions;


public class WaitSynronization {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver",
				"C:/Users/Admin/Downloads/chromedriver_win32 (1)/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();

		driver.manage().window().maximize();

		driver.get("https://www.amazon.in/");
		// We can also wait for the page load time below is the method, by the
		// below method after the page load time upto 5 minute

		// driver.manage().timeouts().pageLoadTimeout(5, TimeUnit.MINUTES);

		// Implicitly wait work for both findElement and findElements both.The
		// below line works wait synchronization upto 20 seconds for all
		// webElements
		// It takes two argument one is suration and another is TimeUnit in
		// (seconds minutes days millisecond microsecond etcs)

		// driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		// Find the webElement Today sales then click
		driver.findElement(By.xpath("//a[@href='/deals?ref_=nav_cs_gb']")).click();

		// Find the webElement sign up link  then click
		WebElement signUp = driver.findElement(By.xpath("//a[@class='sign-in-tooltip-link']"));
		
//		WebDriverWait wait = new WebDriverWait(driver ,20s);
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[@class='sign-in-tooltip-link']")));
		signUp.click();
		
		
	}
}

// In java we can also use Thread.sleep() method to wait or halt the next
// process which you have to load
// Thread.sleep(2000);