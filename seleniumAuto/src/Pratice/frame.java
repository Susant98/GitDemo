package Pratice;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class frame {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Automation\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		
		String url = "https://ui.vision/demo/webtest/frames/";
		driver.get(url);
		driver.manage().window().maximize();
		
		
		WebElement frame4 = driver.findElement(By.xpath("//frame[@src='frame_4.html']"));
		driver.switchTo().frame(frame4);
		
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(20));
		WebElement user = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@name='mytext4']")));
		user.sendKeys("susanta");
		
		driver.switchTo().defaultContent();
		
		WebElement frame3 = driver.findElement(By.xpath("//frame[@src='frame_3.html']"));
		driver.switchTo().frame(frame3);
		
		WebElement user2 = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@name='mytext3']")));
		user2.sendKeys("kumar");
		
		driver.switchTo().frame(0);
		Thread.sleep(5000);
		WebElement ele = driver.findElement(By.xpath("//div[@id='i19']//div[@class='PkgjBf MbhUzd']"));
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("arguments[0].click();", ele);
		
		

	}

}
