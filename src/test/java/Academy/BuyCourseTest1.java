package Academy;

import Utilities.Logs.Log;
import Utilities.Utility;
import initializebaseclass.base;
import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.jetbrains.annotations.NotNull;
import org.testng.Assert;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import pageObject.BuyCoursePage;
import pageObject.LandingPage;
import pageObject.LoginPage;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

public class BuyCourseTest1 extends base
{
    @BeforeTest
    public void initialize() throws IOException
    {

        driver =initializeDriver();

        driver.get("http://qaclickacademy.com");
       // Utility.captureScreenShot(driver,"BrowserStarted");

        //driver.get(prop.getProperty("url"));

    }
    @Test(priority = 0)
    public void verifyBuyCourse() throws IOException
    {

        BuyCoursePage bcp=new BuyCoursePage(driver);
        bcp.getCourse().click();
        driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
        bcp.getLogin().click();
        bcp.enterUsername().sendKeys("pragatikarande93@gmail.com");
        bcp.enterPassword().sendKeys("Pragati@123");
        bcp.clickLogin().click();

    }

    @AfterMethod
    public void teardown(@NotNull ITestResult result)
    {


        if(ITestResult.FAILURE==result.getStatus())
        {
            Utility.captureScreenShot(driver,result.getName());
            System.out.println(result.getStatus());
        }
        driver.close();
    }
}