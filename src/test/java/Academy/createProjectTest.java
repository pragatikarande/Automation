package Academy;

import org.testng.annotations.Test;
import pageObject.RegisterPage;
import pageObject.createProjectPage;
import initializebaseclass.base;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

public class createProjectTest extends base
{
    //verify error message -MAndatory field
    @Test
    public void create() throws IOException, InterruptedException {

        driver=initializeDriver();
       // driver.get("https://diconfirmame.aaps.deloitte.com/");
        driver.get("https://login.microsoftonline.com/36da45f1-dd2c-4d1f-af13-5abe46b99921/oauth2/v2.0/authorize?client_id=b36fc8b2-162d-4026-9c76-d634beb9a6b7&response_type=id_token&scope=openid%20email%20profile&state=OpenIdConnect.AuthenticationProperties%3DK7uV0esxQDeU1JDlN8Udd9eDFNj4ebttTNisiRzznavkgTSBfLreDYfW4gGa7j87hdZ1NzvPGF6TaUmBadv3H5sXuFVznG8yMYjbSxGV3DXzPPHwCjI6xxcxke3uhX7v3KcmZg&response_mode=form_post&nonce=637875858041254836.ZmQ5OTBjOWEtMmZiZC00NDYwLTg1MjQtY2Q0MzlkYjg0OTE5ZThmMGM2NTQtOTc3ZS00YWRkLTllNmYtNjVkNzQ1MzhhZDAw&redirect_uri=https%3A%2F%2Fdiconfirmame.aaps.deloitte.com%2F&x-client-SKU=ID_NET461&x-client-ver=5.3.0.0");
        createProjectPage cp=new createProjectPage(driver);
        //cp.getLogin().click();
        cp.getusername().sendKeys("prkarande@deloitte.com");
        cp.getNext().click();

        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        cp.getcreatebtn().click();
        cp.getprojectname().sendKeys("Project10");
        cp.getWBSCode().click();
        cp.getcode().click();
        cp.getSelect().click();


        RegisterPage rp=new RegisterPage(driver);
        rp.getRegister().click();
    }


    //validate signup
  /*  @Test
    public void basePageNavigation() throws IOException
    {
        driver = initializeDriver();
        driver.get("http://qaclickacademy.com");

        LandingPage l = new LandingPage(driver);
        Assert.assertEquals(l.getTitle().getText(),"FEATURED COURSES");
        //System.out.println(l.getTitle().getText());

        l.getcourse().click();

        RegisterPage rp=new RegisterPage(driver);
        rp.getRegister().click();
        rp.getUsername().sendKeys("pragati");
        rp.getEmail().sendKeys("pr@gmail.com");
        rp.getPassword().sendKeys("password");
        rp.getAgree().click();
        rp.signup().click();


    } */
}

