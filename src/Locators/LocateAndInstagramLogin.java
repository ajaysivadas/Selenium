package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.safari.SafariDriver;


public class LocateAndInstagramLogin {

	public static void main(String[] args) throws InterruptedException {

		//WebDriver driver=new SafariDriver();
		System.setProperty("webdriver.chrome.driver","/Users/ajaysivadas/Downloads/chromedriver");
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.skillrary.com/");
		Thread.sleep(2000);
		driver.get("https://www.facebook.com/");
		//		Thread.sleep(2000);
		//		driver.findElement(By.cssSelector("input[name=\"username\"]")).sendKeys("ajaysivadas@gmail.com");
		//		driver.findElement(By.cssSelector("input[name=\"password\"]")).sendKeys("ajay@123");

	}

}
