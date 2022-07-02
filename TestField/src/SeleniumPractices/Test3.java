package SeleniumPractices;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test3 {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver" ,"C:/Users/Admin/Downloads/chromedriver_win32 (1)/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
//		WebElement text=driver.findElement(By.id("u_0_j_jN"));
//		text.sendKeys("Rahul");

		WebElement btn = driver.findElement(By.id("u_0_d_cY"));
		System.out.println("GText of Button" +btn.getText());
	}

}
