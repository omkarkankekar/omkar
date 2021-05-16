package basicsofselenium;

import org.openqa.selenium.chrome.ChromeDriver;

public class Basiclonch { 
	
	
	
	public static void main(String[] args) {
		
	System.setProperty("webdriver.chrome.driver", "D:\\java\\chrom\\chromedriver.exe");
	ChromeDriver driver= new ChromeDriver();
	driver.get("https:\\www.google.com");
	driver.manage().window().maximize();
		
	
}

}
