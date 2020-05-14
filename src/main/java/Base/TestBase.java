package Base;

import java.net.MalformedURLException;
import java.util.concurrent.TimeUnit;

import org.apache.log4j.Logger;

import Config.PropertyFileReader;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.remote.MobileCapabilityType;

public class TestBase extends Capabilities {
	public static Logger log = Logger.getLogger(TestBase.class);
	
	public static   Capabilities reader;
	public   MobileDriver<MobileElement> driver;
	static	PropertyFileReader getInformation= new PropertyFileReader();
	String deviceType = getInformation.DeviceType().toLowerCase();
	
	public TestBase() 
	{
		switch (deviceType) {
		
		case "ios":
			try {
				this.driver = reader.InitialIOS();
				driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			} catch (MalformedURLException e) {
				e.printStackTrace();
			}
		
		case "android":
			try {
				this.driver = reader.InitialAndroid();
				driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			} catch (MalformedURLException e) {
				e.printStackTrace();
			}
		}
		
		
		
		
	}
	
	

}
