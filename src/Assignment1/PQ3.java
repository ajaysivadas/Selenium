package Assignment1;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.safari.SafariDriver;

public class PQ3 {
public static void main(String[] args) throws InterruptedException {
	WebDriver driver=new SafariDriver();
	driver.get("https://www.skillrary.com/");
	Thread.sleep(2000);
	Dimension dimension=new Dimension(100,200);
	driver.manage().window().setSize(dimension);
	
}
}
