/*package Samplemavenprojectframework.Samplemavenprojectframework;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

/**
 * Unit test for simple App.
 */
public class AppTest 
    extends TestCase
{
    /**
     * Create the test case
     *
     * @param testName name of the test case
     */
    public AppTest( String testName )
    {
        super( testName );
    }

    /**
     * @return the suite of tests being tested
     */
    public static Test suite()
    {
        return new TestSuite( AppTest.class );
    }

    /**
     * Rigourous Test :-)
     */
    public void testApp()
    {
        assertTrue( true );
    }
}*/

@AfterMethod//(groups= {"SmokeSuite","RegressionSuite")
public void logoutOfApp() 1
testngbane
HomePage hp = new HomePage(driver);
hp.getSignink();
System.out.println("Logout of App");
}
@AfterClass//(groups= {"SmokeSuite", "RegressionSuite"})
public void CloseBrowser() {
driver.close();
System.out.println("Closed Browser");
@After Suite
public void CloseDB() throws Throwable {
//dbu.closeDB();
System.out.println("CloseDB");
}
public String getscreenshot(String name) throws IOException {
File srcfile = ((TakesScreenshot) staticdriver).getScreenshotAs(Output Type FILE)
String dest file = System.getProperty("user.dir")+"/Screenshots/"+name+".png";
File finaldest = new File(destfile);
FileUtils.copyFile(srcfile, finaldest);
return destfile;
}
