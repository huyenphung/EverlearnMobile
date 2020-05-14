package Actions;

import java.net.MalformedURLException;

import org.openqa.selenium.By;
import org.openqa.selenium.support.PageFactory;

import Base.Capabilities;
import Base.TestBase;
import Locators.HomePageLocator;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;



public class HomepageAction {
	
	
HomePageLocator HomePageLocator = new HomePageLocator();
public TestBase testBase = new TestBase();

	public HomepageAction()  {
		
		PageFactory.initElements(new AppiumFieldDecorator(testBase.driver), HomePageLocator);
		
	}

	public void ClickOnPreference() throws MalformedURLException
	{
		HomePageLocator.Preference.click();	
	}
	public void ClickOnPreferencedependencies() throws MalformedURLException
	{
		HomePageLocator.Preferencedependencies.click();	
	}
	
	public void ClickOnwifi() throws MalformedURLException
	{
		HomePageLocator.wifi.click();	
	}
	
}
