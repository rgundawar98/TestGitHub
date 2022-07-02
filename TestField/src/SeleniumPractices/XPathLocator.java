package SeleniumPractices;

import org.openqa.selenium.By;
//import org.openqa.selenium.By;
//import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class XPathLocator {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver" ,"C:/Users/Admin/Downloads/chromedriver_win32 (1)/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
//		driver.get("https://stackoverflow.com/");
//		
//		WebElement searchbox = driver.findElement(By.xpath("/html/body/header/div/div/div/form/div/input"));
//        searchbox.sendKeys("selenium");
//        Thread.sleep(2000);
//        searchbox.sendKeys(Keys.ENTER);
		
		driver.get("https://www.facebook.com/");
		
		WebElement passwd1 =driver.findElement(By.xpath("//input[@type='password' and @id='pass']"));
		passwd1.sendKeys("pass@123");
	    Thread.sleep(2000);
	    passwd1.clear();
	    
	    
		WebElement passwd2 =driver.findElement(By.xpath("//input[@name='pass' or aria-label='Password' or class='inputtext _55r1 _6luy _9npi']"));
		passwd2.sendKeys("Pass@1234");
		Thread.sleep(2000);
	    passwd2.clear();
	    
	    
	    driver.findElement(By.xpath("//a[text()='Forgotten password?']")).click();
//		        
//		By using contains function
		
		WebElement link=driver.findElement(By.xpath("//a[contains(text(),'Forgot')]"));
		link.click();
		
		
	}

}
