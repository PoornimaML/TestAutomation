package WindowHandler;

//import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetWindowAddress {
	public static void main(String[] args)  {
		System.setProperty("webdriver.chrome.driver", "./Softwares/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com");
		System.out.println(driver.getWindowHandle());
		//driver.quit();

}
}
