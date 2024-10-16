package SDET_pavan;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingCheckbox {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Automation\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		String url = "https://demo.guru99.com/test/radio.html";
		// Launch the application
		driver.get(url);
		driver.manage().window().maximize();
		
	//	driver.findElement(By.xpath("//input[@id='vfb-6-0']")).click();
		
		List<WebElement> allBox = driver.findElements(By.xpath("//input[@type='checkbox']"));
//		for(WebElement all : allBox) {
//			System.out.println(all);
//			all.click();
//		}
		
		//I want to select last checkbox
		for(int i=2;i<allBox.size();i++) {
			allBox.get(i).click();
		}

	}

}
