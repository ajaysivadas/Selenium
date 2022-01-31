package webDriverMethods;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver; 
import org.openqa.selenium.safari.SafariDriver; 

public class ToSetThePositionOfTheBrowser {
	public static void main(String[] args) {
		WebDriver driver=new SafariDriver();
		driver.get("https://www.skillrary.com/");
		driver.manage().window().setPosition(new Point(100,50));
}
}