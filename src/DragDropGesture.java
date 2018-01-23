import java.net.MalformedURLException;
import java.util.concurrent.TimeUnit;

import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;

public class DragDropGesture extends BaseMethod {

	public static void main(String[] args) throws MalformedURLException  {
		// TODO Auto-generated method stub
		
		AndroidDriver<AndroidElement> driver = Capabilities();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.findElementByAndroidUIAutomator("text(\"Views\")").click();
		driver.findElementByXPath("//android.widget.TextView[@text='Drag and Drop']").click();
		TouchAction t = new TouchAction(driver);
		//t.longPress(driver.findElementByClassName("android.view.View").get(0)
		t.longPress(driver.findElementByXPath("//android.view.View[@index='1']")).moveTo(driver.findElementByXPath("//android.view.View[@index='4']")).release().perform();
		
		

	}

}
