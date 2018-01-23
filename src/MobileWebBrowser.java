import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.remote.MobileCapabilityType;
import io.appium.java_client.remote.MobilePlatform;

public class MobileWebBrowser {
	public static AndroidDriver<AndroidElement> Capabilities() throws MalformedURLException {
DesiredCapabilities capabilities = new DesiredCapabilities();
		
		//This capability is used when we run through emulator
		
        
		capabilities.setCapability(MobileCapabilityType.DEVICE_NAME,"Android Device");
		capabilities.setCapability(MobileCapabilityType.BROWSER_NAME, "Chrome");
		//capabilities.setCapability(MobileCapabilityType.PLATFORM_NAME, MobilePlatform.ANDROID);
		
		AndroidDriver<AndroidElement> driver = new AndroidDriver<>(new URL("http://127.0.0.1:4723/wd/hub"),capabilities);
		return driver;
		
	}

}
