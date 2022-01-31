package webDriverMethods;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToGetAlignmentOfApplication {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","/Users/ajaysivadas/Downloads/chromedriver");
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		Dimension dimension = driver.findElement(By.id("email")).getSize();
		System.out.println(dimension.width);
		System.out.println(dimension.height);
		Dimension dimension1 = driver.findElement(By.id("passContainer")).getSize();
		System.out.println(dimension1.width);
		System.out.println(dimension1.height);
		
		

	}
}