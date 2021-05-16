package practic;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Practic {
	
	public static void main(String[] args)throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","D:\\java\\chrom\\chromedriver.exe");
	WebDriver driver= new ChromeDriver();
	driver.get("https:\\www.google.com");
		driver.manage().window().maximize();
		Thread.sleep(5000);
		driver.get("https:\\www.facebook.com");
		Thread.sleep(2000);
		driver.navigate().back();
		Thread.sleep(3000);
		driver.navigate().forward();
		driver.navigate().refresh();
		Thread.sleep(2000);
		driver.close();
		
	}


}
