package Pratice;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class CShot {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Automation\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		String url = "https://vinothqaacademy.com/demo-site/";
		driver.get(url);
		driver.manage().window().maximize();
		
		
		WebElement featureFile = driver.findElement(By.xpath("//fieldset[@id='item-vfb-2']"));

		File file = featureFile.getScreenshotAs(OutputType.FILE);
		FileHandler.copy(file, new File("C:\\Users\\om\\eclipse-workspace\\seleniumAuto\\screenshot\\py.jpeg"));

	}

}
