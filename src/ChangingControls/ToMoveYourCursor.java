package ChangingControls;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ToMoveYourCursor {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","/Users/ajaysivadas/Downloads/Selenium Files/chromedriver");
		WebDriver driver = new ChromeDriver();
		driver.manage ().window ().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://www.myntra.com/");
		WebElement beautyElement = driver.findElement (By.linkText("BEAUTY"));
		Actions actions = new Actions (driver);
		actions.moveToElement(beautyElement).perform();
		driver.findElement (By.linkText ("Beard Oil")).click();

	}

}
