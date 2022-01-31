package webElementsMethods;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class MyntraNavBarElements {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","/Users/ajaysivadas/Downloads/chromedriver");
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.myntra.com");
		List<WebElement> navEle = driver.findElements(By.xpath("//a[@data-type='navElements']"));
		for(WebElement ele :navEle) {
			System.out.println(ele.getText());
			
		}

	}

}
