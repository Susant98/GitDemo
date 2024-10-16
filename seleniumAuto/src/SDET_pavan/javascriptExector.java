package SDET_pavan;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class javascriptExector {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Automation\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		String url = "https://vinothqaacademy.com/demo-site/";
		driver.get(url);
		driver.manage().window().maximize();
		
		
		WebElement username = driver.findElement(By.name("vfb-5"));
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("arguments[0].setAttribute('value','susant')", username);
		
		
		//click method using JS
		WebElement radioBtn = driver.findElement(By.id("vfb-31-2"));
		js.executeScript("arguments[0].click()", radioBtn);
		
		
		//scroll down page using pixel
	//	js.executeScript("window.scrollBy(0,2000)", " ");
		
		
		//scroll down page till element is visible
	//	WebElement ele = driver.findElement(By.xpath("//div[text()='© Copyright [2018-2023]. All Rights Reserved. ']"));
	//	js.executeScript("arguments[0].scrollIntoView();", ele);
		
		
		
		//scroll page till end of page
		//js.executeScript("window.scrollBy(0,document.body.scrollHeight)");
		
		
		
		//zoom in zoomout using js
		js.executeScript("document.body.style.zoom='70%'");
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
