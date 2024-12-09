package HandlePopUps.AlertAndCondirmationPopup;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertConfirmationPopUps {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./Soft/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://demo.guru99.com/test/delete_customer.php");
		Thread.sleep(2000);
		driver.manage().window().maximize();
		driver.findElement(By.name("cusid")).sendKeys("abcd");
		driver.findElement(By.name("submit")).click();
		Alert a=driver.switchTo().alert();
		System.out.println(a.getText());
		a.dismiss();
		Thread.sleep(2000);
		driver.quit();
	}

}
