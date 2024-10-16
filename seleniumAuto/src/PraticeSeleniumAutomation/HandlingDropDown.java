package PraticeSeleniumAutomation;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class HandlingDropDown {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Automation\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		String url = "https://demoqa.com/select-menu";
		// Launch the application
		driver.get(url);
		// Maximize the application
		driver.manage().window().maximize();
		
		
//		WebElement dropdown = driver.findElement(By.id("oldSelectMenu"));
//		
//		Select cDropdown = new Select(dropdown);
//		cDropdown.selectByVisibleText("Green");
		
//		WebElement dropdown = driver.findElement(By.id("cars"));
//		Select cDropdown = new Select(dropdown);
//		if(cDropdown.isMultiple()) {
//			cDropdown.selectByIndex(1);
//			cDropdown.selectByIndex(2);
//		}
		
//		WebElement dropdown = driver.findElement(By.id("oldSelectMenu"));
//		Select cDropdown = new Select(dropdown);
//		
//		List<WebElement> allLink = cDropdown.getOptions();
//		int size = allLink.size();
//		
//		for(int i=0;i<size;i++) {
//			String data = allLink.get(i).getText();
//			System.out.println(data);
//		}
		
		List<WebElement> allLink = driver.findElements(By.tagName("a"));
		for(WebElement all : allLink) {
			System.out.println(all.getText()+" "+all.getAttribute("href"));
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
