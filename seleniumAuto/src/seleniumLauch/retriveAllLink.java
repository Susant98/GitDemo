package seleniumLauch;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class retriveAllLink {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Automation\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		String url = "https://vinothqaacademy.com/";
		// Launch the application
		driver.get(url);
		// Maximize the application
		driver.manage().window().maximize();
		
		
		List<WebElement> allLink = driver.findElements(By.tagName("a"));
		for(WebElement link : allLink) {
			System.out.println(link.getText()+"    "+link.getAttribute("href"));
		}
		
		
		
		

	}

}
