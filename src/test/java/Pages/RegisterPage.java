package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

public class RegisterPage {
    WebDriver driver;
    //constructor for driver
    public RegisterPage(WebDriver driver) {
        this.driver = driver;
    }

     //save all locators
    private final By firstName_TextBox = By.id("input-firstname");
    private final By lastName_TextBox = By.id("input-lastname");
    private final By email_TextBox = By.id("input-email");
    private final By telephone_TextBox = By.id("input-telephone");
    private final By password_TextBox = By.id("input-password");
    private final By passConfirm_TextBox = By.id("input-confirm");
    private final By Policy_Button = By.name("agree");
    private final By NewsNo_Button = By.cssSelector("input[name='newsletter'][value='0']");
    private final By NewsYes_Button = By.cssSelector("input[name='newsletter'][value='0']");
    private final By Continue_Button = By.cssSelector(".btn.btn-primary");
    private final By SuccessRegisteration = By.id("common-success");
    private final By ErrorMessage = By.className("text-danger");
    //actions
    //register-->
    public void navigateregisterPage(){
        driver.get("https://awesomeqa.com/ui/index.php?route=account/register");
    }
    public void enterFname(String firstName){
        driver.findElement(firstName_TextBox).sendKeys(firstName);
    }
    public void enterLname(String lastName){
        driver.findElement(lastName_TextBox).sendKeys(lastName);
    }
    public void enterEmail(String email){
        driver.findElement(email_TextBox).sendKeys(email);
    }
    public void enterTele(String telephone){
        driver.findElement(telephone_TextBox).sendKeys(telephone);
    }
    public void enterPass(String password){
        driver.findElement(password_TextBox).sendKeys(password);
    }
    public void confirmPass(String confirmedPass){
        driver.findElement(passConfirm_TextBox).sendKeys(confirmedPass);
    }
    public void clickPolicy(){
        driver.findElement(Policy_Button).click();
    }
    public void clickNoNews(){
        driver.findElement(NewsNo_Button).click();
    }
    public void clickYesNews(){
        driver.findElement(NewsYes_Button).click();
    }
    public void clickContinue(){
        driver.findElement(Continue_Button).click();
    }

    public void Validregister(String firstname, String lastname, String email, String telephone, String password, String confirmedPass){
        enterFname(firstname);
        enterLname(lastname);
        enterEmail(email);
        enterTele(telephone);
        enterPass(password);
        confirmPass(confirmedPass);
        clickNoNews();
        clickPolicy();
        clickContinue();
    }
    public void Invalid_missingLname(String firstname, String email, String telephone, String password, String confirmedPass){
        enterFname(firstname);
        enterEmail(email);
        enterTele(telephone);
        enterPass(password);
        confirmPass(confirmedPass);
        clickNoNews();
        clickPolicy();
        clickContinue();
    }

