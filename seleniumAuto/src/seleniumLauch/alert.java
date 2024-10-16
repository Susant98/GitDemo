package seleniumLauch;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import SDET_pavan.Alert1;

public class alert {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Automation\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		WebDriverWait myWait = new WebDriverWait(driver,Duration.ofSeconds(10));
		String url = "https://vinothqaacademy.com/alert-and-popup/";
		// Launch the application
		driver.get(url);
		// Maximize the application
		driver.manage().window().maximize();
		
//		WebElement alertBox = driver.findElement(By.xpath("//button[text()='Alert Box']"));
//		alertBox.click();
//		String alertData = driver.switchTo().alert().getText();
//		System.out.println(alertData);
//		driver.switchTo().alert().accept();
//		
//		Thread.sleep(4000);
//		driver.close();
		
//		WebElement ConfalertBox = driver.findElement(By.xpath("//button[text()='Confirm Alert Box']"));
//		ConfalertBox.click();
//		String alertData = driver.switchTo().alert().getText();
//		System.out.println(alertData);
//		//driver.switchTo().alert().accept();
//		
//		driver.switchTo().alert().dismiss();
//		driver.close();
		
		//((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView();", ele);
		
		
		
//		WebElement promptAlertBox = driver.findElement(By.xpath("//button[text()='Prompt Alert Box']"));
//		promptAlertBox.click();
//		
//		Alert alert = driver.switchTo().alert();
//		String text = driver.switchTo().alert().getText();
//		System.out.println(text);
//		
//		alert.sendKeys("Yes");
//		alert.accept();
		
        driver.findElement(By.name("confirmalertbox")).click();
		
		Alert myalert =myWait.until(ExpectedConditions.alertIsPresent());
		System.out.println(myalert.getText());
		myalert.accept();
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
