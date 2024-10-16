package seleniumLauch;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class HandlingMultipleSelect {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Automation\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		String url = "https://www.softwaretestingmaterial.com/sample-webpage-to-automate/";
		// Launch the application
		driver.get(url);
		// Maximize the application
		driver.manage().window().maximize();
		
		
		WebElement multiSelect = driver.findElement(By.xpath("//select[@class='spTextField' and @size='4']"));
		
		Select multi = new Select(multiSelect);
		multi.selectByVisibleText("Performance Testing");
		multi.selectByVisibleText("Selenium");
//		multi.selectByValue("");
//		multi.selectByIndex(5);
//		
//		
//		Thread.sleep(4000);
//		
//		multi.deselectByVisibleText("");
//		
//		driver.close();
		

	}

}