    public void Invalid_missingemail(String firstname, String lastname, String telephone, String password, String confirmedPass){
        enterFname(firstname);
        enterLname(lastname);
        enterTele(telephone);
        enterPass(password);
        confirmPass(confirmedPass);
        clickNoNews();
        clickPolicy();
        clickContinue();
    }
    public void Invalid_missingFname( String lastname, String email, String telephone, String password, String confirmedPass){
        enterLname(lastname);
        enterEmail(email);
        enterTele(telephone);
        enterPass(password);
        confirmPass(confirmedPass);
        clickNoNews();
        clickPolicy();
        clickContinue();
    }
    public void Invalid_missingtele (String firstname, String lastname, String email, String password, String confirmedPass){
        enterFname(firstname);
        enterLname(lastname);
        enterEmail(email);
        enterPass(password);
        confirmPass(confirmedPass);
        clickNoNews();
        clickPolicy();
        clickContinue();
    }
    public void Invalid_missingpass(String firstname, String lastname, String email, String telephone, String confirmedPass){
        enterFname(firstname);
        enterLname(lastname);
        enterEmail(email);
        enterTele(telephone);
        confirmPass(confirmedPass);
        clickNoNews();
        clickPolicy();
        clickContinue();
    }
    public void Invalid_missingConfirmation(String firstname, String lastname, String email, String telephone, String password){
        enterFname(firstname);
        enterLname(lastname);
        enterEmail(email);
        enterTele(telephone);
        enterPass(password);
        clickNoNews();
        clickPolicy();
        clickContinue();
    }
    /*public void Invalid_Fname(String firstname){
        driver.findElement(firstName_TextBox).sendKeys(firstname);
    }
    public void Invalid_Lname(String lastname){
        driver.findElement(lastName_TextBox).sendKeys(lastname);
    }*/
    public void enterINemail(String email){
        driver.findElement(email_TextBox).sendKeys(email);
    }
    public void enterINtelephone(String telephone){
        driver.findElement(telephone_TextBox).sendKeys(telephone);
    }
    public void enterINPassword(String password){
        driver.findElement(password_TextBox).sendKeys(password);
    }
    public void enterInconfirmed(String confirmed){
        driver.findElement(passConfirm_TextBox).sendKeys(confirmed);
    }
    public void enterINfirstname(String firstname){
        driver.findElement(firstName_TextBox).sendKeys(firstname);
    }
    public void enterINlastname(String lastname){
        driver.findElement(lastName_TextBox).sendKeys(lastname);
    }
    public void IVfirstname(String firstname, String lastname, String email, String telephone, String password, String confirmedPass){
        enterINfirstname(firstname);
        enterLname(lastname);
        enterINemail(email);
        enterTele(telephone);
        enterPass(password);
        enterInconfirmed(confirmedPass);
        clickNoNews();
        clickPolicy();
        clickContinue();
    }
    public void IVlastname(String firstname, String lastname, String email, String telephone, String password, String confirmedPass){
        enterFname(firstname);
        enterINlastname(lastname);
        enterINemail(email);
        enterTele(telephone);
        enterPass(password);
        enterInconfirmed(confirmedPass);
        clickNoNews();
        clickPolicy();
        clickContinue();
    }
    public void IVemail(String firstname, String lastname, String email, String telephone, String password, String confirmedPass){
        enterFname(firstname);
        enterLname(lastname);
        enterINemail(email);
        enterTele(telephone);
        enterPass(password);
        confirmPass(confirmedPass);
        clickNoNews();
        clickPolicy();
        clickContinue();
    }
    public void IVPass(String firstname, String lastname, String email, String telephone, String password, String confirmedPass){
        enterFname(firstname);
        enterLname(lastname);
        enterINemail(email);
        enterTele(telephone);
        enterINPassword(password);
        confirmPass(confirmedPass);
        clickNoNews();
        clickPolicy();
        clickContinue();
    }
    public void IVConfirmed(String firstname, String lastname, String email, String telephone, String password, String confirmedPass){
        enterFname(firstname);
        enterLname(lastname);
        enterINemail(email);
        enterTele(telephone);
        enterPass(password);
        enterInconfirmed(confirmedPass);
        clickNoNews();
        clickPolicy();
        clickContinue();
    }
    public void clearForm() {
        driver.findElement(By.id("input-firstname")).clear();
        driver.findElement(By.id("input-lastname")).clear();
        driver.findElement(By.id("input-email")).clear();
        driver.findElement(By.id("input-telephone")).clear();
        driver.findElement(By.id("input-password")).clear();
        driver.findElement(By.id("input-confirm")).clear();
    }
    //assertions
    public void validateRegistration (){
        Assert.assertEquals(driver.getCurrentUrl(), "https://awesomeqa.com/ui/index.php?route=account/success");
        Assert.assertTrue(driver.findElement(SuccessRegisteration).getText().contains("Your Account Has Been Created!"));
    }
    public void ValidateErrorMessageLname(){
        Assert.assertEquals(driver.getCurrentUrl(),"https://awesomeqa.com/ui/index.php?route=account/register");
        Assert.assertTrue(driver.findElement(ErrorMessage).getText().contains("Last Name must be between 1 and 32 characters!"));
    }
    public void ValidateErrorMessageemail(){
        Assert.assertEquals(driver.getCurrentUrl(),"https://awesomeqa.com/ui/index.php?route=account/register");
        Assert.assertTrue(driver.findElement(ErrorMessage).getText().contains("E-Mail Address does not appear to be valid!"));
    }
    public void ValidateErrorMessageFname(){
        Assert.assertEquals(driver.getCurrentUrl(),"https://awesomeqa.com/ui/index.php?route=account/register");
        Assert.assertTrue(driver.findElement(ErrorMessage).getText().contains("First Name must be between 1 and 32 characters!"));
    }
    public void ValidateErrorMessageTele(){
        Assert.assertEquals(driver.getCurrentUrl(),"https://awesomeqa.com/ui/index.php?route=account/register");
        Assert.assertTrue(driver.findElement(ErrorMessage).getText().contains("Telephone must be between 3 and 32 characters!"));
    }
    public void ValidateErrorMessagePass(){
        Assert.assertEquals(driver.getCurrentUrl(),"https://awesomeqa.com/ui/index.php?route=account/register");
        Assert.assertTrue(driver.findElement(ErrorMessage).getText().contains("Password must be between 4 and 20 characters!"));
    }
    public void ValidateErrorMessageConPass(){
        Assert.assertEquals(driver.getCurrentUrl(),"https://awesomeqa.com/ui/index.php?route=account/register");
        Assert.assertTrue(driver.findElement(ErrorMessage).getText().contains("Password confirmation does not match password!"));
    }









}
