package selenium4_sampleTestNGProgram;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class SampleTestNGProgram {
  @Test
  public void launchApplication() {

		// Set the system property for the chrome driver
	  System.setProperty("webdriver.chrome.driver", "C:\\Automation\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		String url = "https://www.nextgenacademy.info/";
		// Launch the application
		driver.get(url);
		// Maximize the application
		driver.manage().window().maximize();	
	}

 
}
