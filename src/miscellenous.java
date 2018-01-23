import java.net.MalformedURLException;
import java.util.concurrent.TimeUnit;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.android.AndroidKeyCode;

public class miscellenous extends BaseMethod {

	public static void main(String[] args) throws MalformedURLException {
		// TODO Auto-generated method stub
		AndroidDriver<AndroidElement> driver = Capabilities();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		//currentActivity method return 
		System.out.println(driver.currentActivity());
		
		//getContext method return type of app Native,Hybrid,WebView
		System.out.println(driver.getContext());
		
		//GetOrientation return our mobile is currently running in Portrait or Landscape mode 
		System.out.println(driver.getOrientation());
		
		//isLocked method return true if our mobile is locked
		System.out.println(driver.isLocked());
		
		//Use to hide open keyboard
		//driver.hideKeyboard();
		
		driver.findElementByAndroidUIAutomator("text(\"Views\")").click();
		//AndroidKeyCode is library of appium to handle key  stocks. Here we are pressing back button of mobile even we have option to directly press the home button and many more.  
		driver.pressKeyCode(AndroidKeyCode.BACK);

	}

}
