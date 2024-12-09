package basicSelenium;

import java.io.File;
import java.io.IOException;
import java.util.Date;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.io.FileHandler;

public class GenericPhotos {
public static void getPhotos(WebDriver driver) throws IOException {
		String pics="./Photos/";
		Date d=new Date();
		String d1 = d.toString();
		String d2=d1.replaceAll(":", "-");
		TakesScreenshot ts=(TakesScreenshot)driver;
		File src = ts.getScreenshotAs(OutputType.FILE);//get screenshort
		File dest=new File(pics+d2+".jpeg");
		FileHandler.copy(src, dest);
	}
}