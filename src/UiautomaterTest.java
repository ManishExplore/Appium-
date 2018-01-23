import java.net.MalformedURLException;
import java.util.concurrent.TimeUnit;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;

public class UiautomaterTest extends BaseMethod {

	public static void main(String[] args) throws MalformedURLException {
		// TODO Auto-generated method stub
		
		AndroidDriver<AndroidElement> driver = Capabilities();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		//driver.findElementByAndroidUIAutomator("attributes(value)");
		// java does not understand " " under " " so for resolving that we need to put some special char in between that.
		
		driver.findElementByAndroidUIAutomator("text(\"Views\")").click();
		/*
		 * validate clickable feature for all the elements.
		 * for doing that we need to use same androiduiautomator but clickable is not a attributes it's
		 * it's a property of an object so we can't pass attributes(value) we have to append new Uiselecter()
		 * function before that.
		 * 
		 * driver.findElementByAndroidUIAutomator("new UiSelector().clickable(true)");
		 * 
		 */
		
	System.out.println(driver.findElementByAndroidUIAutomator("new UiSelector().clickable(true)").getSize());

	}

}
