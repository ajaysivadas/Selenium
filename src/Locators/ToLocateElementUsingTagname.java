package Locators;

import org.openqa.selenium.chrome.ChromeDriver;

public class ToLocateElementUsingTagname {

	public static void main(String[] args) throws InterruptedException {
	
	System.setProperty("webdriver.chrome.driver","/Users/ajaysivadas/Downloads/chromedriver");
	ChromeDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://demo.actitime.com/login.do");
	driver.findElementByTagName("a").click();
	Thread.sleep(2000);
	driver.close();

	}

}
