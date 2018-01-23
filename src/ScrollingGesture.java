import java.net.MalformedURLException;
import java.util.concurrent.TimeUnit;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;

public class ScrollingGesture extends BaseMethod {

	public static void main(String[] args) throws MalformedURLException {
		// TODO Auto-generated method stub
		
		AndroidDriver<AndroidElement> driver = Capabilities();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.findElementByAndroidUIAutomator("text(\"Views\")").click(); 
		/*
		 * Latest version of appium does not support scrolling  feature 
		 * Earlier, there were two methods available for scrolling: scrollTo(String text) and 
		 * ScrollToExact(String text). However, recently, both functions have been deprecated.
		 * Here to solving this we have to use some android feature of scrolling  
		 * 
		 * "Public Method" new UiScrollable(new UiSelector()).scrollIntoView(text(\"WebView text\"));
		 * For doing so we have to import UiScrollable class from android.ScrollIntoView method scroll till 
		 * webView text is  visible.Here we are passing attribute(value) attribute as text and value as text name.    
		 * 
		 * UiSelector(Public Constructor) - Specifies the elements in the layout hierarchy for tests to target, filtered by properties such as
		 * text value, content-description, class name, and state information. 
		 * You can also target an element by its location in a layout hierarchy
		 * 

				Please check below combination
				
				Appium : 1.6.5
				
				Selenium : selenium-java-3.3.1
				
				Appium Java Client : java-client-5.0.0-BETA6        
		 */
        
		 driver.findElementByAndroidUIAutomator("new UiScrollable(new UiSelector()).scrollIntoView(text(\"ImageView\"));");
	
		//driver.findElementByAndroidUIAutomator("new UiScrollable(new UiSelector()).scrollIntoView(text(\"WebView\"));");
	
	}
}


