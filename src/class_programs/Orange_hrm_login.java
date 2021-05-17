package class_programs;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Orange_hrm_login {
	
	public static void main(String[] args) throws Throwable {
		System.setProperty("webdriver.chrome.driver", "D:\\java\\chrom\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/");
		driver.manage().window().maximize();
		WebElement username= driver.findElement(By.xpath("//input[@name='txtUsername']"));
		Thread.sleep(2000);
		username.clear();
		Thread.sleep(1000);
		username.sendKeys("Admin");
		WebElement pass=driver.findElement(By.xpath("//input[@name='txtPassword']"));
		pass.clear();
		Thread.sleep(1000);
		pass.sendKeys("admin123");
//		WebElement login=driver.findElement(By.xpath("//input[@name='Submit']"));
//		login.click();
		
	}

}
