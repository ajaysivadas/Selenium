package takingScreenshot;

import java.io.File;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.chrome.ChromeDriver;

public class TakingWebPageScreenshot {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","/Users/ajaysivadas/Downloads/chromedriver");
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.flipkart.com/");
		File tempFile = driver.getScreenshotAs(OutputType.FILE);
		System.out.println(tempFile);
		File destFile=new File("./errorshot/1.jpeg");
		tempFile.renameTo(destFile);
	}

}
