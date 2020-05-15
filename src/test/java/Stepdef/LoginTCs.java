package Stepdef;

import Actions.LoginAction;
import Base.TestBase;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class LoginTCs extends TestBase{
	
	LoginAction loginAction = new LoginAction();
	
	
	@Given("^select Login option$")
	public void select_Login_option() throws Throwable {
		loginAction.LoginButton();
	}

	@And("^i enter my email$")
	public void i_enter_my_email() throws Throwable {
		
	    
	}

	@And("^i select my tenant$")
	public void i_select_my_tenant() throws Throwable {
	    
	}

	@And("^i enter my password$")
	public void i_enter_my_password() throws Throwable {
	   
	}

	@And("^i submit$")
	public void i_submit() throws Throwable {
	    
	}

	@Then("^i login succesful$")
	public void i_login_succesful() throws Throwable {
	    
	}



}
