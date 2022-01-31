package Assignment1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.safari.SafariDriver;

public class PQ1 {

	public static void main(String[] args) {
		WebDriver driver=new SafariDriver();
		driver.get("https://www.flipkart.com/");
		driver.getTitle();
		String pageSource=driver.getPageSource();
		System.out.println(pageSource);
	}

}
