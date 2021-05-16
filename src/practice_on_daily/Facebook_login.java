package practice_on_daily;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Facebook_login {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "D:\\java\\chrom\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://mbasic.facebook.com/");
		driver.manage().window().maximize();
		WebElement signup = driver.findElement(By.xpath("//input[@name='sign_up']"));
		signup.click();
		WebElement username = driver.findElement(By.xpath("//input[@name='firstname']"));
		username.sendKeys("omkarkankekar@gmail.com");
		
	}
}
