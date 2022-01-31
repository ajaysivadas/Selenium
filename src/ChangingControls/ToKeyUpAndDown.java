package ChangingControls;

import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ToKeyUpAndDown {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","/Users/ajaysivadas/Downloads/Selenium Files/chromedriver");
		WebDriver driver = new ChromeDriver();
		driver.manage() .window().maximize();
		driver.manage ().timeouts ().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get ("https://www.myntra.com/");
		Set<String> allWindow=driver.getWindowHandles();
		List<WebElement> navBarElements = driver.findElements (By.xpath("//a[@data-type='navElements']"));
	
		for (WebElement ele : navBarElements) {
			Actions actions = new Actions (driver);
			actions.keyDown(Keys.COMMAND).click(ele).perform();
			actions.keyUp(Keys.COMMAND).perform();		
//			actions.keyDown(Keys.SHIFT).click(ele).perform();
//			actions.keyUp(Keys.SHIFT).perform();
			
		}
		for(String WindowId:allWindow) {
			driver.switchTo().window(WindowId);
			if(driver.getTitle().equalsIgnoreCase("Online Shopping for Women - Shop For Women Clothes, Shoes, Bags & More")) 
			{
				driver.close();
				break;
			}

	}

}
}
