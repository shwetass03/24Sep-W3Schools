package pom_modules;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class w3school_login_page {
	
	//shweta

	@FindBy (xpath = "//input[@name='email']")
	private WebElement Email;
	
	@FindBy (xpath = "//input[@name='current-password']")
	private WebElement Password;
	
	@FindBy (xpath = "//span[text()='Log in']")
	private WebElement loginbutton;
	
	@FindBy (xpath = "//a[text()='Forgot password?']")
	private WebElement forgotpassword;
	
	@FindBy (xpath = "//span[text()=' Sign up']")
	private WebElement signup;
	
	public  w3school_login_page(WebDriver driver) 
	{
		PageFactory.initElements(driver, this);
	}
	
	public void sendemail(String email)
	{
		Email.sendKeys(email);
	}
	
	public void sendpassword(String password)
	{
		Password.sendKeys(password);
	}
	
	public void clickonloginbutton()
	{
		loginbutton.click();
	}
	
	public void clickonforgotpassword()
	{
		forgotpassword.click();
	}
	
	public void clickonsignup()
	{
		signup.click();
	}
}
