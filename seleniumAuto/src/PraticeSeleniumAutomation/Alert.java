package PraticeSeleniumAutomation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alert {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Automation\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		String url = "https://softwaretestingplace.blogspot.com/2017/03/javascript-alert-test-page.html#http://softwaretestingplace.blogspot.com/p/automation-testing.html";
		// Launch the application
		driver.get(url);
		// Maximize the application
		driver.manage().window().maximize();
		
		
		WebElement alertBox = driver.findElement(By.xpath("//button[text()='Try it']"));
		alertBox.click();
		
		String data = driver.switchTo().alert().getText();
		System.out.println(data);
		
	    driver.switchTo().alert().accept();
		

	}

}
