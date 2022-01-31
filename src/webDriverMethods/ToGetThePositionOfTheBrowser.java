package webDriverMethods;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver; 
import org.openqa.selenium.safari.SafariDriver; 
public class ToGetThePositionOfTheBrowser {
public static void main(String[] args) {
	WebDriver driver=new SafariDriver();
	driver.get("https://www.skillrary.com/");
	Point point=driver.manage().window().getPosition();
	System.out.println(point.getX());
	System.out.println(point.getY());
}
}
