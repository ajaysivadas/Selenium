package RealProjectTesting;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class MoodleLogin {

	public static void main(String[] args) {

		//Test Data
		String testUrl="https://lms.vit.ac.in/login/index.php";
		String username="16MIS1141";
		String password ="Moodle@0515";
		String expectedLoginPageTitle="VIT Chennai: Log in to the site";
		String expectedHomePageTitle="Dashboard";

		//Step 1 : Open the browser Enter the URL
		System.setProperty("webdriver.chrome.driver","/Users/ajaysivadas/Downloads/Selenium Files/chromedriver");
		WebDriver driver=new ChromeDriver();
		System.out.println("Browser launched successfully");
		driver.manage().window().maximize();
		System.out.println( "Browser is maximized successfully");	
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		WebDriverWait explicitWait = new WebDriverWait (driver, 10);
		driver.get (testUrl);
		String actualLoginPageTitle = driver.getTitle();
		if(actualLoginPageTitle. equals (expectedLoginPageTitle))
		{
			System.out.println("Login page is displayed Succesfully");
		}
		else
		{
			System.out.println("Login page is not displayed Succesfully");
		}

		//Step 2: Enter Username into username text field
		WebElement usernameTextField = driver. findElement (By.name ("username")) ;
		usernameTextField.clear();
		usernameTextField. sendKeys (username) ;
		String actualUsernameEntered = usernameTextField.getAttribute("value");
		if(actualUsernameEntered. equals(username)) 
		{
			System.out.println("Username is entered successfully");
		}
		else 
		{
			System.out.println( "Username is not enterd successfully");
		}

		//Step 3 : Enter Password into password text field
		WebElement passwordTextField = driver. findElement (By.name ("password")) ;
		passwordTextField.clear();
		passwordTextField.sendKeys(password);
		String actualPasswordEntered = passwordTextField.getAttribute("value");
		if (actualPasswordEntered.equals (password)) 
		{
			System.out.println("Password is entered successfully");
		}
		else 
		{
			System.out.println("Password is not enterd successfully");
		}

		//Step 4 : Click on Login button
		driver.findElement(By.id("loginbtn")).click();
		explicitWait.until(ExpectedConditions.titleIs(expectedHomePageTitle));
		String actualHomePageTitle = driver.getTitle();
		if(actualHomePageTitle.equals(expectedHomePageTitle)) 
		{
			System.out.println("Home page is displayed successfully");
		}
		else 
		{
			System.out.println("Home page is not displayed successfully");
		}


	}
}


