package Day6.day6test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Task1 {
	
	public static void main(String args[]) throws InterruptedException
	{
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://demo.opencart.com/index.php?route=account/register&language=en-gb");
		
		driver.findElement(By.xpath("//*[@id=\"input-firstname\"]")).sendKeys("Aishwarya");
		driver.findElement(By.xpath("//*[@id=\"input-lastname\"]")).sendKeys("S");
		driver.findElement(By.xpath("//*[@id=\"input-email\"]")).sendKeys("aishwaryas2307@gmail.com");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//*[@id=\"input-password\"]")).sendKeys("Aish@2003");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//*[@id=\"form-register\"]/div/div/button")).click();
		
	}

}
