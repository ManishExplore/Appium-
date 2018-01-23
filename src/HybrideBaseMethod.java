import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.remote.MobileCapabilityType;
import io.appium.java_client.remote.MobilePlatform;

public class HybrideBaseMethod {
	public static AndroidDriver<AndroidElement> Capabilities(String device) throws MalformedURLException {
		// TODO Auto-generated method stub
		
		File f = new File("src");
		File fs = new File(f,"ApiDemos-debug.apk");
		
		

		DesiredCapabilities capabilities = new DesiredCapabilities();
		if(device.equals("emulator"))
		{
		capabilities.setCapability(MobileCapabilityType.DEVICE_NAME,"ManishEmulator");
		capabilities.setCapability(MobileCapabilityType.PLATFORM_VERSION,"8.1.0");
		}
		else if(device.equals("real"))
		{
			capabilities.setCapability(MobileCapabilityType.DEVICE_NAME,"Android Device");
		}
		
		//capabilities.setCapability(MobileCapabilityType.DEVICE_NAME,"Android Device");
		capabilities.setCapability(MobileCapabilityType.PLATFORM_NAME, MobilePlatform.ANDROID);
		capabilities.setCapability(MobileCapabilityType.APP,fs.getAbsolutePath());
		
		
		AndroidDriver<AndroidElement> driver = new AndroidDriver<>(new URL("http://127.0.0.1:4723/wd/hub"),capabilities);
	return driver;
	}
}
