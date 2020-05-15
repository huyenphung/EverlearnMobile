package Actions;

import java.net.MalformedURLException;

import org.openqa.selenium.By;
import org.openqa.selenium.support.PageFactory;

import Base.Capabilities;
import Base.TestBase;
import Locators.LoginLocator;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;



public class LoginAction {
	
	
LoginLocator loginLocator = new LoginLocator();
 TestBase testBase = new TestBase();
 
 
	public LoginAction()  {
		
		PageFactory.initElements(new AppiumFieldDecorator(testBase.driver), loginLocator);
		
	}
	public void LoginButton() throws MalformedURLException
	{
		loginLocator.LoginByEmail.click();	
		
	}

	
}
