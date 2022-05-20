package com.qa.PageLayer;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import com.qa.TestBase.TestBase;

public class Task1 extends TestBase{

	public Task1()
	{
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//a[@title='Contact Us']")
	private WebElement Contact;
	
	@FindBy(xpath="//label[@for='id_contact']")
	private WebElement Subject;
	
	@FindBy(xpath="//label[@for='email']")
	private WebElement Email;
	
	@FindBy(xpath="//input[@type='file']")
	private WebElement SelectFile;
	
	@FindBy(xpath="//textarea[@class='form-control']")
	private WebElement Massage;
	
	@FindBy(xpath="//span[text()='Send']")
	private WebElement Send;
	
	public void contact()
	{
		Contact.click();
	}
	public void subject()
	{
		Subject.click();
		Select s=new Select(Subject);
		s.deselectByValue("1");
	}
	public void email()
	{
		Email.sendKeys("rohitsawant19695@gmail.com");
	}
	public void selectFile()
	{
		SelectFile.click();
	}
	public void massage()
	{
		Massage.sendKeys(" Hi I am able to Click on Contact.");
	}
	public void send()
	{
		 Send.click();
	}
}
