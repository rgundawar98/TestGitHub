package SeleniumPractices;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class handlingAlertBoxes {

	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver","C:/Users/Admin/Downloads/chromedriver_win32 (1)/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		

		driver.get("https://softwaretestingplace.blogspot.com/2017/03/javascript-alert-test-page.html");
		
		driver.findElement(By.xpath("//button[text()='Try it']")).click();
		Thread.sleep(2000);

		Alert alert = driver.switchTo().alert();
				
		System.out.println("Alert message is - " +alert.getText());
		
//		alert.accept();//accepts the pop up click on ok
  		
		alert.dismiss(); // cancels the alert box  click on cancel
	}

}
