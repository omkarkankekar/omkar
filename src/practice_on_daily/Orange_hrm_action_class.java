package practice_on_daily;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Orange_hrm_action_class {
	
	
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "D:\\java\\chrom\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/");
	    driver.manage().window().maximize();
		
		Actions actt = new Actions(driver);
	WebElement username = driver.findElement(By.xpath("(//input[@type= 'text'])[2]"));
	username.sendKeys("Admin");
	actt.sendKeys(username, Keys.TAB).sendKeys("admin123")
	.sendKeys(Keys.ENTER)
	.build().perform();
	//go to the admin
	WebElement admin=driver.findElement(By.xpath("//a[@id='menu_admin_viewAdminModule']"));
	actt.moveToElement(admin)
	.perform();
	//go on user management
	WebElement usermange=driver.findElement(By.xpath("//a[@id='menu_admin_UserManagement']"));
	actt.moveToElement(usermange).perform();
	//click on user
	WebElement user= driver.findElement(By.xpath("//a[@id='menu_admin_viewSystemUsers']"));
	actt.click(user).perform();
	//right click action
   WebElement usernamee=driver.findElement(By.xpath("//input[@name='searchSystemUser[userName]']"));
   actt.contextClick(usernamee).perform();
	}

}
