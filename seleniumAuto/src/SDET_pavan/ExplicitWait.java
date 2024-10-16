package SDET_pavan;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ExplicitWait {

	public static void main(String[] args) {
	
		System.setProperty("webdriver.chrome.driver", "C:\\Automation\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		WebDriverWait myWait = new WebDriverWait(driver,Duration.ofSeconds(20));
		
		
		String url = "https://opensource-demo.orangehrmlive.com/auth/login";
		driver.get(url);
		driver.manage().window().maximize();
		

		
		WebElement textUserName = myWait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@placeholder='username']")));
		textUserName.sendKeys("Admin");
		
		WebElement textPassword = myWait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@placeholder='password']")));
		textPassword.sendKeys("admin123");
		
		WebElement loginSmt = myWait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[@type='submit']")));
		loginSmt.click();

	}

}
