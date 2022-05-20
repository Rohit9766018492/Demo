package com.qa.PageLayer;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Flipkart {

	public static void main(String args[])
	{
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.flipkart.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.findElement(By.xpath("//button[@class='_2KpZ6l _2doB4z']")).click();
		
		driver.findElement(By.xpath("//input[@class='_3704LK']")).sendKeys("Iphone"+Keys.ENTER);
		
		driver.findElement(By.xpath("//div[text()='APPLE iPhone 11 (White, 64 GB)']")).click();
		
		String MainWindowID = driver.getWindowHandle();
		System.out.println(MainWindowID);
		
	  Set<String> AllWindowID = driver.getWindowHandles();
	  
	  for(String child:AllWindowID)
	  {
		  System.out.println(child);
		  
		  if(!(MainWindowID.equals(child)))
			  
		  {
			  driver.switchTo().window(child);
			  driver.findElement(By.xpath("//button[@class='_2KpZ6l _2U9uOA _3v1-ww']")).click();
			  System.out.println("Add to cart click");
		  }
	  }
		driver.quit();
	}
}
