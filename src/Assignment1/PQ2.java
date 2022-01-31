package Assignment1;

import java.net.MalformedURLException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.safari.SafariDriver;

public class PQ2 {
public static void main(String[] args) throws InterruptedException, MalformedURLException {
	WebDriver driver=new SafariDriver();
	driver.manage().window().maximize();
	driver.navigate().to("https://www.skillrary.com/");
	Thread.sleep(2000);
	driver.get("https://www.flipkart.com/");
	Thread.sleep(2000);
	driver.navigate().back();
	Thread.sleep(2000);
	driver.navigate().forward();
	Thread.sleep(2000);
	driver.navigate().refresh();
}
}