package pageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginPage
{
    public WebDriver driver;
    //By email= By.id("user_email");

    By click_login=By.xpath("//span[contains(text(),'Login')]");

    By email=By.xpath("//input[@id='user_email']");
    By pwd=By.cssSelector("[type='password']");
    By loginbtn=By.cssSelector("[value='Log In']");
    By errormsg=By.xpath("//body/main[1]/div[1]/form[1]/div[1]/div[1]");
    By forgotpassword=By.xpath("//a[contains(text(),'Forgot Password?')]");


    public LoginPage(WebDriver driver)
    {
        this.driver=driver;
    }

    public WebElement getLoginclick()
    {
        return driver.findElement(click_login);

    }
    public WebElement getEmail()
    {
        return driver.findElement(email);

    }
    public WebElement getPassword()
    {
        return driver.findElement(pwd);
    }
 public WebElement getLogin()
 {
     return driver.findElement(loginbtn);
 }

 public WebElement geterrormsg()
 {
     return driver.findElement(errormsg);
 }
    public WebElement getforgotpass()
    {
        return driver.findElement(forgotpassword);
    }
}
