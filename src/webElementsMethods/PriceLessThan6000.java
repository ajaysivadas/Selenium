package webElementsMethods;

import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;

public class PriceLessThan6000 {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","/Users/ajaysivadas/Downloads/chromedriver");
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.findElement (By.name ("q" )). sendKeys("iphone",Keys.ENTER);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage ().window().maximize();
		driver.get("https://www.flipkart.com/");
		driver.findElement(By.xpath("//button[text()='x']")).click();
		driver.findElement(By.name("g")).sendKeys("boat smart watch");
		driver.findElement(By.xpath("//button[@type=V'submit\']")).click();
		Thread.sleep(3000) ;
		driver.findElement(By.xpath("(//div(@data-id])[3]")).click();
		String value = driver.findElement(By.xpath("//div[@class='_3@jeq3_1_WHNI']")).getText();
		String price = value. toString();
		String pric=price.replaceAll("[^\\d.]","");
		int val = Integer.parseInt (pric);
		System.out.println(val);
		if(val<=6000)
		{
			String parentWin = driver.getWindowHandle() ;
			Set<String> allWin = driver.getWindowHandles();
			allWin.remove(parentWin);
			String expectTitle="";

			for(String s: allWin)
			{
				driver.switchTo() .window(s);
				String actuTitle=driver.getTitle();
				if(expectTitle.equals(actuTitle)) 
				{
					System.out.println("driver switched control to a parent page");
				}
			}
			driver.findElement(By.xpath("//button[text()='ADD TO CART']")).click();
			driver.findElement(By.xpath("//span[text()='Cart']")).click();
		}
		else

		{
			System.out.println("");
		}
	}
}
	

