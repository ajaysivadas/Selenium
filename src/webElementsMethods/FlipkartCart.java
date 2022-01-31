package webElementsMethods;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FlipkartCart {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","/Users/ajaysivadas/Downloads/chromedriver");
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.flipkart.com/");
		driver.findElement(By.xpath("//button[text()='✕']")).click();
		//Adding 1st Product
		driver.findElement (By.name ("q" )). sendKeys("iphone",Keys.ENTER);
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[text()='APPLE iPhone 12 (Black, 64 GB)']")).click();
		addToCart(driver,"Buy Apple iPhone 12 ( 64 GB Storage ) Online at Best Price On Flipkart.com");
		Thread.sleep(2000);
		//Adding 2nd Product
		driver.findElement (By.name ("q" )).clear();
		Thread.sleep(2000);
		driver.findElement (By.name ("q" )). sendKeys("mi",Keys.ENTER);
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[text()='Redmi 9A (SeaBlue, 32 GB)']")).click();
		addToCart(driver,"Mi Redmi 9A ( 32 GB Storage, 2 GB RAM ) Online at Best Price On Flipkart.com");
		Thread.sleep(2000);
		//Adding 3rd Product
		driver.findElement (By.name ("q" )).clear();
		driver.findElement (By.name ("q" )). sendKeys("vivo",Keys.ENTER);
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[text()='vivo V23 Pro 5G (Stardust Black, 256 GB)']")).click();
		addToCart(driver,"vivo V23 Pro 5G ( 256 GB Storage, 12 GB RAM ) Online at Best Price On Flipkart.com");
		driver.findElement(By.linkText("Cart")).click();
	}
	public static void addToCart (WebDriver driver, String expectedPageTitle) throws InterruptedException {
		String parentWindowId = driver.getWindowHandle();
		Set <String> allWindowIds = driver.getWindowHandles();
		allWindowIds.remove(parentWindowId);
		for (String windowId : allWindowIds) {
			driver.switchTo().window (windowId);
			String actualPageTitle=driver.getTitle();
			if(actualPageTitle.equals(expectedPageTitle)){
				System.out.println("driver switched the control to the correct page");
			}
		}
		driver.findElement (By.xpath("//button[text ()='ADD TO CART' ]")) .click();
		Thread.sleep(2000);
		driver.close();
		driver.switchTo().window(parentWindowId);

	}
}