import java.net.MalformedURLException;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;

public class MobileWebFacebookLogin extends MobileWebBrowser{

	public static void main(String[] args) throws MalformedURLException {
		// TODO Auto-generated method stub
		AndroidDriver<AndroidElement> driver = Capabilities();
		driver.get("http://facebook.com");
		driver.findElementByXPath("//*[@id='m_login_email']").sendKeys("madmaxx");
		driver.findElementById("m_login_password").sendKeys("manish");
		driver.findElementByXPath("//button[@value = 'Log In']").click();

	}

}
