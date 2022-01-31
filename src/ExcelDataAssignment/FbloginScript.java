package ExcelDataAssignment;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import dataDriven.ExcelLib;
/*
 * 
 * @author Ajay S
 *
 */
public class FbloginScript {
	public static void main(String[] args) throws InterruptedException {
		String testUrl=ExcelLib.readStringData("Sheet3",0 , 0);
		String EmailId=ExcelLib.readStringData("Sheet3",1 , 0);
		String password=ExcelLib.readStringData("Sheet3",2 , 0);

		String expectedLoginpageTitle=ExcelLib.readStringData("Sheet3",3 , 0);
		String expectedHomePageTitle=ExcelLib.readStringData("Sheet3",4 , 0);
		//Step1 Open the browser and Enter URL
		System.setProperty("webdriver.chrome.driver", ".Users/ajaysivadas/Downloads/Selenium Files/chromedriver");
		WebDriver driver=new ChromeDriver();
		System.out.println("Browser launched Successfully");
		driver.manage().window().maximize();
		System.out.println("Browser is maximized successfully");
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		WebDriverWait explicitWait=new WebDriverWait(driver,15);
		driver.get(testUrl);
		String actualLoginpageTitle=driver.getTitle();
		if(actualLoginpageTitle.equals(expectedLoginpageTitle)) {
			System.out.println("Login page is displayed successfully");
		}
		else {
			System.out.println("Login page is not displayed ");
		}
		//step2:Enter EmailId into emailTextfield
		WebElement EmailIdTextField = driver.findElement(By.id("email"));
		EmailIdTextField.clear();
		EmailIdTextField.sendKeys(EmailId);
		String actualEmailId=EmailIdTextField.getAttribute("value");
		if(actualEmailId.equals(EmailId)) {
			System.out.println("Email Id entered successfully");
		}
		else
		{
			System.out.println("Email Id is not correct");
		}
		//step3:Enter password into passwordTextfield
		WebElement passwordTextField = driver.findElement(By.id("pass"));
		passwordTextField.clear();
		passwordTextField.sendKeys(password);
		String actualpassword=passwordTextField.getAttribute("value");
		if(actualpassword.equals(password)) {
			System.out.println("Password entered successfully");
		}
		else
		{
			System.out.println("Password is not correct");
		}
		//step4:click on Login Button
		driver.findElement(By.name("login")).click();
		explicitWait.until(ExpectedConditions.titleIs(expectedHomePageTitle));
		String actualHomepageTitle=driver.getTitle();
		if(actualHomepageTitle.equals(expectedHomePageTitle)) {
			System.out.println("Home page is displayed successfully");
		}
		else
		{
			System.out.println("Home page is not displayed successfully");
		}
	}
}
