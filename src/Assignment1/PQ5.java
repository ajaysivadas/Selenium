package Assignment1;

import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.safari.SafariDriver;

public class PQ5 {
	public static void main(String[] args) {
		WebDriver driver=new SafariDriver();
		driver.get("https://www.naukri.com/");
		String ParentWindow=driver.getWindowHandle();
		Set<String> allwindowTitle=driver.getWindowHandles();
		allwindowTitle.remove(ParentWindow);
		for(String WindowTitle:allwindowTitle) {
		System.out.println(driver.switchTo().window(WindowTitle).getTitle());
		}
		System.out.println(driver.switchTo().window(ParentWindow).getTitle());
	}

}
