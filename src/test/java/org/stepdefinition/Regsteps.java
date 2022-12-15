package org.stepdefinition;

import java.util.concurrent.TimeUnit;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Regsteps {
	static WebDriver driver;
	

	
	@Given("The user should be open in kohls homepagess")
	public void the_user_should_be_open_in_kohls_homepagess() {
		WebDriverManager.chromedriver().setup();
	     driver=new ChromeDriver();
	    
	    driver.get("https://www.kohls.com/");
	    
	    driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	    driver.manage().window().maximize();
	}

	@When("The user has to click join signin options")
	public void the_user_has_to_click_join_signin_options() {
	    
		WebElement accountclk = driver.findElement(By.id("utility-nav"));
		accountclk.click();
		
		WebElement crtaccunt = driver.findElement(By.xpath("//a[text()='Create Account ']"));
		crtaccunt.click();
		
	}

	@Then("message for valid dircetion")
	public void message_for_valid_dircetion() {
		WebDriverWait w=new WebDriverWait(driver,20);
		w.until(ExpectedConditions.urlContains("createaccount"));
		 Assert.assertTrue("verify url", driver.getCurrentUrl().contains("createaccount"));
		    System.out.println("valid page");
		    driver.quit();
	}

	
	@Given("The user has to open kohls homepage")
	public void the_user_has_to_open_kohls_homepage() {
		WebDriverManager.chromedriver().setup();
	     driver=new ChromeDriver();
	    
	    driver.get("https://www.kohls.com/");
	    
	    driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	    driver.manage().window().maximize();
	}

	@When("The user has to click the signin options")
	public void the_user_has_to_click_the_signin_options() {
		WebElement accountclk = driver.findElement(By.id("utility-nav"));
		accountclk.click();
		
		WebElement crtaccunt = driver.findElement(By.xpath("//a[text()='Create Account ']"));
		crtaccunt.click();
		}

	@When("give invalid mail id and click outside the application")
	public void give_invalid_mail_id_and_click_outside_the_application() {
		WebElement email = driver.findElement(By.xpath("//input[@class='signup-email-input']"));
		email.sendKeys("gadjfjboifkn");
		
		WebElement msg = driver.findElement(By.id("signupAccountForm"));
		msg.click();
	}

	@Then("error message for plz enter valid email")
	public void error_message_for_plz_enter_valid_email() throws InterruptedException {
		Thread.sleep(3000);
	     boolean displayed = driver.findElement(By.xpath("//div[text()='Please enter valid Email']")).isDisplayed();
	     Assert.assertTrue(displayed);
	     System.out.println("incorrect email id");
	     driver.quit();
	}

	@Given("The user should be open in kohls homepage")
	public void the_user_should_be_open_in_kohls_homepage() {
		WebDriverManager.chromedriver().setup();
	     driver=new ChromeDriver();
	    
	    driver.get("https://www.kohls.com/");
	    
	    driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	    driver.manage().window().maximize();
	}
	@When("The user has to click the signin optionss")
	public void the_user_has_to_click_the_signin_optionss() {
		WebElement accountclk = driver.findElement(By.id("utility-nav"));
		accountclk.click();
		
		WebElement crtaccunt = driver.findElement(By.xpath("//a[text()='Create Account ']"));
		crtaccunt.click();
	}



	@When("give invalid mobilenum and click outside the application")
	public void give_invalid_mobilenum_and_click_outside_the_application() {
		
		WebElement mobile = driver.findElement(By.xpath("//input[@class='signup-tel-input hydrated']"));
	    mobile.sendKeys("5678");
	    WebElement msg = driver.findElement(By.id("signupAccountForm"));
	    msg.click();
	}

	@Then("error message for plz enter valid mobile num")
	public void error_message_for_plz_enter_valid_mobile_num() throws InterruptedException {
		Thread.sleep(3000);
	     boolean displayed = driver.findElement(By.xpath("//div[text()='Please enter valid Mobile']")).isDisplayed();
	     Assert.assertTrue(displayed);
	     System.out.println("invalid mobile number");
	}

	@Given("The user has to open kohls homepages")
	public void the_user_has_to_open_kohls_homepages() {
		WebDriverManager.chromedriver().setup();
	     driver=new ChromeDriver();
	    
	    driver.get("https://www.kohls.com/");
	    
	    driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	    driver.manage().window().maximize();
	}

	@When("The user has to click the signin button")
	public void the_user_has_to_click_the_signin_button() {
		WebElement accountclk = driver.findElement(By.id("utility-nav"));
		accountclk.click();
		
		WebElement crtaccunt = driver.findElement(By.xpath("//a[text()='Create Account ']"));
		crtaccunt.click();
	}

	@When("give correct password and give incorrct password in confirmpasswordfield")
	public void give_correct_password_and_give_incorrct_password_in_confirmpasswordfield() {
	    WebElement password = driver.findElement(By.name("pw"));
	    password.sendKeys("Afdf678999");
	    WebElement crctpaswrd = driver.findElement(By.name("cpw"));
	    crctpaswrd.sendKeys("67889");
	    
	}

	@Then("error message for password do not match")
	public void error_message_for_password_do_not_match() throws InterruptedException {
		Thread.sleep(3000);
	    boolean displayed = driver.findElement(By.xpath("//div[text()='Passwords do not match']")).isDisplayed();
	    Assert.assertTrue(displayed);
	    System.out.println("password not match");
	}

	@Given("The user has to open kohls homepage url")
	public void the_user_has_to_open_kohls_homepage_url() {
		WebDriverManager.chromedriver().setup();
	     driver=new ChromeDriver();
	    
	    driver.get("https://www.kohls.com/");
	    
	    driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	    driver.manage().window().maximize();
	}

	@When("The user has to click the signin option")
	public void the_user_has_to_click_the_signin_option() {
		WebElement accountclk = driver.findElement(By.id("utility-nav"));
		accountclk.click();
		
		WebElement crtaccunt = driver.findElement(By.xpath("//a[text()='Create Account ']"));
		crtaccunt.click();
	}

	@When("give incorrect password")
	public void give_incorrect_password() {
		WebElement password = driver.findElement(By.name("pw"));
	    password.sendKeys("8999");
	}

	@Then("error message for invalid password should be displayed")
	public void error_message_for_invalid_password_should_be_displayed() throws InterruptedException {
		Thread.sleep(5000);
		
	   boolean empty = driver.findElements(By.xpath("//img[@src='/account/media/images/enableaccount/ic-cross-circle-filled.png']")).isEmpty();
	Assert.assertFalse(empty);
	System.out.println("password error message");
	
	}
	@Given("The user has to open then kohls homepage")
	public void the_user_has_to_open_then_kohls_homepage() {
		WebDriverManager.chromedriver().setup();
	     driver=new ChromeDriver();
	    
	    driver.get("https://www.kohls.com/");
	    
	    driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	    driver.manage().window().maximize();
	}

	@When("The user has to click the signin")
	public void the_user_has_to_click_the_signin() {
		WebElement accountclk = driver.findElement(By.id("utility-nav"));
		accountclk.click();
		
		WebElement sgnin = driver.findElement(By.xpath("//div[text()=' SIGN IN ']"));
		sgnin.click();
	}

	@When("give correct username and  password")
	public void give_correct_username_and_password() {
	    WebElement username = driver.findElement(By.id("kiosk_loginEmail"));
	    username.sendKeys("ssmatrix@gmail.com");
	     WebElement pass = driver.findElement(By.id("kiosk_loginPassword"));
	     pass.sendKeys("Abcd2345678");
	}

	@Then("redirection should happen to my account page")
	public void redirection_should_happen_to_my_account_page() {
		WebDriverWait w=new WebDriverWait(driver,20);
		w.until(ExpectedConditions.urlContains("kohls"));
	   Assert.assertTrue("Verify URL",driver.getCurrentUrl().contains("kohls"));
	   System.out.println("valid page");
	   driver.quit();


}
	
	@Given("The user has to open then kohls account")
	public void the_user_has_to_open_then_kohls_account() {
		WebDriverManager.chromedriver().setup();
	     driver=new ChromeDriver();
	    
	    driver.get("https://www.kohls.com/");
	    
	    driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	    driver.manage().window().maximize();
	}

	@When("The user has to open the signin options")
	public void the_user_has_to_open_the_signin_options() {
		WebElement accountclk = driver.findElement(By.id("utility-nav"));
		accountclk.click();
		
		WebElement sgnin = driver.findElement(By.xpath("//div[text()=' SIGN IN ']"));
		sgnin.click();
	}

	@When("give to the incorrect userid and  pasword")
	public void give_to_the_incorrect_userid_and_pasword() {
		WebElement username = driver.findElement(By.id("kiosk_loginEmail"));
	    username.sendKeys("tyikjilij");
	     WebElement pass = driver.findElement(By.id("kiosk_loginPassword"));
	     pass.sendKeys("drdff");
	}

	@Then("redirection should happen to my account url")
	public void redirection_should_happen_to_my_account_url() {
		WebDriverWait w=new WebDriverWait(driver,20);
		w.until(ExpectedConditions.urlContains("kohls_login"));
	   Assert.assertTrue("Verify URL",driver.getCurrentUrl().contains("kohls_login"));
	   System.out.println("invalid page");
	   driver.quit(); 
	}


	@Given("The user should be open in kohls loginpage")
	public void the_user_should_be_open_in_kohls_loginpage() {
		WebDriverManager.chromedriver().setup();
	     driver=new ChromeDriver();
	    
	    driver.get("https://www.kohls.com/");
	    
	    driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	    driver.manage().window().maximize();
	}

	@When("The user has to click join and signin options")
	public void the_user_has_to_click_join_and_signin_options() {
		WebElement accountclk = driver.findElement(By.id("utility-nav"));
		accountclk.click();
		
		WebElement sgnin = driver.findElement(By.xpath("//div[text()=' SIGN IN ']"));
		sgnin.click();
	}

	@Then("message for valid login dircetion")
	public void message_for_valid_login_dircetion() {
		WebDriverWait w=new WebDriverWait(driver,20);
		w.until(ExpectedConditions.urlContains("kohls_login"));
	   Assert.assertTrue("Verify URL",driver.getCurrentUrl().contains("kohls_login"));
	   System.out.println("valid login link");
	   driver.quit();
	}
	
	@Given("The user has to open then kohls hmepag")
	public void the_user_has_to_open_then_kohls_hmepag() {
		WebDriverManager.chromedriver().setup();
	     driver=new ChromeDriver();
	    
	    driver.get("https://www.kohls.com/");
	    
	    driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	    driver.manage().window().maximize();
	}

	@When("The user has to open the signin button")
	public void the_user_has_to_open_the_signin_button() {
		WebElement accountclk = driver.findElement(By.id("utility-nav"));
		accountclk.click();
		
		WebElement sgnin = driver.findElement(By.xpath("//div[text()=' SIGN IN ']"));
		sgnin.click();
	}

	@When("give to the incorrect userid and  corrct pasword")
	public void give_to_the_incorrect_userid_and_corrct_pasword() {
		WebElement username = driver.findElement(By.id("kiosk_loginEmail"));
	    username.sendKeys("ftgfyg");
	     WebElement pass = driver.findElement(By.id("kiosk_loginPassword"));
	     pass.sendKeys("Abcd2345678");
	}

	@Then("redirection should happen to login")
	public void redirection_should_happen_to_login() {
		WebDriverWait w=new WebDriverWait(driver,20);
		w.until(ExpectedConditions.urlContains("kohls_login"));
	   Assert.assertTrue("Verify URL",driver.getCurrentUrl().contains("kohls_login"));
	   System.out.println("invalid username");
	   driver.quit();
	}

	@Given("The user has to select then kohls homepage")
	public void the_user_has_to_select_then_kohls_homepage() {
		WebDriverManager.chromedriver().setup();
	     driver=new ChromeDriver();
	    
	    driver.get("https://www.kohls.com/");
	    
	    driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	    driver.manage().window().maximize();
	}

	@When("The user has to click the sgnin option")
	public void the_user_has_to_click_the_sgnin_option() {
		WebElement accountclk = driver.findElement(By.id("utility-nav"));
		accountclk.click();
		
		WebElement sgnin = driver.findElement(By.xpath("//div[text()=' SIGN IN ']"));
		sgnin.click();
	}

	@When("give to the correct userid and  incorrct pasword")
	public void give_to_the_correct_userid_and_incorrct_pasword() {
		WebElement username = driver.findElement(By.id("kiosk_loginEmail"));
	    username.sendKeys("ssmatrix@gmail.com");
	     WebElement pass = driver.findElement(By.id("kiosk_loginPassword"));
	     pass.sendKeys("gfdfad");
	}

	@Then("redirection should be done loginpage")
	public void redirection_should_be_done_loginpage() {
		WebDriverWait w=new WebDriverWait(driver,20);
		w.until(ExpectedConditions.urlContains("kohls_login"));
	   Assert.assertTrue("Verify URL",driver.getCurrentUrl().contains("kohls_login"));
	   System.out.println("invalid password");
	   driver.quit();
	}



@Given("The user has to select then kohls homepage{int}")
public void the_user_has_to_select_then_kohls_homepage(Integer int1) {
	WebDriverManager.chromedriver().setup();
    driver=new ChromeDriver();
   
   driver.get("https://www.kohls.com/");
   
   driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
   driver.manage().window().maximize();
}

@When("The user has to click the sgnin option{int}")
public void the_user_has_to_click_the_sgnin_option(Integer int1) {
	WebElement accountclk = driver.findElement(By.id("utility-nav"));
	accountclk.click();
	
	WebElement sgnin = driver.findElement(By.xpath("//div[text()=' SIGN IN ']"));
	sgnin.click();
}

@Then("check for forget password and validate")
public void check_for_forget_password_and_validate() {
	boolean displayed = driver.findElement(By.xpath("//a[text()='Forgot password?']")).isDisplayed();
	 Assert.assertTrue(displayed);
	 System.out.println("forget password avilable");
	 driver.quit();
}





@Given("The user has to select then kohls homepage suc")
public void the_user_has_to_select_then_kohls_homepage_suc() {
WebDriverManager.chromedriver().setup();
driver=new ChromeDriver();

driver.get("https://www.kohls.com/");

driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
driver.manage().window().maximize();
}

@When("The user has to click the signin options suc")
public void the_user_has_to_click_the_signin_options_suc() {
WebElement accountclk = driver.findElement(By.id("utility-nav"));
accountclk.click();

WebElement crtaccunt = driver.findElement(By.xpath("//a[text()='Create Account ']"));
crtaccunt.click();
}

@When("give details to all input filds")
public void give_details_to_all_input_filds() {
WebElement email = driver.findElement(By.xpath("//input[@class='signup-email-input']"));
email.sendKeys("vk1@gmail.com");

WebElement mobile = driver.findElement(By.xpath("//input[@class='signup-tel-input hydrated']"));
mobile.sendKeys("2323232329");

WebElement first = driver.findElement(By.xpath("//input[@name='fn']"));
first.sendKeys("vk2");

WebElement last = driver.findElement(By.xpath("//input[@name='ln']"));
last.sendKeys("vk2");

WebElement password = driver.findElement(By.name("pw"));
password.sendKeys("Vk2@3357");
WebElement crctpaswrd = driver.findElement(By.name("cpw"));
crctpaswrd.sendKeys("Vk2@3357");

WebElement cal = driver.findElement(By.xpath("//input[@name='dob']"));
cal.sendKeys("09091989");

WebElement check = driver.findElement(By.xpath("//span[@class='rc-anchor-center-item rc-anchor-checkbox-holder']"));
check.click();
WebElement crtaccunt = driver.findElement(By.xpath("//a[text()='Create Account ']"));
crtaccunt.click();

}

@Then("check for succesful login")
public void check_for_succesful_login() {
	WebDriverWait w=new WebDriverWait(driver,20);
	w.until(ExpectedConditions.urlContains("dashboard"));
	 Assert.assertTrue("verify url", driver.getCurrentUrl().contains("dashboard"));
	    System.out.println("succeful login");
	    driver.quit();
}







@Given("The user has to select then kohls homepage dup")
public void the_user_has_to_select_then_kohls_homepage_dup() {
	WebDriverManager.chromedriver().setup();
	driver=new ChromeDriver();

	driver.get("https://www.kohls.com/");

	driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	driver.manage().window().maximize();
}

@When("The user has to click the signin options dup")
public void the_user_has_to_click_the_signin_options_dup() {
	WebElement accountclk = driver.findElement(By.id("utility-nav"));
	accountclk.click();

	WebElement crtaccunt = driver.findElement(By.xpath("//a[text()='Create Account ']"));
	crtaccunt.click();
}

@When("give details duplicate values in input filds dup")
public void give_details_duplicate_values_in_input_filds_dup() {
	WebElement email = driver.findElement(By.xpath("//input[@class='signup-email-input']"));
	email.sendKeys("vk1@gmail.com");

	WebElement mobile = driver.findElement(By.xpath("//input[@class='signup-tel-input hydrated']"));
	mobile.sendKeys("2323232329");

	WebElement first = driver.findElement(By.xpath("//input[@name='fn']"));
	first.sendKeys("vk2");

	WebElement last = driver.findElement(By.xpath("//input[@name='ln']"));
	last.sendKeys("vk2");

	WebElement password = driver.findElement(By.name("pw"));
	password.sendKeys("Vk2@3357");
	WebElement crctpaswrd = driver.findElement(By.name("cpw"));
	crctpaswrd.sendKeys("Vk2@3357");

	WebElement cal = driver.findElement(By.xpath("//input[@name='dob']"));
	cal.sendKeys("09091989");

	WebElement check = driver.findElement(By.xpath("//span[@class='rc-anchor-center-item rc-anchor-checkbox-holder']"));
	check.click();
	WebElement crtaccunt = driver.findElement(By.xpath("//a[text()='Create Account ']"));
	crtaccunt.click();
}

@Then("Error thrown for duplicate values")
public void error_thrown_for_duplicate_values() {

    boolean displayed = driver.findElement(By.xpath("//div[text()='According to our records, you already have an account with this email address. Please enter a different email address or visit the Sign-In page.']")).isDisplayed();
    Assert.assertTrue(displayed);
    System.out.println("duplicate login");
}




@Given("The user has to select then kohls homepage man")
public void the_user_has_to_select_then_kohls_homepage_man() {
	WebDriverManager.chromedriver().setup();
	driver=new ChromeDriver();

	driver.get("https://www.kohls.com/");

	driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	driver.manage().window().maximize();

}

@When("The user has to click the signin options man")
public void the_user_has_to_click_the_signin_options_man() {
	WebElement accountclk = driver.findElement(By.id("utility-nav"));
	accountclk.click();

	WebElement crtaccunt = driver.findElement(By.xpath("//a[text()='Create Account ']"));
	crtaccunt.click();
}

@When("leave some mandatory filds as blank")
public void leave_some_mandatory_filds_as_blank() {
	WebElement crtaccunt = driver.findElement(By.xpath("//a[text()='Create Account ']"));
	crtaccunt.click();
}

@Then("naviation should not happen to dashboard page")
public void naviation_should_not_happen_to_dashboard_page() {
	Assert.assertTrue("verify url", driver.getCurrentUrl().contains("createaccount"));
    System.out.println("mandatory field pass");
    driver.quit();
}






}
