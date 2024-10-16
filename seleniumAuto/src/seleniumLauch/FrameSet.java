package seleniumLauch;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FrameSet {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Automation\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		String url = "https://www.selenium.dev/selenium/docs/api/java/index.html?org/openqa/selenium/package-summary.html";
		// Launch the application
		driver.get(url);
		// Maximize the application
		driver.manage().window().maximize();
		
		
//		driver.switchTo().frame(0);
//		
//		driver.findElement(By.xpath("//a[text()='org.openqa.selenium.chrome']")).click();
//		Thread.sleep(3000);
//		driver.switchTo().defaultContent();
		
driver.switchTo().frame(0);
		Thread.sleep(3000);
		// Click on org.openqa.selenium.chrome link
		driver.findElement(By.xpath("//a[text()='org.openqa.selenium.chrome']")).click();
		System.out.println("Selenium Chrome link clicked");

//		
//		
//        driver.switchTo().frame(1);
//		driver.findElement(By.xpath("//*[text()='ChromeOptions']")).click();
//		driver.switchTo().defaultContent();
//		
//		 driver.switchTo().frame(2);
//			
//			driver.findElement(By.xpath("//a[text()='Help']")).click();
		
		
		

	}

}
