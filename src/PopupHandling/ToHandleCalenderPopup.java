package PopupHandling;

import java.time.LocalDateTime;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ToHandleCalenderPopup {

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
		driver.get ("https://www.makemytrip.com/");
		Actions actions = new Actions (driver);
		actions.click().perform();
		driver.findElement(By.xpath("//span[@class='langCardclose']")).click();
		driver. findElement(By.xpath("//label[@for='departure']")).click();
		Thread.sleep(2000);
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,100);");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//span[@aria-label='Next Month' ]")) .click();
		Thread.sleep(2000);
		driver. findElement(By.xpath("//div[text ()= 'March 2022'1/../..//p[text () = '27']")) .click();
		
		driver.findElement(By.xpath("//div[@aria-label='Move forward to switch to the next month.']")).click();

	}
}


