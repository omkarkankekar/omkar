package class_programs;

import java.io.ObjectInputStream.GetField;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Winndow_handling {

	public static void main(String[] args) {
	
		System.setProperty("webdriver.chrome.driver", "D:\\java\\chrom\\chromedriver.exe");
        WebDriver driver= new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://opensource-demo.orangehrmlive.com/");
        
        //To get parent window id 
        
        String parent = driver.getWindowHandle();
        System.out.println("parent id is:- "+parent);
        
        //To get child window from parent window
        
        driver.findElement(By.xpath("//*[text()='OrangeHRM, Inc']")).click();
        driver.findElement(By.xpath("//*[text()='OrangeHRM, Inc']")).click();
        
        //To get child window id 
        
        Set<String> allwindows = driver.getWindowHandles();
		for(String winid:allwindows) {
			System.out.println("chid window id is:- "+winid);
			
		}
	}

}
