package Pratice;

import java.net.HttpURLConnection;
import java.net.URL;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Broken {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Automation\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		String url = "http://www.deadlinkcity.com/";
		driver.get(url);
		driver.manage().window().maximize();
		
		List<WebElement> allLink = driver.findElements(By.tagName("a"));
		for(WebElement link : allLink) {
			String hrefAttValue = link.getAttribute("href");
			
			
			if(hrefAttValue==null || hrefAttValue.isEmpty()) {
	    		System.out.println("href att value is null not possible to click");
                continue;
			}
			try {
				
				URL openURL = new URL(hrefAttValue);
				HttpURLConnection conn = (HttpURLConnection) openURL.openConnection();
				conn.connect();
				
				if(conn.getResponseCode()>=400) {
					System.out.println(hrefAttValue + "====>Broken Link");
				} else {
					System.out.println(hrefAttValue + "====>not a Broken Link");
				}
				
				
			}catch(Exception e) {}
		}

	}

}
