package seleniumLauch;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
public class LaunchApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// Set the system property for the chrome driver
		System.setProperty("webdriver.chrome.driver", "C:\\Automation\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://api.jquery.com/dblclick/");
        //Maximize the browser
        driver.manage().window().maximize();
        //As per the above URL we need to switch to frame. The targeted element is in the frame
driver.switchTo().frame(0);
        //Create the object 'action'		
Actions action = new Actions(driver);
//Find the targeted element
WebElement ele = driver.findElement(By.cssSelector("html>body>div"));
        //Here I used JavascriptExecutor interface to scroll down to the targeted element
((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView();", ele);
        //used doubleClick(element) method to do double click action
action.doubleClick(ele).build().perform();
        //Once clicked on the element, the color of element is changed to yellow color from blue color
        //driver.close();

	}

}
