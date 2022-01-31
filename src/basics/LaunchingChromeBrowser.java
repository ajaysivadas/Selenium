package basics;
import org.openqa.selenium.chrome.*;
public class LaunchingChromeBrowser {
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver","/Users/ajaysivadas/Downloads/Selenium Files/chromedriver");
	ChromeDriver driver=new ChromeDriver();
	driver.get("http://www.snapdeal.com");
	
}
}
