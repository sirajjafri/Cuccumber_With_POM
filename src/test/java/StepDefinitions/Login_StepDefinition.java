package StepDefinitions;

import org.junit.Assert;

import com.qa.base.TestBase;
import com.qa.pages.HomePage;
import com.qa.pages.loginPage;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Login_StepDefinition extends TestBase {
	 // loginPage login = new loginPage();
	//  HomePage hpage= new HomePage();
	 HomePage hpage;
	 loginPage login;
	 
	@Given("^User opens the browser$")
	public void user_opens_the_browser() {
	   TestBase.initialization();
	}

	@When("^user is on login page$")
	public void user_is_on_login_page() throws Throwable {
		login = new loginPage();
	   String title= login.loginpage_title();
	   Assert.assertEquals("Free CRM software in the cloud powers sales and customer service", title);
	   Thread.sleep(5000);
	   
	}

	@Then("^user enter username and password and click Login button$")
	public void user_enter_username_and_password_and_click_Login_button() throws Throwable {
		
		login.homePage_login(prop.getProperty("username"), prop.getProperty("password"));
	}

	@Then("^home page is displayed$")
	public void home_page_is_displayed() throws Throwable {
		hpage= new HomePage();
		String home_title= hpage.homepage_title();
		Assert.assertEquals("CRMPRO", home_title);
	    
	}

	@Then("^validate home page title$")
	public void validate_home_page_title() throws Throwable {
	   
		String home_title= hpage.homepage_title();
		Assert.assertEquals("CRMPRO", home_title);
	}

	@Then("^validate logged in user name$")
	public void validate_logged_in_user_name() throws Throwable {
		driver.switchTo().frame("mainpanel");
	   boolean user_name= hpage.loggedin_user();
	   Assert.assertTrue(user_name);
	}

	@Then("^close the browser$")
	public void close_the_browser() throws Throwable {
		
		driver.quit();
	   
	}

}
