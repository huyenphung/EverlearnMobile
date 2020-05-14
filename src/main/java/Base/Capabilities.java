package Base;

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.remote.DesiredCapabilities;


import Config.PropertyFileReader;
import io.appium.java_client.MobileDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.ios.IOSDriver;
import io.appium.java_client.ios.IOSElement;
import io.appium.java_client.remote.AutomationName;
import io.appium.java_client.remote.MobileCapabilityType;

public class Capabilities {

static	PropertyFileReader getInformation= new PropertyFileReader();


public  MobileDriver<MobileElement> InitialAndroid() throws MalformedURLException {
	
DesiredCapabilities cap= new DesiredCapabilities();
cap.setCapability(MobileCapabilityType.DEVICE_NAME, getInformation.DeviceName());//Pixel2 is the name of virtual device
cap.setCapability(MobileCapabilityType.AUTOMATION_NAME,"uiautomator2");//this sentance is always correct
cap.setCapability(MobileCapabilityType.APP,getInformation.Location());
MobileDriver<MobileElement> driver = new AndroidDriver(new URL("http://127.0.0.1:4723/wd/hub"),cap);//this sentance is always correct
return driver;

	}

public MobileDriver<MobileElement> InitialIOS() throws MalformedURLException {
	DesiredCapabilities cap= new DesiredCapabilities();
	cap.setCapability(MobileCapabilityType.DEVICE_NAME, "iPhone XR");// the name of virtual device
	cap.setCapability(MobileCapabilityType.PLATFORM_NAME, "IOS");
	cap.setCapability(MobileCapabilityType.AUTOMATION_NAME,AutomationName.IOS_XCUI_TEST);//this sentance is always correct
	cap.setCapability(MobileCapabilityType.NEW_COMMAND_TIMEOUT, "25");
	cap.setCapability(MobileCapabilityType.APP,getInformation.Location());
	MobileDriver<MobileElement> driver = new IOSDriver(new URL("http://127.0.0.1:4723/wd/hub"),cap);//this sentance is always correct
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	return driver;

	}

}
