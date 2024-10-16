package Pratice;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Ewait {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "C:\\Automation\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		
		String url = "https://magnus.jalatechnologies.com/";
		driver.get(url);
		driver.manage().window().maximize();
		
		WebDriverWait myWaits = new WebDriverWait(driver,Duration.ofSeconds(20));
		
		WebElement username = driver.findElement(By.xpath("//input[@id='UserName']"));
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("arguments[0].setAttribute('value','training@jalaacademy.com')", username);
		
		
		WebElement textPassword = myWaits.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@id='Password']")));
		textPassword.sendKeys("jobprogram");
		
		WebElement loginSmt = myWaits.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[@id='btnLogin']")));
		loginSmt.click();
		

	}

}
