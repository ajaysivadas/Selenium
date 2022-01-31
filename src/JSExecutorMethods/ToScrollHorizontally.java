package JSExecutorMethods;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToScrollHorizontally {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","/Users/ajaysivadas/Downloads/Selenium Files/chromedriver");
		WebDriver driver = new ChromeDriver();
		driver.manage ().window ().maximize();
		driver.manage().timeouts ().implicitlyWait (10, TimeUnit.SECONDS);
		driver.get ("https://www.skillrary.com/");
		JavascriptExecutor js = (JavascriptExecutor) driver;
		Thread.sleep(3000) ;
		js. executeScript ("window.scrollBy(0,1500);");
		Thread.sleep(2000);
		js. executeScript("window.scrollBy(0,1500);");
		js. executeScript ("window.scrollBy(0,1500);");
		Thread.sleep(2000);
		js. executeScript("window.scrollBy(0,-500);");
	}

}
