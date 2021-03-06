package JSExecutorMethods;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToHandleDisabledElements {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","/Users/ajaysivadas/Downloads/Selenium Files/chromedriver");
		WebDriver driver = new ChromeDriver();
		driver.manage ().window ().maximize();
		driver.manage ().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get ("https://demoapp.skillrary.com/");
		WebElement disabledTextField = driver.findElement (By.xpath("//input[@class='']"));
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[@].value='It is receving';", disabledTextField);
		
		driver.get ("https://www.oracle.com/java/technologies/downloads/");
		driver.findElement (By.linkText ("jdk-8u311-linux-x64.tar.gz")).click();
		WebElement disabledButton = driver.findElement (By.linkText ("Download jdk-8u311-linux-i586.tar.gz"));
		JavascriptExecutor js2 = (JavascriptExecutor) driver;
		js2.executeScript("arguments[0].click();", disabledButton);

	}

}
