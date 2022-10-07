package TestNG;

import org.testng.annotations.Test;

import dev.failsafe.internal.util.Assert;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;

public class NewTest {
  @Test(priority=1)
  public void login() {
	  System.out.println("test 1:login ");
  }
  @Test(priority=2,enabled =false)
  public void application() {
	  System.out.println("Test 2:application");
  }
  
  @Test(priority=3)
  public void logout() {
	  System.out.println("Test 3: logout");
  }
  @BeforeClass
  public void beforeMethod() {
	  System.out.println("browser intiated");
	  org.testng.Assert.assertEquals("valid", "invalid");
  }

  @AfterClass
  public void afterMethod() {
	  System.out.println("browser closed");
  }

}
