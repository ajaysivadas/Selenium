package Assignment1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.safari.SafariDriver;

public class PQ18 {
public static void main(String[] args) {
	WebDriver driver=new SafariDriver();
	driver.manage().window().maximize();
	driver.get("https://demo.actitime.com/login.do");
	WebElement usernameTextField=driver.findElement(By.id("username"));
	usernameTextField.sendKeys("ajaysivadas");
	
}
}
