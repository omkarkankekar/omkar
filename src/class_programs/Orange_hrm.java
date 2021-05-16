package class_programs;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Orange_hrm {
	
	public static void main(String[] args) {
		
	System.setProperty("webdriver.chrome.driver", "D:\\java\\chrom\\chromedriver.exe");
	WebDriver driver= new ChromeDriver();
	driver.get("https://opensource-demo.orangehrmlive.com/");
	driver.manage().window().maximize();
		

	}
}
