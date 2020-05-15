package Locators;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;

public class LoginLocator {

	@FindBy(xpath = "//android.widget.TextView[@text='Log in by email']")
	public  AndroidElement LoginByEmail;
	
	@FindBy(xpath = "//android.widget.TextView[@text='Log in by email']")
	public  AndroidElement EnterEmail;
	
}
