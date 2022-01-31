package webDriverMethods;
import java.util.Set;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver; 
import org.openqa.selenium.safari.SafariDriver; 
public class ToSwitchTheDriver {
	public static void main(String[] args) {
		WebDriver driver=new SafariDriver();
		driver.manage().window().maximize();
		driver.navigate().to("https://www.naukri.com/");
		Set<String> allWindowIds=driver.getWindowHandles();
		String expectedWindowTitle="Tech Mahindra";
		for(String windowId:allWindowIds) {
			driver.switchTo().window(windowId);
			String actualWindowTitle=driver.getTitle();
			if(expectedWindowTitle.equals(actualWindowTitle)) {
				driver.manage().window().maximize();
				break;
			}


		}
	}
}