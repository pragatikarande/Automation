package Utilities;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

import java.io.File;
import java.io.IOException;

public class Utility
{
    public static void captureScreenShot(WebDriver ldriver,String screenshotName){

        // Take screenshot and store as a file format
        File src= ((TakesScreenshot)ldriver).getScreenshotAs(OutputType.FILE);
        try {
            // now copy the  screenshot to desired location using copyFile method

            FileUtils.copyFile(src, new File("./Screenshots/"+ screenshotName + System.currentTimeMillis()+".png"));
        }

        catch (IOException e)

        {

            System.out.println(e.getMessage());

        }

    }

}
