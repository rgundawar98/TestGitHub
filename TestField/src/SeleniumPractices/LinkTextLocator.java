package SeleniumPractices;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LinkTextLocator {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver","C:/Users/Admin/Downloads/chromedriver_win32 (1)/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();

		driver.get("https://stackoverflow.com/users/login");

		WebElement email = driver.findElement(By.id("email"));
		email.sendKeys("rahulgundawar98@gmail.com");

		WebElement password = driver.findElement(By.name("password"));
		password.sendKeys("RAHUL@1234");

		driver.findElement(By.cssSelector("button#submit-button")).click();

		driver.findElement(By.cssSelector("svg.svg-icon.iconStackExchange")).click();

		driver.findElement(By.cssSelector("a.js-gps-track[href='https://stackoverflow.com/users/logout']")).click();

		// In LinkText we provide full link of that string
		driver.findElement(By.linkText("stackexchange.com")).click();

		// In partialLinkText we provide string name of that link
		driver.findElement(By.partialLinkText("sites")).click();

	}

}
