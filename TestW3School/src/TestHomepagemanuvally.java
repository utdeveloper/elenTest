import static org.junit.Assert.*;

import java.util.concurrent.TimeUnit;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.*;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.server.handler.FindElement;

import com.thoughtworks.selenium.webdriven.commands.IsElementPresent;

public class TestHomepagemanuvally {
	private FirefoxDriver driver;
	private StringBuffer verificationErrors = new StringBuffer();
	
	@Before
	public void createDriver(){
		driver = new FirefoxDriver(); // load firefox driver
		
	}
	
	@Test
	public void goToWebpage(){
		
		// go to w3school web page
		try{
			driver.get("http://www.w3schools.com");	
		} catch (Error e) {
		      verificationErrors.append(e.toString());
		}		
		
		
		//Make page maximixe
		driver.manage().window().maximize();
		
		
				
		//verify title
		try{
			assertEquals("W3Schools Online Web Tutorials", driver.getTitle());
		
		} catch (Error e) {
		      verificationErrors.append(e.toString());
		}
		
		//verify Hompage link
		try{
			assertEquals("http://www.w3schools.com/", driver.findElement(By.className("w3schools-logo")).getAttribute("href"));
			System.out.println(driver.findElement(By.className("w3schools-logo")).getAttribute("href"));
		} catch (Error e) {
		      verificationErrors.append(e.toString());
		}
		
		
		//veirfy site top text
		try{
		
			assertEquals("THE WORLD'S LARGEST WEB DEVELOPER SITE",driver.findElement(By.className("toptext")).getText());
			System.out.println(driver.findElement(By.className("toptext")).getText());			
		}
		catch (Error e) {
		      verificationErrors.append(e.toString());
		}
		
		//verify menu bar
		try{
		assertEquals("☰",driver.findElement(By.id("menubtn")).getText()); //verify menu button
		assertEquals("TUTORIALS",driver.findElement(By.id("navbtn_tutorials")).getText()); //verify TUTORIALS button
		assertEquals("REFERENCES",driver.findElement(By.id("navbtn_references")).getText()); //verify REFERENCES button
		assertEquals("EXAMPLES",driver.findElement(By.id("navbtn_examples")).getText()); //verify EXAMPLES button
		
		}
		catch (Error e) {
		      verificationErrors.append(e.toString());
		}
		
		//verify side menu
		
		try{
			assertTrue(isElementPresent(By.id("sidemenu")));
			System.out.println(isElementPresent(By.id("sidemenu")));
			
		}
		catch (Error e) {
		      verificationErrors.append(e.toString());
		}
		
		
		
		
		//click on sidemenu button
		driver.findElement(By.id("menubtn")).click();
		
		
		//wait time
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		//verify sidde menu again
		try{
			assertTrue(isElementPresent(By.id("sidemenu")));
			System.out.println(isElementPresent(By.id("sidemenu")));
		}
		catch (Error e) {
		      verificationErrors.append(e.toString());
		}
		
		//verify Tutorial
		
				//click on tutorial button
				driver.findElement(By.id("navbtn_tutorials")).click();
		
				//verify tutorial menu
				try{
					assertTrue(isElementPresent(By.id("nav_tutorials")));
					System.out.println(isElementPresent(By.id("nav_tutorials")));
				}
				catch (Error e) {
				      verificationErrors.append(e.toString());
				}
				
				//click on tutorial button
				driver.findElement(By.id("navbtn_tutorials")).click();
				
				//verify tutorial menu
				try{
					assertTrue(isElementPresent(By.id("nav_tutorials")));
					System.out.println(isElementPresent(By.id("nav_tutorials")));
				}
				catch (Error e) {
				      verificationErrors.append(e.toString());
				}
				
		//verify search
				//click on Search button
				driver.findElement(By.className("fa-search")).click();
				
				//verify search box
				try{
					assertTrue(isElementPresent(By.id("gsc-i-id1")));
					System.out.println(isElementPresent(By.id("gsc-i-id1")));
				}
				catch (Error e) {
				      verificationErrors.append(e.toString());
				}
				
				//set Text Clear
				driver.findElement(By.id("gsc-i-id1")).clear();
				driver.findElement(By.id("gsc-i-id1")).sendKeys("php");
				
				//click on search button
				driver.findElement(By.cssSelector("input.gsc-search-button.gsc-search-button-v2")).click();
				
	}
	
	

	@After
	  public void tearDown() throws Exception {
	    driver.quit();
	    String verificationErrorString = verificationErrors.toString();
	    if (!"".equals(verificationErrorString)) {
	      fail(verificationErrorString);
	    }
	  }
	
	private boolean isElementPresent(By by) {
	    try {
	      driver.findElement(by);
	      return true;
	    } catch (NoSuchElementException e) {
	      return false;
	    }
	  }
}
