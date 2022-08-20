package Academy;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import pageObject.LandingPage;
import pageObject.LoginPage;
import initializebaseclass.base;

import java.io.IOException;

public class HomePageTest extends base
{
    @Test(dataProvider = "getData")
    public void basePageNavigation(String Username,String Password) throws IOException
    {
        Logger logger =Logger.getLogger("HomePageLog4J");
        PropertyConfigurator.configure("log4j2.properties");
        driver=initializeDriver();
        logger.info("initializing driver");
        driver.get("http://qaclickacademy.com");
        logger.info("launch app url");
        LandingPage l=new LandingPage(driver);
        logger.info("create object for landing page");
        l.getLogin().click();
        logger.info("click on login button");
        LoginPage lp=new LoginPage(driver);
        logger.info("creating object of login page");
        //lp.getEmail().sendKeys("abc@gmail.com");
        lp.getEmail().sendKeys(Username);
        logger.info("provide input for username field");
       // lp.getPassword().sendKeys("pwd");
        lp.getPassword().sendKeys(Password);
        logger.info("provide input for password field");

        lp.getLogin().click();
        logger.info("click on login button");
    }

    @DataProvider
    public Object[][] getData()
    {
        Object[][] data=new Object[2][2];
        data[0][0]="nonrestrcteduser@qw.com";
        data[0][1]="pragati";
       //data[0][2]="restricted user";
       //data[0][2]="restricted user";

        //1st row
       data[1][0]="restricteduser@qw.com";
        data[1][1]="testuser";
       //data[1][2]="non restricted user";
        return data;
    }
}
