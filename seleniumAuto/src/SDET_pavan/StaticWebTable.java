package SDET_pavan;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class StaticWebTable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Automation\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		String url = "https://vinothqaacademy.com/webtable/";
		driver.get(url);
		driver.manage().window().maximize();
		
		
		//total no of rows in a table
		List<WebElement> total_rows = driver.findElements(By.xpath("//table[@id='myTable']//thead//tr[1]/th"));
        int rows = total_rows.size();
        System.out.println("The no. of rows in a table is "+rows); //11
        
        //total number of colums
        int cols = driver.findElements(By.xpath("//table[@id='myTable']//tbody/tr/td[1]")).size();
        System.out.println("The no. of cols in a table is "+cols);
        
        WebElement data = driver.findElement(By.xpath("//table[@id='myTable']/tbody/tr[3]/td[6]"));
        String designation = data.getText();
        System.out.println(designation);
        
        
        
        //read data from all rows and colums
        //inner for loop represent rows,outer reprents cols
        
      for(int c=1;c<=cols;c++) {
    	  for(int i=1;i<=rows;i++) {
    		  String value = driver.findElement(By.xpath("//table[@id='myTable']/tbody/tr["+c+"]/td["+i+"]")).getText();
    		  System.out.print(value + " \t");
    	  }
    	  System.out.println();
      }
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
	}

}
