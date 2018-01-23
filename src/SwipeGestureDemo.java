import java.net.MalformedURLException;
import java.util.concurrent.TimeUnit;

import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;

public class SwipeGestureDemo extends BaseMethod {

	public static void main(String[] args) throws MalformedURLException {
		// TODO Auto-generated method stub
		
		AndroidDriver<AndroidElement> driver = Capabilities();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.findElementByAndroidUIAutomator("text(\"Views\")").click();
		driver.findElementByXPath("//android.widget.TextView[@text='Date Widgets']").click();
		driver.findElementByAndroidUIAutomator("text(\"2. Inline\")").click();
		/*
		 *  click on 9. We don't have id & text so we can use xpath in that case //target[@attribute = 'value']
		 *  Basically our target or tagname = class name but whenever class name contain any special char appium 
		 *  is not able to recoinage that like here class name of 9 = "android.widget.RadialTimePickerView$RadialPickerTouchHelper"
		 *  In case of handling such scenario we use '*' as a target/tagname. 
		 *  How it's work - Basically '*' looks for all tag name and match with our given condition [@content-desc='9']. 
		 */
		driver.findElementByXPath("//*[@content-desc='9']").click();
		/*
		 * Swiping Step manually - Press there - hold/wait for some time - move it - release 
		 * the same thing we implement herein our script.
		 */
		TouchAction t = new TouchAction(driver);
		//swipe method is deprecated by appium driver.swip(source,destination) but now we have to use it like below.
		t.press(driver.findElementByXPath("//*[@content-desc='15']")).waitAction(2000).moveTo(driver.findElementByXPath("//*[@content-desc='45']")).release().perform();
		
		
		
		

	}

}
