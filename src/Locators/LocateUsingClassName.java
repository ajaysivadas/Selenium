package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.safari.SafariDriver;

public class LocateUsingClassName {

	public static void main(String[] args) throws InterruptedException {
			WebDriver driver=new SafariDriver();
			driver.manage().window().maximize();
			driver.get("https://www.skillrary.com/");
			driver.findElement(By.className("dropdown-toggle")).click();
			Thread.sleep(2000);
			driver.findElement(By.className("dropdown-toggle")).click();
			Thread.sleep(2000);
			driver.close();
	}

}
