package Sampl;

import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import javafx.scene.web.WebViewBuilder;

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.HashMap;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebElement;

public class Appiu {
	public static AndroidDriver<WebElement> driver;
	 public static DesiredCapabilities dc;
	public static void main(String[] args) throws MalformedURLException, InterruptedException {
		// TODO Auto-generated method stub
	    System.out.println("Executing  ....  ...  ...  ....");
        Thread.sleep(6000);
        System.out.println("Setting up Appium Desired Capabilities");
        Thread.sleep(3000);
        String appAPKPath = "C:\\Users\\E003597\\Desktop\\sample\\APK\\com.truecaller_v7.84-1291_Android-4.0.3.apk";
        File app = new File(appAPKPath);
	    dc=new DesiredCapabilities();
	 	dc.setCapability("deviceName","210ad3627d42");
	 	dc.setCapability("platformVersion", "5.1.1");
		dc.setCapability("platformName","Android");
		dc.setCapability("appPackage", "com.truecaller");
		dc.setCapability("appActivity", "com.truecaller.ui.TruecallerInit");
		driver = new AndroidDriver<WebElement>(new URL("http://127.0.0.1:4723/wd/hub"), dc);
    	driver.manage().timeouts().implicitlyWait(120, TimeUnit.SECONDS);
    	
    	
    	//first scenario - scroll down
    	
    	driver.findElement(By.id("com.truecaller:id/truecaller_logo")).click();
        driver.findElement(By.id("com.truecaller:id/search_field")).sendKeys("sai");
    	Thread.sleep(1000);
    	driver.findElement(By.id("com.truecaller:id/icon_expand")).click();
    	
    	//scroll to element Sai Tech
    	while(driver.findElements(By.name("Sai Tech")).size()==0)
		{
			Dimension dimensions = driver.manage().window().getSize();
			Double screenHeightStart = dimensions.getHeight() * 0.5;
			int scrollStart = screenHeightStart.intValue();
			Double screenHeightEnd = dimensions.getHeight() * 0.2;
			int scrollEnd = screenHeightEnd.intValue();
			driver.swipe(0,scrollStart,0,scrollEnd,2000);
		}
	
		if(driver.findElements(By.name("Sai Tech")).size()>0)
		{
			driver.findElement(By.name("Sai Tech")).click();
		}  
		
		//
	   AndroidElement ele=	(AndroidElement) driver.findElements(By.className("android.widget.ImageButton")).get(0);
	   System.out.println(ele.getText());
		ele.click();

 

   	//second scenario  - long press 
    	
    	try{
    		
    	TouchAction action = new TouchAction(driver);
    	
    	WebElement elee=driver.findElement(By.name("Srujanveerareddy"));
    	
    	action.longPress(elee).release().perform();
    	 Thread.sleep(6000);
    	
    	
    	}catch(Exception e){
    		System.out.println("Exception e "+e.getMessage());
    	}
        TouchAction action1 = new TouchAction(driver);
    	
    	WebElement sele=driver.findElement(By.name("Srujanveerareddy"));
    	
    	action1.tap(sele).release().perform();
    	Thread.sleep(6000);
    	 
    	 TouchAction act3=new TouchAction(driver);
    	// WebElement raj=driver.findElement(By.name("Raaj"));
    	// act3.longPress(raj).release().perform();
    	// driver.findElement(By.id("android:id/title")).click();
    	List<WebElement> count=driver.findElements(By.id("com.truecaller:id/main_text"));
    	boolean b=false;
    			System.out.println(count.size());
    	         String s = null;
    	         int i;
    			for(i=0;i<count.size();i++)
    			{
    			    s=count.get(i).getText();
    				System.out.println(s);
    				
    			if(s.equals("Real Estate"))
    			{
    				b=true;
    				System.out.println("fount at "+i);
    				break;
    			}
    				
    			
    			}
    			/*if(!b)
    			{
    				System.out.println("in swipe");
    				JavascriptExecutor js = (JavascriptExecutor) driver;
    				HashMap<String, Double> swipeElement = new HashMap<String, Double>();
    				swipeElement.put("startX", 0.01);
    				swipeElement.put("startY", 0.3);
    				swipeElement.put("endX", 0.7);
    				swipeElement.put("endY", 0.6);
    				swipeElement.put("duration", 4.0);
    				js.executeScript("mobile:swipe", swipeElement);
    				
    			}*/
    			
		}
	
}
