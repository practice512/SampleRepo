package Sampl;

import java.security.NoSuchAlgorithmException;
import java.util.NoSuchElementException;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;



public class Library {

	WebDriver driver;
	
	public Library(WebDriver driver){
		
		this.driver = driver;
	}
	
	public void launchapp(String url) throws Exception {
		try {
			driver.get(url);
			System.out.println("Opened the URL ::"+url);
		} catch (RuntimeException localRuntimeException) {
			System.out.println("Unable to open the url"+ localRuntimeException);
			throw new NoSuchAlgorithmException();
		}
	
	}
	

	public void click(By locator) throws Exception {
		try{
			highlight(locator);
			driver.findElement(locator).click();
			System.out.println("Clicked on the field :"+locator);
			
		} catch (RuntimeException localRuntimeException) {
		System.out.println("Error in clicking the field:" + localRuntimeException.getMessage() + "Fail");
		throw new NoSuchElementException();
	}
	}
	

	
	public void set(By locator, String data) throws Exception {
		try {
			
			driver.findElement(locator).clear();
			driver.findElement(locator).sendKeys(data);
			System.out.println("Entered the value in the text box :"+locator);
			highlight(locator);
		} catch (RuntimeException localRuntimeException) {
			System.out.println("Error in entering the text in element:" + localRuntimeException.getMessage() + "Fail");
			throw new NoSuchElementException();
		}
	}
	
	public String  getText(By locator) throws Exception {
		String val=null;
		try 
		{
			
			//driver.findElement(locator).clear();
		//	driver.findElement(locator).sendKeys(data);
			System.out.println("Entered the value in the text box :"+locator);
			highlight(locator);
			val=driver.findElement(locator).getText();
			
		} catch (RuntimeException localRuntimeException) {
			System.out.println("Error in entering the text in element:" + localRuntimeException.getMessage() + "Fail");
			throw new NoSuchElementException();
		}
		return val;
	}
	
	public void select(By locator, String data) throws Exception {
		try {
			
			Select dropdown = new Select(driver.findElement(locator));
			dropdown.selectByVisibleText(data);
			System.out.println("Selected the Value from the dropdown :"+locator);
			highlight(locator);
		} catch (RuntimeException localRuntimeException) {
			System.out.println("Error in selecting value from dropdown:" + localRuntimeException.getMessage() + "Fail");
			throw new NoSuchElementException();
		}
	
	}
	
	public  void highlight(By locator) throws Exception 
	{
		try{
			
			WebElement elem = driver.findElement(locator);
			JavascriptExecutor je=(JavascriptExecutor)driver;
			je.executeScript("arguments[0].style.border='3px solid blue'", elem);
			
	
		} catch (RuntimeException localRuntimeException)
		{
			System.out.println("Error in Highlighting the element :" + localRuntimeException.getMessage() + "Fail");
			throw new NoSuchElementException();

		}
	}
		public void getattributevalue(WebElement elem, String requiredattribute) throws Exception {
			String attribute = null;
			try {
				attribute = elem.getAttribute(requiredattribute);
				System.out.println("Attribute value are:" + elem);
			} catch (RuntimeException localRuntimeException) {
				System.out.println("Error find in attribute value:" + elem);
				
			}
		}
		public void Mousehover(WebElement elem) {
			try {
				Actions action = new Actions(driver);
				action.moveToElement(elem).build().perform();
				System.out.println("Successfully mouseover on element:" + elem);
			} catch (RuntimeException localRuntimeException) {
				System.out.println("Error in Hover on element" + localRuntimeException.getMessage() + "Pass");
				System.out.println("Error in Hover on element:" + elem);

			}
		}
}
