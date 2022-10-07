package selenium_webdriver.Bottomline;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

public class AlertDemo {
	static WebDriver driver;	
	public static void main(String[] args) throws IOException, InterruptedException
	{
		Scanner sc=new Scanner(System.in);
		String browsername=	sc.next();
		driver=BrowserIntiate.browsersetup();
		driver.get("https://demo.guru99.com/test/delete_customer.php");
		driver.findElement(By.name("cusid")).sendKeys("123");
		driver.findElement(By.name("submit")).click();
		//Thread.sleep(1000);
		
		
		Alert a=driver.switchTo().alert();
		System.out.println(a.getText());
		a.accept();
		a.accept();
		TakesScreenshot scr=(TakesScreenshot)driver;
		  File source=scr.getScreenshotAs(OutputType.FILE);
		  FileUtils.copyFile(source,new File("C:\\Users\\91978\\Desktop\\screenshot\\screen1.jpeg"));
	}
}
