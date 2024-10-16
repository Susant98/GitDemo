package seleniumLauch;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class waitBar {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Automation\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		String url = "https://demoqa.com/progress-bar";
		// Launch the application
		driver.get(url);
		// Maximize the application
		driver.manage().window().maximize();
		
//		WebElement resetBtn;
//		
//		driver.findElement(By.id("startStopButton")).click();
//		
//		//WebDriverWait wait = new WebDriverWait(driver,20);
//		WebDriverWait wait = new WebDriverWait(driver,  Duration.ofSeconds(20));
//		resetBtn = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("resetButton")));
//		resetBtn.click();
		
		// Click on Start Button 
//				driver.findElement(By.xpath("//button[text()='Start']")).click();
//				WebElement startStopButton = wait.until(ExpectedConditions.elementToBeClickable(By.id("startStopButton")));
//				startStopButton.click();
//				Thread.sleep(4000);
//				// Declaring the reset webelement
//				WebElement resetBtn ;
				
//				// Explicit Wait for maximum of 20 seconds until the expected condition is met
//		
//				WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(20));
//				WebElement startStopButton = wait.until(ExpectedConditions.elementToBeClickable(By.id("startStopButton")));
//				startStopButton.click();
//				//resetBtn = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("resetButton")));	
//				
//				// Click on Reset Button
//				//resetBtn.click();
//				System.out.println("Reset button is clicked");
		
		
		
		
		
		
		WebElement startStopButton = driver.findElement(By.id("startStopButton"));
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", startStopButton);
		startStopButton.click();
		
		WebElement resetBtn ;
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(20));
		resetBtn = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("resetButton")));
		resetBtn.click();
		

	}

}
