package orangehrm;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Windowhandling_swichto_childwindow {
	

	public static void main(String[] args) {
	
		System.setProperty("webdriver.chrome.driver", "D:\\java\\chrom\\chromedriver.exe");
        WebDriver driver= new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://opensource-demo.orangehrmlive.com/");
        
        
        //to get parent window id 
        
        String parent = driver.getWindowHandle();
        System.out.println("parent id is:- "+parent);
        
        
        //To get child window from parent window.
        
        driver.findElement(By.xpath("//*[text()='OrangeHRM, Inc']")).click();
        driver.findElement(By.xpath("//*[text()='OrangeHRM, Inc']")).click();
        driver.findElement(By.xpath("//*[text()='OrangeHRM, Inc']")).click();
        driver.findElement(By.xpath("//*[text()='OrangeHRM, Inc']")).click();
        
        
        //To accesis child window by logic
    
        Set<String> allwind = driver.getWindowHandles();
        int count = allwind.size();
    	
    	String[] winid = new String[count];
    	
    	int i=0;
    	
    	for(String id :allwind)
    	{
    		winid[i] = id;
    		i++;
    		
    	}
    	
    	driver.switchTo().window(winid[3]);
    	
    	driver.navigate().to("https://www.google.com/");
    	


        
	}
	
}
