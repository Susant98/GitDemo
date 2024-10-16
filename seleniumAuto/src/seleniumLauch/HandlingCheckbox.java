package seleniumLauch;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingCheckbox {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Automation\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		String url = "https://vinothqaacademy.com/demo-site/";
		// Launch the application
		driver.get(url);
		// Maximize the application
		driver.manage().window().maximize();
		
		
		WebElement testNGChckBox = driver.findElement(By.id("vfb-20-0"));
		
		
		if(testNGChckBox.isDisplayed()) {
			System.out.println("TestNG Checkbox is displayed");
			}
			else
			{
			System.out.println("TestNG Checkbox is not displayed");
			}
			// Verify the TestNG Checkbox is enabled
			if(testNGChckBox.isEnabled()) {
			System.out.println("TestNG Checkbox is enabled");
			}
			else
			{
			System.out.println("TestNG Checkbox is not enabled");
			}
			// Verify the TestNG Checkbox is selected or not.
			if(testNGChckBox.isSelected()) {
			System.out.println("TestNG Checkbox is selected");
			}
			else {
				testNGChckBox.click();
				
			}


	}

}
