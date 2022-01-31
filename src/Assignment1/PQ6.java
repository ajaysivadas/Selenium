package Assignment1;

import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.safari.SafariDriver;

public class PQ6 {
	public static void main(String[] args) {
		WebDriver driver=new SafariDriver();
		driver.get("https://www.naukri.com/");
		Set<String> allwindowTitle=driver.getWindowHandles();
		for(String WindowTitle:allwindowTitle) {
		driver.switchTo().window(WindowTitle).getTitle();

		}
	}

}
