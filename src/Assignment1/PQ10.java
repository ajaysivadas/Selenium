package Assignment1;
import java.util.Set;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.safari.SafariDriver;

public class PQ10 {
	public static void main(String[] args) {
		WebDriver driver=new SafariDriver();
		driver.manage().window().maximize();
		driver.get("https://www.naukri.com/");
		Set<String> allWindow=driver.getWindowHandles();
		for(String WindowId:allWindow) {
			driver.switchTo().window(WindowId);
			if(driver.getTitle().equalsIgnoreCase("Tech Mahindra")) {
				driver.close();
			}
		}
	}
}


