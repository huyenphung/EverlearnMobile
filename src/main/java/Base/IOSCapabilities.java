package Base;

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.remote.DesiredCapabilities;


import Config.PropertyFileReader;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.ios.IOSDriver;
import io.appium.java_client.ios.IOSElement;
import io.appium.java_client.remote.AutomationName;
import io.appium.java_client.remote.MobileCapabilityType;

public class IOSCapabilities {
	IOSDriver<IOSElement> driver;	
	static	PropertyFileReader getInformation= new PropertyFileReader();
	
public static IOSDriver<IOSElement> Initial() throws MalformedURLException {
	DesiredCapabilities cap= new DesiredCapabilities();
	cap.setCapability(MobileCapabilityType.DEVICE_NAME, "iPhone XR");// the name of virtual device
	cap.setCapability(MobileCapabilityType.PLATFORM_NAME, "IOS");
	cap.setCapability(MobileCapabilityType.AUTOMATION_NAME,AutomationName.IOS_XCUI_TEST);//this sentance is always correct
	cap.setCapability(MobileCapabilityType.NEW_COMMAND_TIMEOUT, "25");
	cap.setCapability(MobileCapabilityType.APP,getInformation.Location());


	IOSDriver<IOSElement> driver = new IOSDriver(new URL("http://127.0.0.1:4723/wd/hub"),cap);//this sentance is always correct
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	return driver;

	}

}
