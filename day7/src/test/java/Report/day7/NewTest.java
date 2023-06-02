package Report.day7;

import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

import org.testng.annotations.BeforeTest;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;

public class NewTest {
	
	
	public WebDriver dr;
  @Test
  public void f() {
  }
  @BeforeTest
  public void beforeTest() {
	  
	  WebDriverManager.chromedriver().setup();
	  dr= new ChromeDriver();
	  dr.manage().window().maximize();
	  dr.get("https://demo.wpeverest.com/user-registration/guest-registration-form/");
	  String title="Guest Registration Form";
	  String ctitle=dr.getTitle();
	  Assert.assertEquals(title, ctitle);
	  
	  
  }

  @AfterTest
  public void afterTest() {
  }

}
