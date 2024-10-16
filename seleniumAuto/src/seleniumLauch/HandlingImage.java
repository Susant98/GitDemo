package seleniumLauch;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingImage {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Automation\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		String url = "https://vinothqaacademy.com";
		// Launch the application
		driver.get(url);
		// Maximize the application
		driver.manage().window().maximize();
		
		
		WebElement Img = driver.findElement(By.xpath("//img[@alt='Vinoth Q.A Academy']"));
		
		if(Img.isDisplayed()) {
			System.out.println("robot img is displayed");
			
			String robot = Img.getAttribute("alt");
			System.out.println("all alt is displayed" +robot);
		}  else {
			System.out.println("robot img is not displayed");
		}
		

	}

}
