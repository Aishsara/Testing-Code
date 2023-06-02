package Selenium_Test.Testing;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Day1 {
	
	public static void main(String args[]) throws InterruptedException
	{
		WebDriverManager.chromedriver().setup();
		WebDriver dr = new ChromeDriver();
		
		//Task-1
		dr.get("https://demo.opencart.com/index.php?route=account/register&language=en-gb");
		
		dr.findElement(By.xpath("//*[@id=\"input-firstname\"]")).sendKeys("Aishwarya");
		Thread.sleep(3000);
		dr.findElement(By.xpath("//*[@id=\"input-lastname\"]")).sendKeys("S");
		Thread.sleep(3000);
		dr.findElement(By.xpath("//*[@id=\"input-email\"]")).sendKeys("aishwaryas2307@gmail.com");
		Thread.sleep(3000);
		dr.findElement(By.xpath("//*[@id=\"input-password\"]")).sendKeys("Aish@2003");
		Thread.sleep(5000);
		dr.findElement(By.xpath("//*[@id=\"form-register\"]/div/div/button")).click();
		
		Thread.sleep(3000);
		//Task-2;
		dr.navigate().to("https://demo.opencart.com/index.php?route=account/login&language=en-gb");
		Thread.sleep(3000);
		dr.findElement(By.xpath("//*[@id=\"input-email\"]")).sendKeys("aishwaryas2307@gmail.com");
		Thread.sleep(3000);
		dr.findElement(By.xpath("//*[@id=\"input-password\"]")).sendKeys("Aish@2003");
		Thread.sleep(3000);
		dr.findElement(By.xpath("//*[@id=\"form-login\"]/button")).click();
		Thread.sleep(3000);
		//Task-3.1
		
		dr.navigate().to("https://demo.opencart.com/index.php?route=account/register&language=en-gb");
		Thread.sleep(3000);	
		dr.findElement(By.id("input-firstname"));
		Thread.sleep(3000);
		dr.findElement(By.className("form-control"));
		Thread.sleep(3000);
		dr.findElement(By.name("email"));
		Thread.sleep(3000);
		dr.findElement(By.xpath("//*[@id=\"input-password\"]"));
		Thread.sleep(3000);
		dr.findElement(By.xpath("//*[@id=\"form-register\"]/fieldset[3]/div/label"));
		
		Thread.sleep(3000);
		//Task3.2,3.3,3.4
		dr.navigate().to("https://demo.opencart.com/");
		Thread.sleep(3000);
		dr.findElement(By.xpath("//*[@id=\"search\"]/input")).sendKeys("desktop",Keys.ENTER);
		Thread.sleep(3000);
		dr.navigate().back();
		dr.findElement(By.xpath("//*[@id=\"narbar-menu\"]/ul/li[1]/div/a")).click();
		dr.findElement(By.xpath("//*[@id=\"narbar-menu\"]/ul/li[1]/div/a")).click();
		dr.findElement(By.linkText("Returns")).click();
		Thread.sleep(3000);
		dr.navigate().back();
		dr.findElement(By.xpath("/html/body/footer/div/div/div[3]/ul/li[2]/a")).click();
		Thread.sleep(3000);
		dr.findElement(By.xpath("//*[@id=\"input-to-name\"]")).sendKeys("Amirva");
	Thread.sleep(5000)	;
	dr.quit();
		
		
	}


}
