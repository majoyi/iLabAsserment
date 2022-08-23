package assessment;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class RunScript {

	static String sBaseUrl  = "https://www.ilabquality.com/";
	static String sBrowsers = "edge";
	static String sName  = "TestIlab";
	static String sEmail = "automationAssessment@iLABQuality.com";
	static String sReasonForApply  = "I want a new challage";
	 String sCellNumber;
  stepdefination	runFuntion = new stepdefination();

	@Before
	public void setUp() throws Exception {
		
		runFuntion.OpenBrowser(sBrowsers, sBaseUrl);
	}

	@After
	public void tearDown() throws Exception {
		runFuntion.Quit();
	}

	@Test
	public void test() throws InterruptedException {
		//fail("Not yet implemented");
		
		
		runFuntion.navigateToCareer();
		stepdefination.AddClientDetails(sName, sEmail, sReasonForApply, sCellNumber);
	}

}
