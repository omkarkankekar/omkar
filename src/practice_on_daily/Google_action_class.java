package practice_on_daily;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Google_action_class {
  
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "D:\\java\\chrom\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https:www.google.com");
		driver.manage().window().maximize();
		Actions actt = new Actions(driver);
		WebElement search=driver.findElement(By.xpath("//input[@class='gLFyf gsfi']"));
		search.sendKeys("India");
		actt.sendKeys("search",Keys.ENTER).perform();
	
	}
}
