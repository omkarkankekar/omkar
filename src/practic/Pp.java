package practic;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Pp {
	
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","D:\\java\\chrom\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/");
		
		WebElement username=driver.findElement(By.id("txtUsername"));
		username.sendKeys("Admin");

		WebElement Password=driver.findElement(By.id("txtPassword"));
		Password.sendKeys("admin123");


		WebElement submit=driver.findElement(By.id("btnLogin"));
		submit.click();

		WebElement myinfo =driver.findElement(By.id("menu_pim_viewMyDetails"));
	myinfo.click();
	
	WebElement edit=driver.findElement(By.id("btnSave"));
	edit.click();

	WebElement names =driver.findElement(By.id("personal_txtEmpFirstName"));
	names.clear();
	names.sendKeys("omkar");
	
    Select drp=new Select(driver.findElement(By.id("personal_cmbNation")));
 //    drp.selectByIndex(82);
     drp.selectByVisibleText("India");
	}

}
