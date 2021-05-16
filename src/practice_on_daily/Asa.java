package practice_on_daily;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Asa {	
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "D:\\java\\chrom\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		// To launch the browser
		driver.manage().window().maximize();
		driver.get("https://opensource-demo.orangehrmlive.com/index.php/dashboard");// To navigate to the particular url

//		 To use actions class step1: Create the object of actions class
		
		Actions act = new Actions(driver);
	WebElement username = driver.findElement(By.xpath("(//input[@type= 'text'])[2]"));
	
	username.sendKeys("Admin");
	
	//Step 2: To press the tab by the help of action class reference variable
	
//	act.sendKeys(username, Keys.TAB).perform();
	
	
	
	act.sendKeys(username, Keys.TAB).sendKeys("admin123")
	.sendKeys(Keys.ENTER)
	.build().perform();
	// to perform mouse hover action by using action class
	WebElement admintab = driver.findElement(By.xpath("//*[@id='menu_admin_viewAdminModule']"));
	
	act.moveToElement(admintab).perform();
	
	// to perform click operation by using action class
	
	WebElement myinfo = driver.findElement(By.xpath("//*[@id='menu_pim_viewMyDetails']"));
		
	act.click(myinfo).perform();
	
	// to perform right click on the webelement
	
//	act.contextClick().perform();
	WebElement maintenance = driver.findElement(By.xpath("(//a[@id='menu_maintenance_purgeEmployee'])[1]"));
	
	act.contextClick(maintenance).perform();
	
	
	
	
		
		
		
		
		
		
	}
	
	
	

	
	
	
	


}
