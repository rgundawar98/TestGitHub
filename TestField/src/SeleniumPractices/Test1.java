package SeleniumPractices;

//import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test1 {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver" ,"C:/Users/Admin/Downloads/chromedriver_win32 (1)/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		//By use of get("url") method you can only get the particular url entered into the  url space
		driver.get("https://www.facebook.com/reg/");
		//By use of navigate().to("url") method you'll get the particular url and you can do the 
//		backword,forword,refresh also
//		driver.navigate().to("https://www.facebook.com/");
		
//		driver.navigate().back();
//		driver.navigate().forward();
//		driver.navigate().refresh();
//		WebElement forgetlink = driver.findElement(By.linkText("Forgotten password?"));
//		forgetlink.click();
//		List<WebElement> list = driver.findElements(By.tagName("a"));
//		for(WebElement l:list)
//		{
//			//To get all <a> tag specified links you have to use the method as  getAttribute() with the webElement
//			System.out.println(l.getAttribute("href"));
//		}
		

//		WebElement radiobutton = driver.findElement(By.xpath("//label[text()='Female']/../input"));
//		radiobutton.click();
		
//		//Forword traversal Xpath
//		WebElement radiobutton = driver.findElement(By.xpath("//label[text()='Female']/../../span[2]/input"));
//		radiobutton.click();
			
		//click from men to radio on female by using of preceding method
		WebElement radiobtn = driver.findElement(By.xpath("//font[text()='Men']/preceding::input[1]"));
	    radiobtn.click();		
	    
	    //by using following method
	    WebElement link=driver.findElement(By.xpath("//font[text()='Log in']/following::a[1]"));
	    link.click();
		
		
	}

}
