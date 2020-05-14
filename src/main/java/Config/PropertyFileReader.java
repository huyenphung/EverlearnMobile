package Config;


import java.io.IOException;
import java.util.Properties;





public class PropertyFileReader {
	
	Properties properties=null;
	
	public PropertyFileReader() {
		properties=new Properties();
		try {
			properties.load(PathHelper.getInputStreamResourcePath("/src/main/resources/ConfigurationFile/config.properties"));
		} catch (IOException e) {
			e.printStackTrace();
		}
	}


	public String Location() {
		return properties.getProperty("location");
	}

	public String DeviceName() {
		return properties.getProperty("device");
	}
	public String DeviceType() {
		return properties.getProperty("deviceType");
	}

	
	}
