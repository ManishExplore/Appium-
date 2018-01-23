import java.net.MalformedURLException;
import java.util.concurrent.TimeUnit;

import io.appium.java_client.TouchAction;

//import org.openqa.selenium.interactions.internal.TouchAction;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;

public class AndroidGesture extends BaseMethod {

	public static void main(String[] args) throws MalformedURLException {
		// TODO Auto-generated method stub
		
		AndroidDriver<AndroidElement> driver = Capabilities();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		driver.findElementByAndroidUIAutomator("text(\"Views\")").click();
		//driver.findElementByAndroidUIAutomator("text(\"Expandable Lists\")").click();
		
		/*
		 * Let's use here mobile gesture.
		 * 1st will be Tap - while execution tap action you will not get any difference between tap and
		 * click but it actual validate that feature.
		 * So for performing that we need to declare one touchAction 
		 * Difference between TouchAction and TouchActions.
		 * TouchAction objects contain a chain of events.
           In all the Appium client libraries, touch objects are created and are given a chain of events.
           The available events from the spec are: * press * release * moveTo * tap * wait * 
           longPress * cancel * perform.
         */
		// for TouchAction you have two package option to import one selenium and another from appium 
		//but you have to import appium package else system through error, error in TouchAction constructor.
		
		TouchAction t = new TouchAction(driver);
		
		//Calling the perform event sends the entire sequence of events to appium, and the touch gesture is run on your device.
		t.tap(driver.findElementByAndroidUIAutomator("text(\"Expandable Lists\")")).perform();
		driver.findElementByXPath("//android.widget.TextView[@text='1. Custom Adapter']").click();
		driver.findElementByAndroidUIAutomator("text(\"People Names\")");
		
		// here we are performing press and hold any element for 3 sec and then release it.
		t.press(driver.findElementByAndroidUIAutomator("text(\"People Names\")")).waitAction(3000).release().perform();
		System.out.println(driver.findElementByAndroidUIAutomator("text(\"Sample menu\")").getText());
		

	}

}
