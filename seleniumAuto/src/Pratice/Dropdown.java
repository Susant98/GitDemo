package Pratice;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Dropdown {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Automation\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		String url = "https://www.google.com/";
		driver.get(url);
		driver.manage().window().maximize();
		
		driver.findElement(By.name("q")).sendKeys("selenium");
		Thread.sleep(4000);
		
		List<WebElement> allLink = driver.findElements(By.xpath("//ul[@role='listbox']//div[@role='option']"));	
		
		for(int i=0;i<allLink.size();i++) {
			String link = allLink.get(i).getText();
			
			if(link.equals("selemium")) {
				allLink.get(i).click();
				break;
			}
		}
		
		

	}

}
