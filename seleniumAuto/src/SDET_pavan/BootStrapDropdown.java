package SDET_pavan;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BootStrapDropdown {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Automation\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		String url = "https://www.jquery-az.com/boots/demo.php?ex=14.0_5";
		driver.get(url);
		driver.manage().window().maximize();
		
		
		driver.findElement(By.xpath("//a[contains(text(),'Web')]")).click();
		
		//driver.findElement(By.xpath("//a[text()='jQuery']")).click();
		
		
		List<WebElement> options = driver.findElements(By.xpath("//ul[@class='dropdown-menu']/li"));
		for(WebElement op : options) {
			//System.out.println(op.getText());
			
			//select multiple options
			String option = op.getText();
			
			if(option.equals("HTML") || option.equals("Bootstrap")) {
				op.click();
			}
		}

	}

}
