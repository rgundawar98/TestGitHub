package SeleniumPractices;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class ActionsClassMethods {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",
				"C:/Users/Admin/Downloads/chromedriver_win32 (1)/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();

		driver.manage().window().maximize();

		// The below methods are for mouse hover
		driver.get("https://opensource-demo.orangehrmlive.com/index.php/auth/login");
		driver.findElement(By.id("txtUsername")).sendKeys("admin");
		driver.findElement(By.id("txtPassword")).sendKeys("admin123");
		driver.findElement(By.id("btnLogin")).click();
		Actions act = new Actions(driver);
		WebElement admin = driver.findElement(By.xpath("//*[@id='menu_admin_viewAdminModule']/b"));
		WebElement userM = driver.findElement(By.xpath("//a[@id='menu_admin_UserManagement']"));
		WebElement users = driver.findElement(By.xpath("//a[@id='menu_admin_viewSystemUsers']"));
		// Below three Actions class element through we can hover the webElement
		// act.moveToElement(admin).build().perform();
		// act.moveToElement(userM).build().perform();
		// act.moveToElement(users).click().build().perform();

		//Instead of the above three methods, we can also write as like below
//		act.moveToElement(admin).moveToElement(userM).moveToElement(users).click().build().perform();

		// By using of contextClick() method we can right click on a particular
		// WebElement
		
//		Action all = act.moveToElement(admin).moveToElement(userM).contextClick(userM).build();
//		all.perform();
		
		//double click
		Action all= act.moveToElement(admin).moveToElement(userM).moveToElement(users).doubleClick().build();
		all.perform();
		
		
		

	}

}

// driver.get("https://www.shoppersstop.com/");
// Actions act= new Actions(driver);
// WebElement target=driver.findElement(By.xpath("//a[text()='BARGAINS']"));
// //To hover a mouse through an WebElement, we use below method
// act.moveToElement(target).build().perform();
//

// WebElement target2=driver.findElement(By.xpath("//*[text()='Footwear']"));

// Thread.sleep(2000);
// act.moveToElement(target2).perform();
