package webDriverMethods;
import org.openqa.selenium.By; 
import org.openqa.selenium.WebDriver; 
import org.openqa.selenium.safari.SafariDriver; 
public class Titleofthepage {
	public static void main(String[] args) {
		WebDriver driver=new SafariDriver();
		driver.get("https://kite.zerodha.com/holdings");
		driver.getTitle();
	}
	
	
}
