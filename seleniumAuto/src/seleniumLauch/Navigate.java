package seleniumLauch;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Navigate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Automation\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		String url = "https://vinothqaacademy.com/";
		// Launch the application
		driver.get(url);
		// Maximize the application
		driver.manage().window().maximize();
		
		driver.findElement(By.linkText("Tutorials")).click();
		
		driver.navigate().back();
		
		driver.navigate().forward();
		
		driver.navigate().to("https://crio-qkart-frontend-qa.vercel.app/");
		
		driver.navigate().refresh();
		
		
		
		
		
		

	}

}
