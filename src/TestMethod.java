import java.net.MalformedURLException;
import java.util.concurrent.TimeUnit;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;

public class TestMethod extends HybrideBaseMethod{

	public static void main(String[] args) throws MalformedURLException {
		// TODO Auto-generated method stub
		
		
		AndroidDriver<AndroidElement> driver = Capabilities("emulator");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		// most important locater in android are - xpath,id,classname,androidUIautomater.
		/*How to make xpath ligic
		 * Tagname - in 99% of the case tagname is nothing but class name.
		 *   //tagname[@attribute = 'value']  
		 */
		driver.findElementByXPath("//android.widget.TextView[@text = 'Preference']").click();
		driver.findElementByXPath("//android.widget.TextView[@text = '3. Preference dependencies']").click();
		driver.findElementById("android:id/checkbox").click();
		driver.findElementByXPath("(//android.widget.RelativeLayout)[2]").click();
		driver.findElementByClassName("android.widget.EditText").sendKeys("Hello");
		driver.findElementsByClassName("android.widget.Button").get(1).click();
		
		

	}

}
