package com.qa.PageLayer;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class Task2 {

	public static void main(String args[]) throws IOException
	{
		System.setProperty("webdriver.chrome.driver", "D:\\Chrome\\chromedriver_win32//chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.get(" http://automationpractice.com/index.php?controller=contact");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.manage().deleteAllCookies();
		
		File screenshotFile=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		  File des=new File("C:\\Users\\Lenovo\\eclipse-workspace\\.metadata\\Constructor\\MyTest\\ScreenShot\\Pic2.png");
		  
		  FileHandler.copy(screenshotFile, des);
		  driver.quit();
		
	}
}
