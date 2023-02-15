package pom_modules;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class w3school_sign_up {

	@FindBy (xpath = "//input[@name='email']")
	private WebElement Email;
	
	@FindBy (xpath = "//input[@type='password']")
	private WebElement Password;
	
	@FindBy (xpath = "//button[@class='Button_button__URNp+ Button_primary__d2Jt3 Button_fullwidth__0HLEu']")
	private WebElement signupbutton;
	
	@FindBy (xpath = "//a[text()='Terms of Service']")
	private WebElement termsofservice;
	
	@FindBy (xpath = "//a[text()='Privacy Policy']")
	private WebElement privacypolicy;
	
	@FindBy (xpath = "//input[@placeholder='Add your first name']")
	private WebElement Firstname;
	
	@FindBy (xpath = "//input[@placeholder='Add your last name']")
	private WebElement Lastname;
	
	@FindBy (xpath = "//button[@class='Button_button__URNp+ Button_primary__d2Jt3 Button_fullwidth__0HLEu']")
	private WebElement ContiuneButton;
	
	@FindBy (xpath = "//span[text()='I have clicked the link']")
	private WebElement IHaveClickedTheLink;
	
	@FindBy (xpath = "//button[text()='Resend verification email']")
	private WebElement Resendverificationemail;
	
	public  w3school_sign_up(WebDriver driver) 
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
	
	public void clickonsignupforfree()
	{
		signupbutton.click();
	}
	
	public void clickontermsofservice()
	{
		termsofservice.click();
	}
	
	public void clickonprivacypolicy()
	{
		privacypolicy.click();
	}
	
	public void sendname(String name)
	{
		Firstname.click();
	}
	
	public void sendlastname(String lastname)
	{
		Lastname.click();
	}
	
	public void clickoncontiune()
	{
		ContiuneButton.click();
	}
	
	public void clickonIHaveClickedTheLink()
	{
		IHaveClickedTheLink.click();
	}
	
	public void clickonResendverificationemail()
	{
		Resendverificationemail.click();
	}
	
	
}
