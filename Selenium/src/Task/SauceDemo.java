package Task;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SauceDemo {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./Software/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.saucedemo.com/v1/");
		driver.findElement(By.id("user-name")).sendKeys("standard_user");
		driver.findElement(By.id("password")).sendKeys("secret_sauce");
		driver.findElement(By.id("login-button")).click();
		WebElement ele = driver.findElement(By.xpath("//div[.='Sauce Labs Backpack']"));
		String title1 = ele.getText();
		ele.click();
		String price1 = driver.findElement(By.xpath("//div[.='Sauce Labs Backpack']/following-sibling::div[2]")).getText();
		System.out.println(title1+" "+price1);
		driver.findElement(By.xpath("//button[.='ADD TO CART']")).click();
		driver.findElement(By.xpath("//span[@class='fa-layers-counter shopping_cart_badge']")).click();
		WebElement ele2 = driver.findElement(By.xpath("//div[.='Sauce Labs Backpack']"));
		String title2 = ele2.getText();
		String price2=driver.findElement(By.xpath("//div[.='Sauce Labs Backpack']/../following-sibling::div[2]/div[1]")).getText();
		System.out.println("cart details"+title2+" "+price2);
		if(title1.equals(title2) && price1.contains(price2)) {
			System.out.println("both details are same");
		}
		driver.findElement(By.xpath("//button[.='Open Menu']")).click();
		driver.findElement(By.xpath("//a[.='Logout']")).click();
		Thread.sleep(2000);
		driver.quit();
		
	}

}
