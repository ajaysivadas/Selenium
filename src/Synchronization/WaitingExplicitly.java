package Synchronization;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WaitingExplicitly {

	public static void main(String[] args) {
			System.setProperty("webdriver.chrome.driver","/Users/ajaysivadas/Downloads/chromedriver");
			ChromeDriver driver=new ChromeDriver();
			driver.manage().window().maximize();
			WebDriverWait explicitWait = new WebDriverWait(driver,10);
			driver.get("https://www.instagram.com");
			explicitWait.until(ExpectedConditions.presenceOfElementLocated(By.name("username")));
			driver.findElement(By.name("username")).sendKeys("ajaysivadas");
	}

}
