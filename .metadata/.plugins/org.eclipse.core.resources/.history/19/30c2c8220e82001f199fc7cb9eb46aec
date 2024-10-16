package SDET_pavan;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Example {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Automation\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		String url = "https://www.facebook.com/";
		// Launch the application
		driver.get(url);
		// Maximize the application
		driver.manage().window().maximize();
		
		WebElement enteremail = driver.findElement(By.id("email"));
		enteremail.click();
		enteremail.sendKeys("bhardwaj26poonam@gmail.com");
		
		WebElement enterpswd = driver.findElement(By.id("pass"));
		enterpswd.click();
		enterpswd.sendKeys("bhardwaj26poonam@gmail.com");
		
		WebElement login = driver.findElement(By.name("login"));
		login.click();		
		

	}

}
