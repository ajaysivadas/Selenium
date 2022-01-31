package Assignment1;

import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.safari.SafariDriver;

public class PQ4 {
	public static void main(String[] args) {
		WebDriver driver=new SafariDriver();
		driver.get("https://www.skillrary.com/");
		driver.manage().window().setPosition(new Point(100,50));
	}

}
