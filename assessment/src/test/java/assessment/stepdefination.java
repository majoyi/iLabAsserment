package assessment;

import java.time.Duration;
import java.util.Random;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import static org.junit.Assert.*;
import io.github.bonigarcia.wdm.WebDriverManager;

public class stepdefination {
	

	// Declare variebles to use 
	static WebDriver driver;
	//JavascriptExecutor jsExecutor ;
	static	WebDriverWait wait;
	static String javascript = "window.scrollBy(0,500)";  
	static JavascriptExecutor jsExecutor;  
	static String sBaseUrl  = "https://www.ilabquality.com/";
	static String sBrowsers = "chrome";
	static String sName  = "TestIlab";
	static String sEmail = "edwin.ndlala@gmail.com";
	static String sReasonForApply  = "I want a new challage";
	static String sCellNumber ;
	
  /*
	public static void main(String[] args) throws InterruptedException, IOException {
		// TODO Auto-generated method stub
		 Random rand = new Random();
		 String sCellNumber ="083 "+rand.nextInt(11111111);
	     System.out.println( sCellNumber );
	     
	
	    // Scroll by scripts 
	    String javascript = "window.scrollBy(0,500)";  
		JavascriptExecutor jsExecutor = (JavascriptExecutor) driver;  
		// explicit wait - to wait for the compose button to be click-able
	     WebDriverWait wait = new WebDriverWait(driver, Duration.ofMillis(5000));
	  
			OpenBrowser(sBrowsers, sBaseUrl);
			Thread.sleep(2000);
			// Click on the CAREERS link 
		     // CAREERS path
			  By sCareers = By.xpath("//a[contains(.,'CAREERS')]");
			  By sSAID = By.linkText("South Africa");
			driver.findElement(sCareers).click();
			Thread.sleep(2000);
			
			jsExecutor.executeScript(javascript); 
			driver.findElement(sSAID).click();
			
			System.out.println(driver.getTitle());
			Thread.sleep(2000);
			
			// Click the First HyperLink 
			  By sFirstCareer = By.partialLinkText("BSC Comput");
			  
			
			wait.until(ExpectedConditions.visibilityOfElementLocated(sFirstCareer));
			  driver.findElement(sFirstCareer).click();
			
			  jsExecutor.executeScript(javascript);
			  
			  By sApplyOnline =  By.linkText("Apply Online");
			  wait.until(ExpectedConditions.visibilityOfElementLocated(sApplyOnline));
			  driver.findElement(sApplyOnline).click();
			  
			  // Apply for Applicaton
			 
			  By sNamesID = By.id("applicant_name");
			  By sEmalsId = By.id("email");
			  By sPhoneId = By.id("phone");
			  By sMessageId = By.id("message");
			  By sUploadFileId  = By.linkText("browse files ...");
			  By sUploadFieldErrorID  = By.className("wpjb-errors");
			  String sErrorID ="You need to upload at least one file.";
			  By sSubmitBtn = By.id("wpjb_submit");
			//*[@id="wpjb-upload-browse-file"]
			//a[contains(.,'browse files ...')]
			 // v
			  wait.until(ExpectedConditions.visibilityOfElementLocated(sMessageId));
			 
			  driver.findElement(sNamesID).sendKeys(sName);
			  driver.findElement(sEmalsId).sendKeys(sEmail);
			  driver.findElement(sPhoneId).sendKeys(sCellNumber);
			  driver.findElement(sMessageId).sendKeys(sReasonForApply);
			  jsExecutor.executeScript(javascript);
			  
			  driver.findElement(sSubmitBtn).click();
			  Thread.sleep(5000);
			  wait.until(ExpectedConditions.visibilityOfElementLocated(sUploadFieldErrorID));
			  
			  System.out.println("String value " +driver.findElement(sUploadFieldErrorID).getText());
			  
			 
			  
			  
			  
			  
			  
			   
			
			
			
			
			
		
	        
     
	}
*/
	
