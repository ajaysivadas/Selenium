package Synchronization;

import java.util.NoSuchElementException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;

public class WaitingFluently {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","/Users/ajaysivadas/Downloads/chromedriver");
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		FluentWait fWait = new FluentWait(driver).pollingEvery(300,TimeUnit.SECONDS).ignoring(NoSuchElementException.class);
		driver.get("https://www.instagram.com");
		fWait.until(ExpectedConditions.titleIs(""));
		driver.findElement(By.name("username")).sendKeys("ajaysivadas");

	}

}	
