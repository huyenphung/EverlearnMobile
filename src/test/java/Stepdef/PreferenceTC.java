package Stepdef;

import java.net.MalformedURLException;

import org.openqa.selenium.By;

import Actions.HomepageAction;
import Base.TestBase;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;

public class PreferenceTC {

	HomepageAction homepage = new HomepageAction();
	
//	@Given("^I lauch app$")
//	public void i_lauch_app() throws Throwable {
//	TestBase testBase = new TestBase();
//   testBase.reader.Initial();
//	}

	@When("^i click on preferences$")
	public void i_click_on_preferences()  throws Throwable  {
		
		homepage.ClickOnPreference();
		
		
	}
	@And("^i click on Preference dependencies$")
	public void i_click_on_Preference_dependencies() throws Throwable {
		
		homepage.ClickOnPreferencedependencies();
	}

	@And("^i check on Wifi$")
	public void i_check_on_Wifi() throws Throwable {
		
		homepage.ClickOnwifi();
	}


}
