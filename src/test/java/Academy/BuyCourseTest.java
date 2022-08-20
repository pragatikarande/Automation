package Academy;

import initializebaseclass.base;
import org.testng.annotations.Test;
import pageObject.BuyCoursePage;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

public class BuyCourseTest extends base
{
    @Test
    public void clickBuyCourse() throws IOException {
        driver=initializeDriver();
        driver.get("http://www.qaclickacademy.com/");
        BuyCoursePage bcp=new BuyCoursePage(driver);
        bcp.getCourse().click();
        driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
        bcp.getLogin().click();
        bcp.enterUsername().sendKeys("pragatikarande93@gmail.com");
        bcp.enterPassword().sendKeys("Pragati@123");
        bcp.getLogin().click();



    }



}
