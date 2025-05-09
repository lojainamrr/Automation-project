package Base;

import Pages.RegisterPage;
import Utilities.Screenshots;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.ITestResult;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;

import java.time.Duration;

public class TestBase {
    public WebDriver driver;
    Boolean testFailed = false;
    @BeforeClass
    public void preConditions(){
        driver = new EdgeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        RegisterPage registerPage = new RegisterPage(driver);
    }
    @AfterMethod
    public void trackFailures(ITestResult result) {
        if (result.getStatus() == ITestResult.FAILURE) {
            testFailed = true;  // Mark test as failed
        }
    }

    @AfterClass
    public void afterClass() {
        // Take a screenshot if any test failed
        if (testFailed) {
            Screenshots.takeScreenshot(driver, "TestClass_Failure");
        }
        if (driver != null) {
            driver.quit();
        }
    }

}
