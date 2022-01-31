package Assignment1;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.safari.SafariDriver;
public class PQ16 {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new SafariDriver();
		driver.manage().window().maximize();
		driver.get("https://www.swiggy.com/");
		Thread.sleep(2000);
		driver.findElement(By.partialLinkText("Sign")).click();
	}

}
