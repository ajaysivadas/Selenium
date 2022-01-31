package webDriverMethods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebElementBooleanMethods {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","/Users/ajaysivadas/Downloads/chromedriver");
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.instagram.com/");
		Thread.sleep(2000);
		WebElement usernameTextField=driver.findElement(By.name("username"));
		WebElement passwordTextField=driver.findElement(By.name("password"));
		WebElement loginButton=driver.findElement(By.xpath("//button[.='Login In']"));
		usernameTextField.sendKeys("ajaysivadas");
		passwordTextField.sendKeys("ajay123");
		System.out.println(usernameTextField.isDisplayed());

	}

}
