package seleniumLauch;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class RetrieveDropDownValues {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Automation\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		String url = "https://business.alinma.com/cb/servlet/cb/jsp-ns/demo/en/landing.jsp?cu=cash/index.jsp&module=cash";

		driver.get(url);

		driver.manage().window().maximize();
		
		WebElement countryDropDown = driver.findElement(By.name("CashDisplayCurrencyCode"));
		
		Select cDropDown = new Select(countryDropDown);
		
		List<WebElement> values = cDropDown.getOptions();
		
		int size =  values.size();
		
		for(int i=0;i<size;i++) {
			String visibleText = values.get(i).getText();
			System.out.println(visibleText);			
		}
		
		System.out.println("****************************");
		
		for(int i=0;i<size;i++) {
			String value = values.get(i).getAttribute("value");
			System.out.println(value);			
		}


	}

}
