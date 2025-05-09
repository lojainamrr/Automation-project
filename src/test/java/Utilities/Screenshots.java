package Utilities;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Screenshots {
    public static void takeScreenshot(WebDriver driver, String baseFileName) {
        // Create screenshots folder if it doesn't exist
        File dir = new File("screenshotsss");
        if (!dir.exists()) {
            dir.mkdirs();
        }

        // Create timestamp string
        String timestamp = new SimpleDateFormat("yyyyMMdd_HHmmss").format(new Date());

        // File name with timestamp
        String fileName = baseFileName + "_" + timestamp + ".png";

        // Take and save screenshot
        File screenshot = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
        File destination = new File(dir, fileName);

        try {
            Files.copy(screenshot.toPath(), destination.toPath());
            System.out.println("Screenshot saved: " + destination.getAbsolutePath());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}