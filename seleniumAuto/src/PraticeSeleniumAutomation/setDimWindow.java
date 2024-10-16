package PraticeSeleniumAutomation;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class setDimWindow {
	public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver", "C:\\Automation\\Driver\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
//	String url = "https://demoqa.com/select-menu";
//	// Launch the application
//	driver.get(url);
//	// Maximize the application
//	Dimension d = new Dimension(100,200);
//	driver.manage().window().setSize(d);
//	driver.manage().window().maximize();
	
	
	String url = "https://demoqa.com/text-box";
//	// Launch the application
	driver.get(url);
	
	
	JavascriptExecutor js = (JavascriptExecutor)driver;
	js.executeScript("document.getElementById('userName').value='susant'");
	
	}

}
