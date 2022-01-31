package Assignment1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.safari.SafariDriver;

public class PQ7 {
	public static void main(String[] args) {
		WebDriver driver=new SafariDriver();
		driver.get("https://www.naukri.com");
		driver.close();
	}

}
