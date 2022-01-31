package webDriverMethods;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToUseGetText {
	public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver","/Users/ajaysivadas/Downloads/chromedriver");
	ChromeDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://demo.actitime.com/login.do");
	driver.findElement(By.xpath("//button[contains(text(),'Submit')]")).click();
	
	


}
	
	}
