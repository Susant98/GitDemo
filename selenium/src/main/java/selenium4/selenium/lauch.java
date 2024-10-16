package selenium4.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;

public class lauch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.gecko.driver","D:\\geckodriver-v0.35.0-win32\\geckodriver.exe" ); 
		 FirefoxOptions options = new FirefoxOptions();
		 WebDriver driver = new FirefoxDriver(options);
        
       // Launch Website  
  driver.navigate().to("http://www.javatpoint.com/");  
        
      // Click on the Custom Search text box and send value  
  driver.findElement(By.id("gsc-i-id1")).sendKeys("Java");  
        
      // Click on the Search button  
driver.findElement(By.className("gsc-search-button gsc-search-buttonv2")).click();

	}

}
