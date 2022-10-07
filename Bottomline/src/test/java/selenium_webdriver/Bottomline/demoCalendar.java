package selenium_webdriver.Bottomline;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
public class demoCalendar {
	static WebDriver driver;
	public static String[] getmonthyear(String monthyear) {
	return monthyear.split(" ");
	}
	
	
	
	public static void main(String[] args) throws InterruptedException, IOException {
	//to open browser
		driver=BrowserIntiate.browsersetup();
	
	driver.get("https://www.goibibo.com");
	WebElement from=driver.findElement(By.xpath("//div[contains(@class,'sc-bkkeKt')]//p"));
	from.click();
	WebElement fromtext=driver.findElement(By.xpath("//div[contains(@class,'sc-cidDSM dOEpbS')]//input"));
	fromtext.sendKeys("chennai");
	Thread.sleep(1000);
	driver.findElement(By.xpath("(//ul[@id='autoSuggest-list']//li)[1]")).click();
	WebElement totext=driver.findElement(By.xpath("//div[contains(@class,'sc-cidDSM dOEpbS')]//input"));
	totext.sendKeys("bangalore");
	Thread.sleep(1000);
	driver.findElement(By.xpath("(//ul[@id='autoSuggest-list']//li)[1]")).click();

	while(true) {
	String datecaption=driver.findElement(By.xpath("(//div[@class='DayPicker-Caption']//div)[1]")).getText();
	if(getmonthyear(datecaption)[0].equals("November")) {
	break;
	}else {
	driver.findElement(By.xpath("(//div[@class='DayPicker-NavBar']//span)[2]")).click();

	}

	}
	}
	}


