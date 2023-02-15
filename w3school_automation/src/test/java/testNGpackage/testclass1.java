package testNGpackage;

import java.util.ArrayList;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import pom_modules.w3school_home_page;
import pom_modules.w3school_login_page;
import pom_modules.w3school_sign_up;

public class testclass1 {

	private WebDriver driver;
	
	@BeforeClass
	public void launchBrowser() {
		System.out.println("@Before Class");
		System.setProperty("webdriver.chrome.driver","D:\\shweta class\\automation\\selenium\\chromedriver_win32 (2)\\chromedriver.exe\\");
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().window().maximize();
	}
	
	@BeforeMethod
	public void openHomePage() throws InterruptedException {
		driver.get("http://www.w3schools.com/");
		Thread.sleep(3000);
		w3school_home_page homepage = new w3school_home_page(driver);
		homepage.clickonlogin();
		
		w3school_login_page signuppage = new w3school_login_page(driver);
		signuppage.clickonsignup();
	}
	
	@Test
	public void verifyTermsOfService() {
		w3school_sign_up signupform = new w3school_sign_up(driver);
		signupform.clickontermsofservice();
		
		ArrayList<String> addr = new ArrayList<String>(driver.getWindowHandles());
		driver.switchTo().window(addr.get(1));
		
		String expectedURL = "https://www.w3schools.com/about/about_copyright.asp";
		String actualURl = driver.getCurrentUrl();
		if(expectedURL.equals(actualURl))
		{
			System.out.println("PASS");
		}
		else
		{
			System.out.println("FAIL");
		}
	}
	
	@Test
	public void verifyPrivacyPolicy() {
		w3school_sign_up signupform = new w3school_sign_up(driver);
		signupform.clickonprivacypolicy();
		
		ArrayList<String> addr = new ArrayList<String>(driver.getWindowHandles());
		driver.switchTo().window(addr.get(1));
		
		String expectedURL = "https://www.w3schools.com/about/about_privacy.asp";
		String actualURl = driver.getCurrentUrl();
		if(expectedURL.equals(actualURl))
		{
			System.out.println("PASS");
		}
		else
		{
			System.out.println("FAIL");
		}
	}
	
	@Test
	public void verifySignUpForm() {
		w3school_sign_up signupform = new w3school_sign_up(driver);
		signupform.sendemail("shwetasonawane1992@gmail.com");
		signupform.sendpassword("#Shwetass03");
		signupform.clickonsignupforfree();
		
		String expectedURL = "https://profile.w3schools.com/log-in?redirect_url=https%3A%2F%2Fmy-learning.w3schools.com";
		String actualURl = driver.getCurrentUrl();
		if(expectedURL.equals(actualURl))
		{
			System.out.println("PASS");
		}
	    else
		{
			System.out.println("FAIL");
		}
	}

	@AfterMethod
	public void goBackToMainPage() {
		ArrayList<String> addr = new ArrayList<String>(driver.getWindowHandles());
		driver.switchTo().window(addr.get(0));
	}
	
	@AfterClass
	public void closeTheBrowser() {
		driver.quit();
	}

}
