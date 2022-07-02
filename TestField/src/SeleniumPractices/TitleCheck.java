package SeleniumPractices;

import org.openqa.selenium.chrome.ChromeDriver;

public class TitleCheck {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver" ,"C:/Users/Admin/Downloads/chromedriver_win32 (1)/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		//Navigate to the browser
		driver.get("https://www.selenium.dev");
        //read the title and check the title
		String title = driver.getTitle();
		
		if("Selenium" .equals(title))
		{
			System.out.print("Titles match ,Test case passed");
			
		}
		else{
			System.out.print("Titles do not match ,Test case failed");
		}
		driver.close();
	}

}
