package seleniumLauch;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.io.FileHandler;

public class captureScreenshot {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
System.setProperty("webdriver.chrome.driver", "C:\\Automation\\Driver\\chromedriver.exe");
		
		
		ChromeOptions co = new ChromeOptions();
		co.setAcceptInsecureCerts(true);
		
		
		WebDriver driver = new ChromeDriver(co);
		String url = "https://expired.badssl.com/";
		// Launch the application
		driver.get(url);
		// Maximize the application
		driver.manage().window().maximize();
		

		TakesScreenshot srcset = (TakesScreenshot) driver;
		File file = srcset.getScreenshotAs(OutputType.FILE);
		FileHandler.copy(file,new File("C:\\Users\\om\\eclipse-workspace\\seleniumAuto\\screenshot\\py.jpeg"));
//		  try {
//	            FileHandler.copy(file, new File("\\homePageScreenshot.png"));
//	        } catch (IOException e) {
//	            System.out.println(e.getMessage());
//	        }
		

	}

}
