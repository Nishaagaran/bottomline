package selenium_webdriver.Bottomline;

import java.io.IOException;
import java.util.Scanner;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class FramesDemo {
	static WebDriver driver;	
	public static void main(String[] args) throws IOException
	{
		
		driver=BrowserIntiate.browsersetup();
		
		driver.get("https://www.browserstack.com/");
		
		WebElement mouse_hover=driver.findElement(By.id("product-menu-toggle"));
		Actions act=new Actions(driver);
		
		act.moveToElement(mouse_hover).build().perform();
		
		
		//drag and drop
		
		
		WebElement droplink=driver.findElement(By.linkText("Droppable"));
		
		WebElement fr=driver.findElement(By.className("demo-frame"));
		driver.switchTo().frame(fr);
	WebElement drag=driver.findElement(By.id("draggable"));
WebElement drop=driver.findElement(By.id("droppable"));
	
act.dragAndDrop(drag, drop).build().perform();
//context click
	
	
	//act.moveToElement(mouse_hover).build().perform();
	act.contextClick(droplink).sendKeys(Keys.DOWN,Keys.ENTER).build().perform();
	
	}
	
	
	
}
