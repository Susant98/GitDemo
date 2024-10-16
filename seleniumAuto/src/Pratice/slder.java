package Pratice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class slder {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Automation\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		String url = "https://www.jqueryscript.net/demo/Price-Range-Slider-jQuery-UI/";
		driver.get(url);
		driver.manage().window().maximize();
		Thread.sleep(8000);
		WebElement min_slider = driver.findElement(By.xpath("//span[1]"));
		Thread.sleep(8000);
		
		System.out.println(min_slider.getLocation());
		
		Actions action = new Actions(driver);
		action.dragAndDropBy(min_slider, 200,233).perform();
		System.out.println(" location of min slider after that"+min_slider.getLocation());

		
		

	}

}
