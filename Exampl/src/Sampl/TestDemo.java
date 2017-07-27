package Sampl;



import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class TestDemo {
	
	public static WebDriver  driver;
	public static Library lib;
	
	  public static void launchingBrowser() throws Exception{
		   
		  System.setProperty("webdriver.chrome.driver", "C:\\kalyan\\chromedriver.exe");
			
		    driver = new ChromeDriver();
		    driver.manage().window().maximize();
		    lib = new Library(driver);

			lib.launchapp("file:///C://kalyan//cig.html");
			
			
			
	   }
	   	
	  
   
   public static void enteringTextInTextBox() throws Exception{
	 //set for first name:
	  Thread.sleep(2000);
	   lib.set(By.xpath("(//input[@name='firstname'])[1]"),"selenium");
		String val = lib.getText(By.xpath("(//input[@name='firstname'])[1]"));
		System.out.println(val);
		//set for last name:
		lib.set(By.xpath("(//input[@name='lastname'])[1]"), "training");
		
		//set for middle name:
		lib.set(By.xpath("(//input[@name='firstname'])[2]"), "training");
		
		//set for nick name:
		lib.set(By.xpath("(//input[@name='lastname'])[2]"), "training");
		
		//set for employee id:
		lib.set(By.xpath("(//input[@name='firstname'])[3]"), "training");
		
		//set for Employee emailID:
		lib.set(By.xpath("(//input[@name='lastname'])[3]"), "training");
		
		//set for Employee emailID:
		lib.set(By.xpath("(//input[@name='firstname'])[4]"), "training");
		
		//set for username:
		lib.set(By.xpath("//input[@name='user']"), "training");
				
		//set for password:
		lib.set(By.xpath("//input[@name='password']"), "training");
   }
   
   
   
   public static void checkingCheckBox() throws Exception{
		//click on checkbox for car:
		lib.click(By.xpath("//input[@name='vehicle' and @value='Car']"));
   }
   
  public static void clickingRadioButton() throws Exception{
	//click on radio button for gender:
	lib.click(By.xpath("//input[@name='Sex' and @value='female']"));
   }
  
  public static void enteringDataInTextArea() throws Exception{
	//set for textarea:
	Thread.sleep(1500);
	lib.set(By.xpath("//textarea"), "this is text area field");
  }
  
  public static void gettingTextFromElements() throws Exception{
		//getting text from get attribute:
		List<WebElement> textarea=driver.findElements(By.xpath("//form//input[@type='button' and @value]"));
		Iterator itr=textarea.iterator();
		while(itr.hasNext())
		{
			WebElement gettext=(WebElement)itr.next();
			System.out.println(gettext.getAttribute("value"));
		}
		Thread.sleep(2000);
  }
  
  public static void performingWindowHandelling() throws Exception{
	//opening a new tab using robot & close the tab: 
		Robot robot=new Robot();
		robot.keyPress(KeyEvent.VK_CONTROL); 
		robot.keyPress(KeyEvent.VK_T); 
		robot.keyRelease(KeyEvent.VK_CONTROL); 
		robot.keyRelease(KeyEvent.VK_T);
		//window handeling:
		Thread.sleep(2000);
		Set<String> windows= driver.getWindowHandles();
		System.out.println("----------------------"+driver.getWindowHandles().size());
		for(String currentwindow : windows ){
			driver.switchTo().window(currentwindow);
		}
		driver.get("https://www.google.co.in/");
		Thread.sleep(2000);
		driver.close();
		
		
		for(String currentwindow : driver.getWindowHandles() ){
			driver.switchTo().window(currentwindow);
		}
  }
  
  public static void performingMouseOver() throws Exception{
	  
	    Actions action = new Actions(driver);
	    action.keyDown(Keys.CONTROL).sendKeys(Keys.END).build().perform();
	   Thread.sleep(2000);
	  //mousehover on w3 school & get text:
			lib.Mousehover(driver.findElement(By.xpath("//a[text()='W3Schools.com']")));
			String gettext1=driver.findElement(By.xpath("//td[@id='tip']")).getText();
			System.out.println(gettext1);
			 Thread.sleep(1000);
			//mousehover on Internet Explorer & get text:
			lib.Mousehover(driver.findElement(By.xpath("//a[text()='Internet Explorer']")));
			String gettext2=driver.findElement(By.xpath("//td[@id='tip']")).getText();
			System.out.println(gettext2);
			 Thread.sleep(1000);
			//mousehover on Netscape Navigator & get text:
			lib.Mousehover(driver.findElement(By.xpath("//a[text()='Netscape Navigator']")));
			String gettext3=driver.findElement(By.xpath("//td[@id='tip']")).getText();
			System.out.println(gettext3);
			 Thread.sleep(1000);
			//mosehover on Menu:
			lib.Mousehover(driver.findElement(By.xpath("//table[@id='myMenu']")));
			Thread.sleep(1000);
	  }
  
  public static void performingOperationOnAlert() throws Exception{
	//click on Show alert box & click on alert ok button:
			lib.click(By.xpath("//input[@onclick='show_alert()']"));
			Thread.sleep(2000);
			driver.switchTo().alert().accept();
			
			//click on display alert & click on alert ok button:
			lib.click(By.xpath("//input[@onclick='disp_alert()']"));
			Thread.sleep(2000);
			driver.switchTo().alert().accept();
		
			//click on show aconfirm box & click on alert ok button:
			lib.click(By.xpath("//input[@onclick='show_confirm()']"));
			Thread.sleep(2000);
			driver.switchTo().alert().accept();
			
			//click on display a prompt box & click on alert ok button:
			lib.click(By.xpath("//input[@onclick='disp_prompt()']"));
			Thread.sleep(2000);
			driver.switchTo().alert().accept();
			
	  }
  public static void getData()
	{
		int tr= driver.findElements(By.xpath("//tr")).size();
		int td= driver.findElements(By.xpath("//td")).size();
		for(int i=1;i<tr;i++)
		{
			for(int j=1;j<td;j++)
			{
				String val=driver.findElement(By.xpath("//table[1]/tbody/tr["+i+"]/td["+j+"]")).getText();
				System.out.println("the val is"+val);
			}
		}
	}
	public static void main(String[] args) throws Throwable {
		
		
		launchingBrowser();
		
	//	enteringTextInTextBox();
				
	//	checkingCheckBox();
		
	//	clickingRadioButton();
		
	//	enteringDataInTextArea();
		
	//	gettingTextFromElements();
		
		performingWindowHandelling();
		
	//	performingMouseOver();
		
		performingOperationOnAlert();
		getData();

		
		
	}
	
	
}
