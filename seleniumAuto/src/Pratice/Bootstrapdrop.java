package Pratice;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Bootstrapdrop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Automation\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		String url = "https://www.jquery-az.com/boots/demo.php?ex=14.0_5";
		driver.get(url);
		driver.manage().window().maximize();
		
		
		driver.findElement(By.xpath("//a[contains(text(),'Web')]")).click();
		
		List<WebElement> options = driver.findElements(By.xpath("//ul[@class='dropdown-menu']/li"));
		
		for(WebElement option : options) {
			System.out.println(option.getText());
			String data = option.getText();
			
			if(data.equals("HTML")) {
				option.click();
				break;
			}
		}
		driver.quit();

	}

}
