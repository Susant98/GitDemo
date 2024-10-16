package seleniumLauch;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingAuth {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Automation\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		String url = "http://admin:admin@the-internet.herokuapp.com/basic_auth";
		// Launch the application
		driver.get(url);
		// Maximize the application
		driver.manage().window().maximize();
		
		
		WebElement message = driver.findElement(By.xpath("//p[contains(text(),'Congratulations! You must have the proper credentials.')]"));
		
		String actMsg = message.getText();
		String expMsg = "Congratulations! You must have the proper credentials.";
		
		if(actMsg.equals(expMsg)) {
			System.out.println("both are same");
		}else {
			System.out.println("both are not same");
		}
		
		
		

	}

}
