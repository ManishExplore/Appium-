import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.remote.MobileCapabilityType;
import io.appium.java_client.remote.MobilePlatform;

public class BaseMethod {

	public static AndroidDriver<AndroidElement> Capabilities() throws MalformedURLException {
		// TODO Auto-generated method stub
		
		File f = new File("src");
		File fs = new File(f,"ApiDemos-debug.apk");
		
// For running any test case on Appium we need two thing 1st device/emulator and 2nd the app basically our desired capabilities.
		DesiredCapabilities capabilities = new DesiredCapabilities();
		
		//This capability is used when we run through emulator
		//capabilities.setCapability(MobileCapabilityType.DEVICE_NAME,"ManishEmulator");
		
		capabilities.setCapability(MobileCapabilityType.DEVICE_NAME,"Android Device");
		capabilities.setCapability(MobileCapabilityType.PLATFORM_NAME, MobilePlatform.ANDROID);
		capabilities.setCapability(MobileCapabilityType.APP,fs.getAbsolutePath());
		
		//This capability is used when we run through emulator
		//capabilities.setCapability(MobileCapabilityType.PLATFORM_VERSION,"8.1.0");
		
/*Here we need to pass two argument 1st connection to the server where appium server is running which 
is nothing but 127.0.0.1 our local host address and 4723 in nothing but the port address of appium
 and wd/hub is web driver hub and the reference object.*/
		AndroidDriver<AndroidElement> driver = new AndroidDriver<>(new URL("http://127.0.0.1:4723/wd/hub"),capabilities);
	return driver;
	}
	

}
