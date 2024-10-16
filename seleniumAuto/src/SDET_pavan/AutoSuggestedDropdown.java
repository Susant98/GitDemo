package SDET_pavan;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AutoSuggestedDropdown {

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
		
		List<WebElement> options = driver.findElements(By.xpath("//ul[@role='listbox']//div[@role='option']"));
		int size = options.size();
		
		for(int i=0;i<=size;i++) {
			String total_data = options.get(i).getText();
			System.out.println(total_data);
			if(total_data.equals("selenium")) {
				options.get(i).click();
				break;
			}
		}
		
		
	}

}
