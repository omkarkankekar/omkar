package spice_jet;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Login{
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "D:\\java\\chrom\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("https://www.spicejet.com/");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//a[@id='ctl00_HyperLinkLogin']")).click();
		
	}
}