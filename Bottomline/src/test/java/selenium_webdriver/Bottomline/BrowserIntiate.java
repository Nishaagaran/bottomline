package selenium_webdriver.Bottomline;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.Scanner;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriver.Options;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;

public class BrowserIntiate {

	static WebDriver driver;
	static WebDriver browsersetup() throws IOException
	{
		File f=new File("D:\\bootomline_Selenium\\OCT_ILT\\Bottomline\\config.properties");
		
		FileInputStream fis=new FileInputStream(f);
		Properties p=new Properties();
		p.load(fis);
				
		String brname=p.getProperty("browsername");
		switch (brname)
		{
		
		case "chrome":
		{
		
			System.setProperty("webdriver.chrome.driver","E:\\selenium JARs_4.5\\browser\\chromedriver.exe");
		ChromeOptions options=new ChromeOptions();
		options.addArguments("start-maximized");
		//options.addArguments("headless");
			driver=new ChromeDriver(options);
			//driver.manage().window().maximize();
			driver.get("https://www.mycontactform.com/samples.php");
			break;
		}
		case "edge":
		
		{
			System.setProperty("webdriver.edge.driver","E:\\selenium JARs_4.5\\browser\\msedgedriver.exe");
			 driver=new EdgeDriver();
			driver.manage().window().maximize();
			driver.get("https://www.mycontactform.com/samples.php");
			break;
		}
		
		}
		return driver;
		
	}
}
