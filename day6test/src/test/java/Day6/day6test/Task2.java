package Day6.day6test;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Task2 {

	public static void main(String[] args) throws InterruptedException {
		
	
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.wpeverest.com/user-registration/guest-registration-form/");
		Thread.sleep(3000);
		boolean a = driver.findElement(By.xpath("//*[@id=\"first_name\"]")).isDisplayed();
		boolean b = driver.findElement(By.xpath("//*[@id=\"user_email\"]")).isDisplayed();
		
		if (a==true&& b==true)
		{
			driver.findElement(By.xpath("//*[@id=\"first_name\"]")).sendKeys("Andrew");
			Thread.sleep(3000);
			driver.findElement(By.xpath("//*[@id=\"last_name\"]")).sendKeys("William");
			Thread.sleep(3000);
			driver.findElement(By.xpath("//*[@id=\"user_email\"]")).sendKeys("andrew@gmail.com");
			Thread.sleep(3000);
			driver.findElement(By.xpath("//*[@id=\"user_pass\"]")).sendKeys("saraandrew@2315");
			Thread.sleep(3000);
			driver.findElement(By.xpath("//*[@id=\"date_box_1665628538_field\"]/span/input[1]")).sendKeys("15/9/2003");
			Thread.sleep(3000);
			driver.findElement(By.xpath("//*[@id=\"radio_1665627729_Male\"]")).click();
			Thread.sleep(3000);
			driver.findElement(By.xpath("//*[@id=\"privacy_policy_1665633140\"]")).click();
			Thread.sleep(3000);
			driver.findElement(By.xpath("/html/body/div[1]/main/div/div/div/article/div/div/form/div[4]/button")).click();
			Thread.sleep(3000);
			String msg = driver.findElement(By.xpath("//*[@id=\"user-registration-form-771\"]/form/div[4]/button")).getText();
		}
	}

}
