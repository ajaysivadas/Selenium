package webDriverMethods;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver; 
import org.openqa.selenium.safari.SafariDriver; 
public class ToGetHeightAndWidthOfTheBrowser {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new SafariDriver();
		//driver.manage().window().maximize();
		driver.get("https://sb.marketfeed.app/");
		Thread.sleep(2000);
		driver.manage().window().getSize();
		Dimension dimension=driver.manage().window().getSize();
		int height=dimension.getHeight();
		int width=dimension.getWidth();
		System.out.println("Height:  "+height+"  Width:  "+width);
		
	}
}
