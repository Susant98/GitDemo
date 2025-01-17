package SDET_pavan;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class cssSelector {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Automation\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		String url = "https://www.tutorialspoint.com/selenium/practice/selenium_automation_practice.php";
		// Launch the application
		driver.get(url);
		// Maximize the application
		driver.manage().window().maximize();
		
		//driver.findElement(By.cssSelector("div#search")).sendKeys("HP"); //it will work with id
		//tag#id
		driver.findElement(By.cssSelector("input#email")).sendKeys("raja@gmail.com");
		driver.findElement(By.cssSelector("#email")).sendKeys("raja@gmail.com");
		//tag.className
		driver.findElement(By.cssSelector("input.form-control")).sendKeys("raja@gmail.com");
		driver.findElement(By.cssSelector(".form-control")).sendKeys("raja@gmail.com");
		
		//tag attribute
		driver.findElement(By.cssSelector("input[placeholder='Enter Mobile Number']")).sendKeys("123456789");


	}

}
