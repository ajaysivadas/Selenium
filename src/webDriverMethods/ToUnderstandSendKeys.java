package webDriverMethods;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToUnderstandSendKeys {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","/Users/ajaysivadas/Downloads/chromedriver");
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://lms.vit.ac.in/login/index.php");
		Thread.sleep(2000);
		WebElement userNameTextfield = driver.findElement(By.id("username"));
		userNameTextfield.clear();
		userNameTextfield.sendKeys("16MIS1141",Keys.COMMAND+"a");
		Thread.sleep(2000);
		userNameTextfield.sendKeys("",Keys.COMMAND+"c");
		WebElement passwordTextfield = driver.findElement(By.name("password"));
		passwordTextfield.clear();
		Thread.sleep(2000);
		passwordTextfield.sendKeys(Keys.COMMAND+"v");
		driver.findElement(By.id("loginbtn")).click();
		
		
		
		

	}

}
