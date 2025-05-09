package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {
    public static WebDriver driver ;
    public LoginPage(WebDriver driver){
        this.driver=driver;
    }

    private final By email_TextBox = By.id("input-email");
    private final By password_TextBox = By.id("input-password");
    private final By loginButton = By.xpath("//input[@value='Login']");

    public void navigate()
    {
        driver.get("https://awesomeqa.com/ui/index.php?route=account/login");

    }
    public void enteremail (String email)
    {
        driver .findElement( email_TextBox).sendKeys(email);
    }
    public void enterpassword (String password)
    {
        driver .findElement(password_TextBox).sendKeys(password);
    }
    public void clickloginbutton () {
        driver.findElement(loginButton).click();
    }
    public void login(String email,String passwoed)
    {
        enteremail(email);
        enterpassword(passwoed);
        clickloginbutton();

    }

}




