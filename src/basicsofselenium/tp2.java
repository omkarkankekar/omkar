package basicsofselenium;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class tp2 {
	
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "D:\\java\\chrom\\chromedriver.exe");
		ChromeDriver driver= new ChromeDriver();
		driver.get("https://www.facebook.com/");
	   driver.findElement(By.id("email")).sendKeys("omkarkankekar@gmail.com");
		driver.findElement(By.id("pass")).sendKeys("omkar4456");
		driver.findElement(By.name("login")).click();
		
	}

}
