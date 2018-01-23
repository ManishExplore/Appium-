import java.net.MalformedURLException;
import java.util.concurrent.TimeUnit;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;

public class HybrideAppTestingFunction extends HybridAppTesting{

	public static void main(String[] args) throws MalformedURLException {
		// TODO Auto-generated method stub

		AndroidDriver<AndroidElement> driver = Capabilities();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.findElementByXPath("//android.widget.EditText[@text = 'Phone Number']").sendKeys("9988776655");
		driver.findElementByAndroidUIAutomator("text(\"Password\")").sendKeys("Abcd@123");
		driver.findElementById("indwin.c3.shareapp:id/Login");
	}

}
