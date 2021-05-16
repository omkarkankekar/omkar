package spice_jet;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Window_handle {
	
	
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "D:\\java\\chrom\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		//To open website.
		driver.get("https://www.spicejet.com/");
		driver.manage().window().maximize();
	    //To get parent window id.
		String parent = driver.getWindowHandle();
	    System.out.println("parent id is:- "+parent);
		//To click on covid19 
	    WebElement covid = driver.findElement(By.xpath("//a[@id='Covid19info']"));
		covid.click();
		WebElement covid1 = driver.findElement(By.xpath("//a[@id='Covid19info']"));
		covid1.click();
        //to handle child window
		Set<String> winidd = driver.getWindowHandles();
		System.out.println("child window id is :- "+winidd);
		 int winidss = winidd.size();
		 String[]omkar=new String[winidss];
		 int i =0;
		 for(String windowid:winidd) {
			
			 omkar[i]=windowid;
			 i++;
		 }
		 driver.switchTo().window(omkar[2]);
		 
			 
			 
		
}

}
	