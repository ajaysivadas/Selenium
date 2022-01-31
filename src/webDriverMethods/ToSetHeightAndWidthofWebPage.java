package webDriverMethods;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver; 
import org.openqa.selenium.safari.SafariDriver; 
public class ToSetHeightAndWidthofWebPage {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new SafariDriver();
		//driver.manage().window().maximize();
		driver.get("https://www.skillrary.com/");
		Thread.sleep(2000);
		Dimension dimension=new Dimension(1215,1400);
		driver.manage().window().setSize(dimension);
		
	
}
}