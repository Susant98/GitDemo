package SDET_pavan;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DatePicker {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Automation\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		String url = "https://jqueryui.com/datepicker/";
		driver.get(url);
		driver.manage().window().maximize();
		
		String year = "1998";
		String month = "October";
		String date = "10";
		
		driver.switchTo().frame(0);
		
		driver.findElement(By.xpath("//input[@id='datepicker']")).click();
		
		while(true) {
			String currentYear = driver.findElement(By.xpath("//span[@class='ui-datepicker-year']")).getText();
			String currentMonth = driver.findElement(By.xpath("//span[@class='ui-datepicker-month']")).getText();
			
			
			if(currentMonth.equals(month) && currentYear.equals(year)) {
				break;
			}
			driver.findElement(By.xpath("//span[@class='ui-icon ui-icon-circle-triangle-w']")).click(); //prev
			//driver.findElement(By.xpath("//span[@class='ui-icon ui-icon-circle-triangle-e']")).click();  //next
		}
		
		//select the date
		List<WebElement> allDate =driver.findElements(By.xpath("//table[@class='ui-datepicker-calendar']/tbody/tr/td"));
		
		for(WebElement dt : allDate) {
			if(dt.getText().equals(date)) {
				
			}
		}

	}

}
