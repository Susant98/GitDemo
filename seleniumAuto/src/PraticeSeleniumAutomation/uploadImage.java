package PraticeSeleniumAutomation;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class uploadImage {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Automation\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		String url = "https://demoqa.com/upload-download";
		// Launch the application
		driver.get(url);
		// Maximize the application
		driver.manage().window().maximize();
		
		WebElement uploadFile = driver.findElement(By.id("uploadFile"));
		((JavascriptExecutor) driver).executeScript("arguments[0].click();", uploadFile);
		uploadFile.sendKeys("C:\\Users\\om\\Downloads\\sampleFile.jpeg");

	}

}
