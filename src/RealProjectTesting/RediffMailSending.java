package RealProjectTesting;

import java.util.NoSuchElementException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class RediffMailSending {
	public static void main(String[] args) throws InterruptedException {
		String testUrl="https://www.rediff.com";
		String username="sumanthElfBatch@rediffmail.com";
		String password ="Testing@123";
		System.setProperty("webdriver.chrome.driver","/Users/ajaysivadas/Downloads/Selenium Files/chromedriver");
		WebDriver driver = new ChromeDriver();
		driver.manage ().window ().maximize();
		driver.manage ().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get (testUrl);
		driver.findElement(By.xpath("//a[@class='signin']")).click();
		WebElement usernameTextField = driver.findElement (By.xpath ("//input[@name='login']")) ;
		usernameTextField.clear();
		usernameTextField. sendKeys (username) ;
		WebElement passwordTextField = driver. findElement (By.xpath ("//input[@name='passwd']")) ;
		passwordTextField.clear();
		passwordTextField.sendKeys(password);
		driver.findElement(By.name("proceed")).click();
		driver.findElement(By.xpath("//li[@class='rd_write']")).click();
		driver.findElement(By.xpath("//input[@class='rd_inp_to as-input']")).sendKeys(username);
		driver.findElement(By.xpath("//input[@class='rd_inp_sub rd_subject_datacmp2']")).sendKeys("Ajay S");

		WebElement frameElement = driver.findElement (By.xpath("//iframe[contains (@title, 'Rich Text Editor')]"));
		Thread.sleep(2000);
		driver.switchTo(). frame(frameElement);
		driver.findElement(By.xpath("//body[@contenteditable='true']")).sendKeys("Hi goodevening");
		driver.switchTo().defaultContent();
		driver.findElement (By.linkText ("Send")) .click();
		Thread.sleep(2000);
		for(;;) 
		{
			try
			{
				driver.findElement(By.xpath("//span[text()-'Ajay S']/..//cite[@title='Select mail']")).click();
				driver.findElement(By.xpath("//span[text()='Delete'and @class='rd_fil_del']")) .click();
				driver.findElement (By.xpath("//button[text()='Ok]")) .click();
				break;
			}
			catch(NoSuchElementException e) {
				driver.navigate().refresh();
				
			}
		}
	}

}