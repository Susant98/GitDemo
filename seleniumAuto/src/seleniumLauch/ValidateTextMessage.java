package seleniumLauch;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class ValidateTextMessage {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Automation\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		String url = "https://vinothqaacademy.com/demo-site/";
		// Launch the application
		driver.get(url);
		// Maximize the application
		driver.manage().window().maximize();
		
		
		WebElement regTitle = driver.findElement(By.xpath("//h3[contains(text(),'Register For Demo')]"));
		
		String getregTitle = regTitle.getText();
		System.out.println(getregTitle);
		
		String exp = "Register For Demo";
		
		if(getregTitle.equals(exp)) {
			System.out.println("both are same");
		} else {
			System.out.println("both are not same");
		}

	}

}
