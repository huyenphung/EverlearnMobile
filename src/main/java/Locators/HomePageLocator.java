package Locators;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;

public class HomePageLocator {

	@FindBy(xpath = "//android.widget.TextView[@text='Preference']")
	public  AndroidElement Preference;
	
	@FindBy(xpath = "//android.widget.TextView[@text='3. Preference dependencies']")
	public  AndroidElement  Preferencedependencies;
	
	@FindBy(xpath = "//android.widget.CheckBox[@resource-id='android:id/checkbox']")
	public  AndroidElement  wifi;
}
