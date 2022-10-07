package selenium_webdriver.Bottomline;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.Select;

class AppTest
{
static WebDriver driver;	
	public static void main(String[] args) throws IOException
	{
	static Logger log=Logger.ge
		Scanner sc=new Scanner(System.in);
		String browsername=	sc.next();
		driver=BrowserIntiate.browsersetup();
	//checkbox	
	driver.findElement(By.xpath("//*[@id=\"contactForm\"]/table/tbody/tr[1]/td/div/input[1]")).click();
	driver.findElement(By.xpath("//*[@id=\"contactForm\"]/table/tbody/tr[1]/td/div/input[3]")).click();
	
	
	//textbox
	
	driver.findElement(By.id("subject")).sendKeys("Email");
	
	//dropdown
	
	WebElement ele=driver.findElement(By.id("q3"));
	System.out.println(ele.getText());
	
	Select s=new Select(ele);
	s.selectByVisibleText("Third Option");
	
	//radio button
	driver.findElement(By.xpath("//input[@value='Third Option']")).click();
	
  TakesScreenshot scr=(TakesScreenshot)driver;
  File source=scr.getScreenshotAs(OutputType.FILE);
  FileUtils.copyFile(source,new File("C:\\Users\\91978\\Desktop\\screenshot\\screen.jpeg"));
	}	
	

}