package SDET_pavan;

import java.net.HttpURLConnection;
import java.net.URL;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrokenLink {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "C:\\Automation\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		String url = "http://www.deadlinkcity.com/";
		driver.get(url);
		driver.manage().window().maximize();
		
		     List<WebElement> Links = driver.findElements(By.tagName("a"));
		     System.out.println("The total no of link is present "+Links.size());
		     for(WebElement LinkElement : Links) {
		    	String hrefAttValue = LinkElement.getAttribute("href");
		    	
		    	
		    	if(hrefAttValue == null || hrefAttValue.isEmpty()) {
		    		System.out.println("href att value is null not possible to click");
		    		continue;
		    	}
		    	try {
		    	URL linkURL = new URL(hrefAttValue);
		    	HttpURLConnection conn = (HttpURLConnection) linkURL.openConnection();
		    	conn.connect();
		    	
		    	
		    	if(conn.getResponseCode()>=400) {
		    		System.out.println(hrefAttValue + "====>Broken Link");

		    	} else {
		    		System.out.println(hrefAttValue + "====>Not a Broken Link");
		    	}
		     }catch(Exception e) {}
		
		

	}

}}
