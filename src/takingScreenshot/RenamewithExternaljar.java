package takingScreenshot;
import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class RenamewithExternaljar {
	public static void main(String[] args) throws IOException {
		System.setProperty("webdriver.chrome.driver","/Users/ajaysivadas/Downloads/chromedriver");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://www.hotstar.com/in");
		driver.findElement(By.xpath("//button[@class='subscribe-btn right-element']")).click();
		File weScreenshot=driver.findElement(By.xpath("//div[@class='psp-lite__table_comparator']")).getScreenshotAs(OutputType.FILE);
		System.out.println(weScreenshot);
		File destFile=new File("./errorshot/3.jpeg");
		FileUtils.copyFile(weScreenshot, destFile);

	}

}
