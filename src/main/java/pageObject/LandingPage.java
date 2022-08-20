package pageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LandingPage
{
    public WebDriver driver;

    By signin=By.cssSelector("a[href*='sign_in']");
    By title=By.cssSelector(".text-center>h2");
    //By NavBar=By.xpath("/html[1]/body[1]/header[1]/div[2]/div[1]/nav[1]/ul[1]");
    By NavBar=By.cssSelector(".nav.navbar-nav.navbar-right>li>a");
    By course=By.xpath("//a[contains(text(),'Selenium Webdriver with Java Basics + Advanced + I')]");
    By cancelbtn=By.xpath("//body/div[4]/div[2]/div[1]/div[1]/div[1]/span[1]/div[1]/div[7]/div[1]/div[1]/div[2]");

    public LandingPage(WebDriver driver)
    {
        this.driver=driver;
    }
    public WebElement getLogin()
    {
        return driver.findElement(signin);
    }
    public WebElement getTitle()
    {
        return driver.findElement(title);
    }
    public WebElement getNavbar()
    {
        return driver.findElement(NavBar);
    }
    public WebElement getcourse()
    {
        return driver.findElement(course);
    }
    public WebElement getcancelbtn()
    {
        return driver.findElement(cancelbtn);
    }

}
