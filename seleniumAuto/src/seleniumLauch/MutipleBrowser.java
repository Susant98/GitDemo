package seleniumLauch;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class MutipleBrowser {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Automation\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		String url = "https://vinothqaacademy.com/multiple-windows/";
		// Launch the application
		driver.get(url);
		// Maximize the application
		driver.manage().window().maximize();
		
		
		driver.findElement(By.xpath("//*[text()='New Browser Window']")).click();
		Thread.sleep(3000);
		driver.manage().window().maximize();
		
		Set<String> windowId = driver.getWindowHandles();			
		Iterator<String> iterator = windowId.iterator();

		
		String homePage = iterator.next();
		String newPage = iterator.next();
		
		driver.switchTo().window(newPage);
		driver.manage().window().maximize();
		Thread.sleep(3000);
		driver.findElement(By.xpath("(//a[text()='Tutorials'])[2]")).click();
		//driver.manage().window().maximize();
		
		driver.close();
		System.out.println("Child browser is closed");
		
		driver.switchTo().window(homePage);
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//*[text()='New Message Window']")).click();
		

	}

}
