package PraticeSeleniumAutomation;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class SSLError_handeling {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Automation\\Driver\\chromedriver.exe");
		
		
		//ChromeOptions co = new ChromeOptions();
		//co.setAcceptInsecureCerts(true);
		
		
		WebDriver driver = new ChromeDriver();
		String url = "https://expired.badssl.com/";
		// Launch the application
		driver.get(url);
		// Maximize the application
		driver.manage().window().maximize();
		
		

	}

}