	  @SuppressWarnings("deprecation")
	public void OpenBrowser(String sBrowsers,String sBaseUrl) {

     
	    	
	    	
	    	 if (sBrowsers.equalsIgnoreCase("firefox")) {
	             WebDriverManager.firefoxdriver().setup();
	             driver = new FirefoxDriver();

	         }else if (sBrowsers.equalsIgnoreCase("chrome")) {
	             WebDriverManager.chromedriver().setup();
	             driver = new ChromeDriver();

	         } else if (sBrowsers.equalsIgnoreCase("edge")) {
	             WebDriverManager.edgedriver().setup();
	             driver = new EdgeDriver();

	         }
	    	 
	    	 // navigate to browser
	    	 driver.get(sBaseUrl);

	 		// Maximize the browser
	 		// driver.manage().window().maximize();
			// Use wait for let the brower to be ready 
	 		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	 		driver.manage().window().maximize();
			
		}


public void navigateToCareer() throws InterruptedException 
{
	// We using by Method to declare our POM
	  By sCareers = By.xpath("//a[contains(.,'CAREERS')]");
	  By sSAID = By.linkText("South Africa");
	  By sFirstCareer = By.partialLinkText("BSC Comput");
	  By sApplyOnline =  By.linkText("Apply Online");
	   wait = new WebDriverWait(driver, Duration.ofSeconds(4));
	   jsExecutor = (JavascriptExecutor) driver;
	  wait.until(ExpectedConditions.visibilityOfElementLocated(sCareers));
	  
	 driver.findElement(sCareers).click();
	
	 jsExecutor.executeScript(javascript); 
	 driver.findElement(sSAID).click();
	
	 System.out.println(driver.getTitle());
	
	// Click the First HyperLink 
	 wait.until(ExpectedConditions.visibilityOfElementLocated(sFirstCareer));
     driver.findElement(sFirstCareer).click();
	
	  jsExecutor.executeScript(javascript);
	  wait.until(ExpectedConditions.visibilityOfElementLocated(sApplyOnline));
	  driver.findElement(sApplyOnline).click();
	  

}

public static void AddClientDetails(String sName ,String sEmail, String sReasonForApply , String sCellNumber) 
{
	 // Apply for Applicaton
	Random rand = new Random();
	  sCellNumber ="083"+rand.nextInt(11111111);
	//sCellNumber =sCellNumber1;
	
	
	  By sNamesID = By.id("applicant_name");
	  By sEmalsId = By.id("email");
	  By sPhoneId = By.id("phone");
	  By sMessageId = By.id("message");
	 
	  By sUploadFieldErrorID  = By.className("wpjb-errors");
	  String sErrorID ="You need to upload at least one file.";
	  By sSubmitBtn = By.id("wpjb_submit");
	//*[@id="wpjb-upload-browse-file"]
	//a[contains(.,'browse files ...')]
	 // v
	  wait.until(ExpectedConditions.visibilityOfElementLocated(sMessageId));
	 
	  driver.findElement(sNamesID).sendKeys(sName);
	  driver.findElement(sEmalsId).sendKeys(sEmail);
	  driver.findElement(sPhoneId).sendKeys(sCellNumber);
	  driver.findElement(sMessageId).sendKeys(sReasonForApply);
	  jsExecutor.executeScript(javascript);
	  
	  driver.findElement(sSubmitBtn).click();
	 
	  wait.until(ExpectedConditions.visibilityOfElementLocated(sUploadFieldErrorID));
	  WebElement stext = driver.findElement(sUploadFieldErrorID);
	  System.out.println("String value " +stext.getText());
	  //Assert statements		
	 // Assert()
      assertEquals(stext.getText(),sErrorID);
	 // arssert(stext.getText(),sErrorID);
	 

}






public void Quit() 
{
	// We are taking the session down 
	driver.quit();
	}

}

