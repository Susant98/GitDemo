package seleniumLauch;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingBrowser {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Automation\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		String url = "https://www.nextgenacademy.info/";
		// Launch the application
		driver.get(url);
		// Maximize the application
		driver.manage().window().maximize();
		
		
		String actTitle = driver.getTitle();
		System.out.println(actTitle);
		String expTitle = "NextGen Academy";
		
		if(actTitle.equals(expTitle)) {
			System.out.println("present");
		}
		else {
			System.out.println("not present");
		}


	}

}
