package webDriverMethods;
import java.net.MalformedURLException;
import java.net.URL;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver; 
import org.openqa.selenium.safari.SafariDriver; 

public class ToPerformBrowserHistoryNavigations {
	public static void main(String[] args) throws InterruptedException, MalformedURLException {
		WebDriver driver=new SafariDriver();
		driver.manage().window().maximize();
		driver.navigate().to("https://www.skillrary.com/");
		Thread.sleep(2000);
		driver.get("https://sb.marketfeed.app/");
		Thread.sleep(2000);
		driver.navigate().back();
		Thread.sleep(2000);
		driver.navigate().forward();
		Thread.sleep(2000);
		driver.navigate().refresh();
		URL url=new URL("https://www.swiggy.com/");
		driver.navigate().to("https://www.swiggy.com/");
		
}
}
