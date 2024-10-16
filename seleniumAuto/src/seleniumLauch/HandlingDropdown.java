package seleniumLauch;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class HandlingDropdown {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Automation\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		String url = "https://vinothqaacademy.com/demo-site/";
		// Launch the application
		driver.get(url);
		// Maximize the application
		driver.manage().window().maximize();
		
		
		
		WebElement countryDropdown = driver.findElement(By.xpath("//*[@id='vfb-13-country']"));
		
		
		String value = "Angola";
		Select cDropdown = new Select(countryDropdown);
		cDropdown.selectByVisibleText(value);
		
		int listValueThree = 5;
		cDropdown.selectByIndex(listValueThree);
		
		System.out.println("The value is"+value);
		System.out.println("The value2 is"+listValueThree);
		

	}

}
