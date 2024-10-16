package seleniumLauch;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingTextBox {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Automation\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		String url = "https://vinothqaacademy.com/demo-site/";
		// Launch the application
		driver.get(url);
		// Maximize the application
		driver.manage().window().maximize();
		
		String firstNameValue = "susant";
		
		WebElement firstName = driver.findElement(By.id("vfb-5"));
		
		if(firstName.isDisplayed()) {
			System.out.println("First Name is displayed");
		} else {
			System.out.println("First Name is not displayed");
		}
		
		
		// Verify the first name is enabled or not
		if(firstName.isEnabled()) {
		System.out.println("First Name is enabled");
		// Enter the First Name
		firstName.sendKeys(firstNameValue);
		System.out.println("First Name is " + firstNameValue);
		}
		else
		{
		System.out.println("First Name is not enabled");
		}

		
		firstName.sendKeys(firstNameValue);
		

	}

}
