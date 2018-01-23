import java.net.MalformedURLException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Dimension;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;

public class xyScrolling extends HybrideBaseMethod{

	public static void main(String[] args) throws MalformedURLException {
		// TODO Auto-generated method stub
		AndroidDriver<AndroidElement> driver = Capabilities("real");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		/*
		 *Get the size of screen.
		 * Dimension size = driver.manage().window().getSize();
	
	//Find swipe start and end point from screen's with and height.	
		
		//Find horizontal point where you wants to swipe. It is in middle of screen width.
		int startX = (int)(size.getWidth()/2);
	
       //Find starty point which is at bottom side of screen.
		int startY = (int)(size.getHeight()*80);
		
		//Find endy point which is at top side of screen.
		int endY = (int)(size.getHeight()*10);
		
		//Swipe from Bottom to Top.
		driver.swipe(startX, startY, startX, endY, 2000);
		
		//Swipe from Top to Bottom.
          driver.swipe(startX, endY, startX, startY, 3000);
		*/
		
		driver.findElementByAndroidUIAutomator("text(\"Views\")").click();
		driver.findElementByAndroidUIAutomator("new UiScrollable(new UiSelector()).scrollIntoView(text(\"WebView\"));");

	}

}
