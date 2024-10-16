package Pratice;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Pagination {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Automation\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		String url = "https://demo.opencart.com/admin/index.php";
		driver.get(url);
		driver.manage().window().maximize();
		
		WebElement username = driver.findElement(By.xpath("//input[@id='input-username']"));
		username.clear();
		username.sendKeys("demo");
//		
		WebElement password = driver.findElement(By.xpath("//input[@id='input-password']"));
		password.clear();
		password.sendKeys("demo");
        Thread.sleep(10000);
		driver.findElement(By.xpath("//button[normalize-space()='Login']")).click();
	    Thread.sleep(10000);
		driver.findElement(By.xpath("//a[@class='parent collapsed'][normalize-space()='Customers']")).click();
		driver.findElement(By.xpath("//ul[@id='collapse-5']//a[contains(text(),'Customers')]")).click();
		
		Thread.sleep(4000);
		String text = driver.findElement(By.xpath("//div[@class='col-sm-6 text-end']")).getText();
		//System.out.println(text);
		
		int total_pages = Integer.parseInt(text.substring(text.indexOf("(")+1, text.indexOf("Pages")-1));
		
		for(int i=0;i<=5;i++) {
			if(i>1) {
			WebElement pages = driver.findElement(By.xpath("/ul[@class='pagination']//*[text()="+i+"]"));
			pages.click();
		}
		}
	//	int total_rows = driver.findElements(By.xpath("//table[@class='table table-bordered table-hover']/tbody/tr"));
		int total_row = driver.findElements(By.xpath("//table[@class='table table-bordered table-hover']/tbody/tr")).size();
		for(int r=0;r<=total_row;r++) {
			String customerName= driver.findElement(By.xpath("//table[@class='table table-bordered table-hover']/tbody/tr["+r+"]/td[2]")).getText();
			System.out.println(customerName);
		}

		

	}

}
