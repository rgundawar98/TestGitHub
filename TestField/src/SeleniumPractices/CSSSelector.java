package SeleniumPractices;

import java.util.List;

//import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
//import org.openqa.selenium.Keys;
//import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CSSSelector {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver" ,"C:/Users/Admin/Downloads/chromedriver_win32 (1)/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
        
		//To Maximize the webdriver window
		driver.manage().window().maximize();
		
//		driver.get("https://www.airbnb.co.in/");
		
		driver.get("https://stackoverflow.com/users/login");
		
		WebElement email = driver.findElement(By.id("email"));
		email.sendKeys("rahulgundawar98@gmail.com");
		
		WebElement password = driver.findElement(By.name("password"));
		password.sendKeys("RAHUL@1234");
		
//		driver.findElement(By.className("flex--item s-btn s-btn__primary")).click();
		

//		WebElement location = driver.findElement(By.className("i1d0r31c dir dir-ltr" ));
//		location.sendKeys("Goa" , Keys.ENTER);
		
		List<WebElement> links = driver.findElements(By.tagName("a"));
		System.out.println("Total anchor tags" + links.size());
		
		for(WebElement link: links)
		{
			System.out.println(link.getText());
		}
		
        //If we have to find the webelemnet through id then we can write as,
		//driver.findElement(By.cssselector("input[id = email]")).sendkeys("rahul");
		
		
		//Cssselector use of tag and id and when we use this we have to make sure that in the middle of a 
		//tag and id is you have to use '#' 
		driver.findElement(By.cssSelector("button#submit-button")).click();
		
		Thread.sleep(2000);
		
		//Cssselector use of tag and attribute and while using this selector we have to write the name of attribute
		//inside the brace
		WebElement searchbox = driver.findElement(By.cssSelector("input[name='q']"));
		searchbox.sendKeys("Selenium");
		searchbox.sendKeys(Keys.ENTER);
		
		//Cssselector use of tag and class while using this you have to use dot(.) inside this tag and classname selector
		driver.findElement(By.cssSelector("svg.svg-icon.iconStackExchange")).click();
		
		//cssselector for tag class and attribute
		driver.findElement(By.cssSelector("a.js-gps-track[href='https://stackoverflow.com/users/logout']")).click();
		
		
	}

}
