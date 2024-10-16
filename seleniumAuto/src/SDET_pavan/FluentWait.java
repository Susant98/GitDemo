package SDET_pavan;

import java.time.Duration;
import java.util.NoSuchElementException;
import java.util.function.Function;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FluentWait {

	public FluentWait(WebDriver driver) {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "C:\\Automation\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
//		Wait<WebDriver> myWait = new FluentWait<WebDriver>(driver)
//				.withTimeOut(Duration.ofSeconds(10))
//				.pollingEvery(Duration.ofSeconds(5))
//				.ignoring(NoSuchElementException.class);
		
//	
		  org.openqa.selenium.support.ui.FluentWait<WebDriver> myWait = new FluentWait(driver)
                  .withTimeout(Duration.ofSeconds(10))
                  .pollingEvery(Duration.ofSeconds(2))
                  .ignoring(NoSuchElementException.class);
		
		
		
		
		String url = "https://opensource-demo.orangehrmlive.com/auth/login";
		driver.get(url);
		driver.manage().window().maximize();
		
		WebElement passwordField = myWait.until(new Function<WebDriver, WebElement>() {
		    public WebElement apply(WebDriver driver) {
		        return driver.findElement(By.xpath("//input[@placeholder='password']"));
		    }
		});

	}

	private org.openqa.selenium.support.ui.FluentWait<WebDriver> withTimeout(Duration ofSeconds) {
		// TODO Auto-generated method stub
		return null;
	}

}
