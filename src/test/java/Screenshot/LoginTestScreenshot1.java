package Screenshot;

import Utilities.Logs.Log;
import Utilities.Utility;
import initializebaseclass.base;
import jdk.jshell.execution.Util;
import org.apache.commons.io.FileUtils;
import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.jetbrains.annotations.NotNull;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.testng.Assert;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import pageObject.LoginPage;

import java.io.File;
import java.io.IOException;

public class LoginTestScreenshot1 extends base
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
    public void verifyLogin() throws IOException
    {

       /* Logger logger =Logger.getLogger("HomePageLog4J");
        PropertyConfigurator.configure("log4j2.properties"); */

        LoginPage lp=new LoginPage(driver);
        Log.info("initializing driver");
        lp.getLoginclick().click();
        Log.info("click on login button");
        lp.getEmail().isDisplayed();
        Log.info("click on email id field");
        lp.getPassword().isDisplayed();
        Log.info("click on password field");

        Assert.assertEquals(lp.geterrormsg().getText(),"This field is required");

        //TakesScreenshot ts=(TakesScreenshot)driver;
        // File src= ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
        // FileUtils.copyFile(src, new File("./Screenshots/login.png"));
        // Log.info("screenshot taken");


    }

    @Test(priority = 1)
    public void verifyForgotpass() throws IOException {
        driver =initializeDriver();
        driver.get("http://qaclickacademy.com");
        Logger logger =Logger.getLogger("HomePageLog4J");
        PropertyConfigurator.configure("log4j2.properties");
        LoginPage lp=new LoginPage(driver);
        Log.info("initializing driver");
        lp.getLoginclick().click();
        Log.info("click on login button");
       // Utility.captureScreenShot(driver,"LoginBtnClicked");
        lp.getforgotpass().click();
        Log.info("click on forgot password ");
       // Utility.captureScreenShot(driver,"ForgotPassBtnClicked");
        String url = driver.getCurrentUrl();
        Log.info("get current URl after navigating to forgot password page");
        Assert.assertEquals(url ,"https://rahulshettyacademy.com/sign_in/password/new/index.php");
        Log.info("verify actual and expected url are matching or not");
       /* TakesScreenshot ts=(TakesScreenshot)driver;
        File src= ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
        FileUtils.copyFile(src, new File("./Screenshots/login.png"));
        Log.info("screenshot taken"); */


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