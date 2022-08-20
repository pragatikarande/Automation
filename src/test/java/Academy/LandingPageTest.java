package Academy;

import Utilities.Logs.Log;
import Utilities.Utility;
import org.apache.log4j.Logger;
import org.testng.Assert;
import org.testng.annotations.Test;
import pageObject.LandingPage;
import initializebaseclass.base;

import java.io.IOException;

public class LandingPageTest extends base
{
    @Test
    public void basePageNavigation() throws IOException
    {
        Logger logger =Logger.getLogger("HomePageLog4J");
        driver = initializeDriver();
       driver.get("http://qaclickacademy.com");
        String url= prop.getProperty("url");
        LandingPage l = new LandingPage(driver);
        l.getcancelbtn().click();
        Log.info("clicked on cancel button");
        Utility.captureScreenShot(driver,"cancelbtn");
        Assert.assertTrue(l.getNavbar().isDisplayed());
        Log.info("Verified navigation bar is present");
        Utility.captureScreenShot(driver,"navbar");
        //Assert.assertEquals(l.getTitle().getText(),"FEATURED COURSES123");


    }
}

