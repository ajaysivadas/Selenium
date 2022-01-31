package PopupHandling;

import java.time.LocalDateTime;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class CalenderPopup {
	public static void main(String[] args) throws InterruptedException {
		LocalDateTime ldt = LocalDateTime.now().plusMonths(6);
		String month = ldt.getMonth().name();
		month = month. substring(0, 1). toUpperCase()+month.substring(1,month.length()).toLowerCase();
		int date = ldt. getDayOfMonth() ;
		int year = ldt.getYear();
		System.setProperty("webdriver.chrome.driver","/Users/ajaysivadas/Downloads/Selenium Files/chromedriver");
		WebDriver driver = new ChromeDriver();
		driver.manage() .window().maximize();
		driver.manage ().timeouts ().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get ("https://www.farefirst.com/");
		Actions actions = new Actions (driver);
		actions.click().perform();
		driver. findElement(By.xpath("//span[text()='One way']")).click();
		driver.findElement(By.xpath("//div[@title='Departure']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[@aria-label='Move forward to switch to the next month.']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//td[@aria-label='Wednesday, March 23, 2022']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[text()='Search']")).click();
		
		}
	}
	
