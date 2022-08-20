package Academy;

import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import pageObject.RegisterPage;
import initializebaseclass.base;

import java.io.IOException;

public class validateRegistration extends base
{

   @BeforeTest
    public void initialize() throws IOException
    {

        driver =initializeDriver();
        driver.get("http://qaclickacademy.com");
        //driver.get(prop.getProperty("url"));

    }


    //verify error message -MAndatory field
    @Test(priority = 0)
    public void verifyMandatoryFieldErrorMessage() throws IOException
    {

       //driver=initializeDriver();
        //driver.get("http://qaclickacademy.com");
        RegisterPage rp=new RegisterPage(driver);
        rp.getRegister().click();
        rp.signup().click();
        Assert.assertEquals(rp.mandatoryfielderrormsg().getText(),"Please fill in all the fields.");
    }


    //validate signup
   @Test(priority = 1)
    public void Registeration() throws IOException, InterruptedException {
        driver = initializeDriver();
        driver.get("http://qaclickacademy.com");
        RegisterPage rp=new RegisterPage(driver);

        rp.getRegister().click();
        rp.getUsername().sendKeys("pragati");
       // Thread.sleep(10000);
        rp.getEmail().sendKeys("pr@gmail.com");
        rp.getPassword().sendKeys("password");
        rp.getAgree().click();
        rp.signup().click();
   }

   @Test
   public void verify_navigationto_loginpage()
   {
       RegisterPage rp=new RegisterPage(driver);
       rp.getRegister().click();
       driver.manage().window().maximize();
       rp.getLogin().click();
        driver.navigate().to("https://sso.teachable.com/secure/9521/identity/login");
      String url= driver.getCurrentUrl();
       Assert.assertEquals(url,"https://sso.teachable.com/secure/9521/identity/login");
   }

    @Test
    public void verify_requiredfield_error()
    {

        RegisterPage rp=new RegisterPage(driver);
        rp.getRegister().click();
        rp.getUsername().click();
        rp.getEmail().click();
        System.out.println(rp.getrequiredfielderror().getText());
        Assert.assertEquals(rp.getrequiredfielderror().getText(),"This field is required");
    }

    @AfterTest
    public void teardown()
    {

        driver.close();


    }



}

