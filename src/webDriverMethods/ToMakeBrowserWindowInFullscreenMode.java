package webDriverMethods;
import org.openqa.selenium.By; 
import org.openqa.selenium.WebDriver; 
import org.openqa.selenium.safari.SafariDriver; 
public class ToMakeBrowserWindowInFullscreenMode {
public static void main(String[] args) throws InterruptedException {
	WebDriver driver=new SafariDriver();
	driver.manage().window().maximize();
	driver.get("https://sb.marketfeed.app/");
	Thread.sleep(3000);
	driver.manage().window().fullscreen();
}
}
