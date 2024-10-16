package SDET_pavan;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DynamicPaginationTable {

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
		
		
		//i want to know all pages present in pagination
		//Showing 1 to 10 of 6814 (682 Pages)  ==> s.subString(s.indexOf("(")+1,s.indexOf("Pages")-1)
		//Showing 1 to 10 of 6814 (682 Pages) capture the xpath
		
		Thread.sleep(4000);
		String text = driver.findElement(By.xpath("//div[contains(text(),'Pages')]")).getText();
		
		int total_pages = Integer.parseInt(text.substring(text.indexOf("(")+1, text.indexOf("Pages")-1));
		
		for(int p=1;p<=5;p++) {                 ////ul[@class='pagination']//li[5]  //for(int p=1;p<=total_pages;p++)
			if(p>1) {
				WebElement active_page = driver.findElement(By.xpath("//ul[@class='pagination']//*[text()="+p+"]"));
				active_page.click();
				Thread.sleep(4000);
			}
			
			//reading data from pages
			int total_row = driver.findElements(By.xpath("//table[@class='table table-bordered table-hover']/tbody/tr")).size();
			
			for(int r=1;r<=total_row;r++) {                     //table[@class='table table-bordered table-hover']/tbody/tr[1]/td[2]
				String customerName= driver.findElement(By.xpath("//table[@class='table table-bordered table-hover']/tbody/tr["+r+"]/td[2]")).getText();
				System.out.println(customerName);
			}
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
