package SeleniumPractices;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo1 {

	public static void main(String[] args, WebElement link) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver" ,"C:/Users/Admin/Downloads/chromedriver_win32 (1)/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		
		driver.get("https://www.facebook.com/");
		
		//we can write for the id webElement by two ways
//		driver.findElement(By.cssSelector("input[id=email]")).sendKeys("rahulgundawar@gmail.com");
//		driver.findElement(By.cssSelector("input#email")).sendKeys("rahulgundawar@gmail.com");
		
		//for class webelement we can write as [css= tagname.AttributeValue ]
//        driver.findElement(By.cssSelector("input.inputtext _55r1 _6luy")).sendKeys("rahulgundawar@gmail.com");
		
		WebElement passwd1 =driver.findElement(By.xpath("//input[@type='password' and @id='pass']"));
		passwd1.sendKeys("pass@123");
	    Thread.sleep(2000);
	    passwd1.clear();
	    
	    
		WebElement passwd2 =driver.findElement(By.xpath("//input[@name='pass' or aria-label='Password' or class='inputtext _55r1 _6luy _9npi']"));
		passwd2.sendKeys("Pass@1234");
		Thread.sleep(2000);
	    passwd2.clear();
	    
	    
	    driver.findElement(By.xpath("//a[text()='Forgotten password?']"));
		link.click();
		
		
	    
	    
	    
	    
		
	}

}
