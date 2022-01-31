package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.safari.SafariDriver;

public class LocateElementUsingIdSelector {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new SafariDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.actitime.com/login.do");
		WebElement usernameTextField=driver.findElement(By.name("username"));
		usernameTextField.sendKeys("ajay");
		Thread.sleep(2000);
		driver.findElement(By.name("pwd")).sendKeys("abcd123");
		Thread.sleep(2000);
		driver.findElement(By.id("loginbutton")).click();

	}
}


