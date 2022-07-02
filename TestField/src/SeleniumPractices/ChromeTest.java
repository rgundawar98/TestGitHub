package SeleniumPractices;

import org.openqa.selenium.chrome.ChromeDriver;

public class ChromeTest {

	public static void main(String[] args) {
		
	System.setProperty("webdriver.chrome.driver" ,"C:/Users/Admin/Downloads/chromedriver_win32 (1)/chromedriver.exe");
	ChromeDriver driver = new ChromeDriver();
	driver.get("https://www.instagram.com/accounts/login/");

	}

}
