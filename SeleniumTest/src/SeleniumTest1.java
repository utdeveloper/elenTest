import org.apache.bcel.generic.Select;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class SeleniumTest1 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		// create firefox dirver
		WebDriver driver=new FirefoxDriver();
		
		//maximize window
				driver.manage().window().maximize();
				
		//open site home page
		driver.get("https://www.google.lk/?gfe_rd=cr&ei=0z7ZVrXoO7HR8Aek-brYDw");
		Thread.sleep(1000); // use to wait time
		//find
			driver.findElement(By.id("lst-ib")).clear(); // use to clear field
			driver.findElement(By.id("lst-ib")).sendKeys("facebook");
		
		//click command to search button
			driver.findElement(By.name("btnG")).click();
			
			Thread.sleep(1000); // use to wait time
		
		// click on link
			driver.findElement(By.partialLinkText("Facebook")).click();
		
		// pass value to fields 
			driver.findElement(By.id("FirstName")).sendKeys("uditha");
			driver.findElement(By.id("LastName")).sendKeys("Randika");
			driver.findElement(By.id("GmailAddress")).sendKeys("uditha");
			driver.findElement(By.id("Passwd")).sendKeys("uditha");
			driver.findElement(By.id("PasswdAgain")).sendKeys("uditha");
		
		
		
		System.out.println(driver.getTitle());
		
		//get webpage result
		
			//System.out.println(driver.findElement(By.className("rc")).getText());
		
		
			
		
			
			// set combobox value
			
				//assign webelment for listbox
					WebElement elemant = driver.findElement(By.id(":e"));
					//Select DropDown=new Select(elemant);
					
			
			//driver.findElement(By.className("goog-inline-block goog-flat-menu-button-caption")).sendKeys("May");
			driver.findElement(By.id("RecoveryPhoneNumber")).sendKeys("718790541");
			driver.findElement(By.id("RecoveryEmailAddress")).sendKeys("uditharandika@gmail.com");
			
			Thread.sleep(1000);
			
			//get attribute value
			//System.out.println(driver.findElement(By.className("logo logo-w")).getAttribute("src"));
		
			//count links
			System.out.println(driver.findElement(By.tagName("a")).getSize());
			
			System.out.println(driver.findElement(By.id("link-signin")).getText());
			
		
			
			//open link by link name
			driver.findElement(By.linkText("Learn more")).click();
			
		//close driver
			//driver.close();
		
	}

}
