package webDriverMethods;
import java.util.Set;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.safari.SafariDriver;
public class ToCloseAllChildWindows {
	public static void main(String[] args) {
		WebDriver driver=new SafariDriver();
		driver.manage().window().maximize();
		driver.get("https://www.naukri.com/");
		String parentWindowId=driver.getWindowHandle();
		Set<String> allWindowIds=driver.getWindowHandles();
		System.out.println(allWindowIds.size());
		allWindowIds.remove(parentWindowId);
		System.out.println(allWindowIds.size());
		for(String windowId:allWindowIds) {
			driver.switchTo().window(windowId);
			driver.close();
		}

	}
}
