package Assignment1;

import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.safari.SafariDriver;

public class PQ9 {
	public static void main(String[] args) {
		WebDriver driver=new SafariDriver();
		driver.manage().window().maximize();
		driver.navigate().to("https://www.facebook.com");
		Set<String> WindowIds = driver.getWindowHandles();
			System.out.println(WindowIds);
}
}