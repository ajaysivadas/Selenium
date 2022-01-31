package webDriverMethods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class ToGetTheAttribute {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","/Users/ajaysivadas/Downloads/chromedriver");
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window() .maximize();
		String username= "ajay.sivadaas";
		driver.get("https://www.instagram.com/");
		Thread.sleep(2000);
		WebElement usernameTF = driver.findElement (By.name ("username")) ;
		usernameTF.clear();
		usernameTF.sendKeys(username);
		String actualDataEntered = usernameTF.getAttribute("value");
		System.out.println(actualDataEntered);
		if (actualDataEntered.equals (username)) {
			System.out.println("Username 1s entered properly");
		}
		

	}

}
