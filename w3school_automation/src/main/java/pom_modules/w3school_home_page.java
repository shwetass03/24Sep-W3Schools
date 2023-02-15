package pom_modules;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class w3school_home_page {

	@FindBy (xpath ="//a[@id='w3loginbtn']")
	private WebElement login;

	public  w3school_home_page(WebDriver driver) 
	{
		PageFactory.initElements(driver, this);
	}
	
	public void clickonlogin()
	{
		login.click();
	}
	
	
}
