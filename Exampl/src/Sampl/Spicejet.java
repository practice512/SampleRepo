package Sampl;

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.android.AndroidDriver;

public class Spicejet {
	public static AndroidDriver<WebElement> driver;
	 public static DesiredCapabilities dc;
	public static void main(String[] args) throws MalformedURLException
	{
		String appAPKPath = "C:\\apks\\SpiceJet_1.6.2.apk";
        File app = new File(appAPKPath);
	    dc=new DesiredCapabilities();
	 	dc.setCapability("deviceName","210ad3627d42");
	 	dc.setCapability("platformVersion", "5.1.1");
		dc.setCapability("platformName","Android");
	//	dc.setCapability("appPackage", "com.truecaller");
	//	dc.setCapability("appActivity", "com.truecaller.ui.TruecallerInit");
		driver = new AndroidDriver<WebElement>(new URL("http://127.0.0.1:4723/wd/hub"), dc);
    	driver.manage().timeouts().implicitlyWait(120, TimeUnit.SECONDS);
    	//driver.findElementByAndroidUIAutomator("UiSelector().textContains(\"No\")").click();
    	driver.findElementByAndroidUIAutomator("UiSelector().textContains(\"No\")").click();
    	driver.findElementByAndroidUIAutomator("UiSelector().resourceid(\"com.vl.spicejet:id/btn_flight_booking\")").click();
    	driver.findElementByAndroidUIAutomator("UiSelector().resourceid(\"com.vl.spicejet:id/tv_depart\")").click();
    	


		
		
	}

}
