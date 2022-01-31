package takingScreenshot;

import java.io.File;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.chrome.ChromeDriver;

public class TakingWebElementScreenshot {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","/Users/ajaysivadas/Downloads/chromedriver");
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://fundfolio.com/");
		File weScreenshot=driver.findElement(By.xpath("//div[@class='style__Container-sc-16p8v7f-0 ffFULp']")).getScreenshotAs(OutputType.FILE);
		File destFile=new File("./errorshot/2.jpeg");
		weScreenshot.renameTo(destFile);
	}
	
}
