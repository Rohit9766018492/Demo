package com.qa.PageLayer;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task3 {
	
	public static void main(String args[])
	{
System.setProperty("webdriver.chrome.driver", "D:\\Chrome\\chromedriver_win32//chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("  https://www.flexiquiz.com/SC/S?p=8c634314-8285-452a-9266-a5811749999c/index.php");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.manage().deleteAllCookies();
		
		driver.findElement(By.xpath("//a[@class='login']")).click();
		

		driver.findElement(By.xpath("//input[@id='email']")).sendKeys("tnqtestlab@gmail.com");
		driver.findElement(By.xpath("//input[@id='passwd']")).sendKeys(" test@1234");
		JavascriptExecutor js=(JavascriptExecutor)driver;
		//js.executeScript("Window.scrollBy(0,200));
		driver.findElement(By.xpath("(//button[@type='submit'])[3]")).click();
		
		
	}
}
