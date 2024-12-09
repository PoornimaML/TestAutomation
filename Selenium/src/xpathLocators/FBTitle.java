package xpathLocators;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FBTitle
{
	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", "./softwares/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.Facebook.com");
		Thread.sleep(2000);
		driver.manage().window().maximize();
	    String s = driver.getTitle();
	    System.out.println(s);
	   
	    
//	    if(s.equals("Hello Facebook"))
//	    
//	    	System.out.println("Title is matching");
//	    else
//	    	System.out.println("Title is not matching");
	    
	    if(s.contains("Facebook -"))
	    	System.out.println("Title is matching");
	    else
	    	System.out.println("Title is not matching");
	}
}
