package SDET_pavan;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingSVGElement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "C:\\Automation\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		String url = "https://www.tutorialspoint.com/index.htm";
		driver.get(url);
		driver.manage().window().maximize();
		
		
		driver.findElement(By.xpath("//ul[@class='flex-group accent-nav__right-list']//li[4]//a[1]//*[name()='svg']")).click();
	}

}
