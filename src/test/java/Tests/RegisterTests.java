package Tests;
import Base.TestBase;
import Pages.RegisterPage;
import Utilities.DataReader;
import Utilities.Screenshots;
import org.testng.annotations.Test;

import java.util.Map;

public class RegisterTests extends TestBase {
    RegisterPage registerPage;
    Map<String, String> data= DataReader.getData("src/main/resources/Data.json");

    @Test
    //valid registration
    public void ValidRegister(){

            registerPage = new RegisterPage(driver);
            registerPage.navigateregisterPage();
            registerPage.Validregister(data.get("firstnameValid"), data.get("lastnameValid"), data.get("emailV"), data.get("telephoneValid"), data.get("passwordValid"), data.get("confirmedValid"));
            registerPage.validateRegistration();


    }

    @Test
   //register missing fields
    public void Invalid_missingfields_register(){
        registerPage = new RegisterPage(driver);
        registerPage.navigateregisterPage();
        registerPage.Invalid_missingLname(data.get("firstnameValid"), data.get("emailValid"), data.get("telephoneValid"), data.get("passwordValid"), data.get("confirmedValid"));
        registerPage.ValidateErrorMessageLname();
        registerPage.clearForm();
        registerPage.Invalid_missingFname(data.get("lastnameValid"), data.get("emailValid"), data.get("telephoneValid"), data.get("passwordValid"), data.get("confirmedValid"));
        registerPage.ValidateErrorMessageFname();
        registerPage.clearForm();
        registerPage.Invalid_missingemail(data.get("firstnameValid"), data.get("lastnameValid"), data.get("telephoneValid"), data.get("passwordValid"), data.get("confirmedValid"));
        registerPage.ValidateErrorMessageemail();
        registerPage.clearForm();
        registerPage.Invalid_missingpass(data.get("firstnameValid"), data.get("lastnameValid"), data.get("emailValid"), data.get("telephoneValid"), data.get("confirmedValid"));
        registerPage.ValidateErrorMessagePass();
        registerPage.clearForm();
        registerPage.Invalid_missingConfirmation(data.get("firstnameValid"), data.get("lastnameValid"), data.get("emailValid"), data.get("telephoneValid"), data.get("passwordValid"));
        registerPage.ValidateErrorMessageConPass();
        registerPage.clearForm();
        registerPage.Invalid_missingtele(data.get("firstnameValid"), data.get("lastnameValid"), data.get("emailValid"), data.get("passwordValid"), data.get("confirmedValid"));
        registerPage.ValidateErrorMessageTele();


    }
    @Test
    //register invalid fields
    public void INVALIDfname_register (){
        registerPage = new RegisterPage(driver);
        registerPage.navigateregisterPage();
        registerPage.IVfirstname(data.get("firstnameInvalid"), data.get("lastnameValid"),data.get("emailValid"), data.get("telephoneValid"),data.get("passwordValid"), data.get("confirmedValid") );
        registerPage.ValidateErrorMessageFname();

    }
    @Test
    //register invalid fields
    public void INVALIDlname_register (){
        registerPage = new RegisterPage(driver);
        registerPage.navigateregisterPage();
        registerPage.IVlastname(data.get("firstnameValid"), data.get("lastnameInvalid"),data.get("emailValid"), data.get("telephoneValid"),data.get("passwordValid"), data.get("confirmedValid") );
        registerPage.ValidateErrorMessageLname();
    }
    @Test
    //register invalid fields
    public void INVALIDemail_register (){
        registerPage = new RegisterPage(driver);
        registerPage.navigateregisterPage();
        registerPage.IVemail(data.get("firstnameValid"), data.get("lastnameValid"),data.get("emailInvalid"), data.get("telephoneValid"),data.get("passwordValid"), data.get("confirmedValid") );
        //registerPage.ValidateErrorMessageemail();
    }
    @Test
    //register invalid fields
    //FAILED
    public void INVALIDtelephone_register (){
        registerPage = new RegisterPage(driver);
        registerPage.navigateregisterPage();
        registerPage.IVemail(data.get("firstnameValid"), data.get("lastnameValid"),data.get("emailValid"), data.get("telephoneInvalid"),data.get("passwordValid"), data.get("confirmedValid") );
        registerPage.ValidateErrorMessageTele();
    }
    @Test
    //register invalid fields
    public void INVALIDpassword_register (){
        registerPage = new RegisterPage(driver);
        registerPage.navigateregisterPage();
        registerPage.IVPass(data.get("firstnameValid"), data.get("lastnameValid"),data.get("emailValid"), data.get("telephoneValid"),data.get("passwordInvalid"), data.get("confirmedValid") );
        registerPage.ValidateErrorMessagePass();
    }
    @Test
    //register invalid fields
    public void INVALIDconfirmed_register (){
        registerPage = new RegisterPage(driver);
        registerPage.navigateregisterPage();
        registerPage.IVConfirmed(data.get("firstnameValid"), data.get("lastnameValid"),data.get("emailValid"), data.get("telephoneValid"),data.get("passwordValid"), data.get("confirmedInvalid") );
        registerPage.ValidateErrorMessageConPass();
    }




        @Test
    //missing email
    public void InvalidRegister2(){
        registerPage = new RegisterPage(driver);
        registerPage.navigateregisterPage();
        registerPage.Invalid_missingemail(data.get("firstnameValid"),data.get("lastnameValid"),data.get("telephoneValid"),data.get("passwordValid"),data.get("confirmedValid"));
        registerPage.ValidateErrorMessageemail();
    }

    @Test
    //missing firstname
    public void InvalidRegister3(){
        registerPage = new RegisterPage(driver);
        registerPage.navigateregisterPage();
        registerPage.Invalid_missingFname(data.get("lastnameValid"),data.get("emailValid"),data.get("telephoneValid"),data.get("passwordValid"),data.get("confirmedValid"));
        registerPage.ValidateErrorMessageFname();
    }

    @Test
    //missing pass
    public void InvalidRegister4(){
        registerPage = new RegisterPage(driver);
        registerPage.navigateregisterPage();
        registerPage.Invalid_missingpass(data.get("firstnameValid"),data.get("lastnameValid"),data.get("emailValid"),data.get("telephoneValid"),data.get("confirmedValid"));
        registerPage.ValidateErrorMessagePass();
    }
    @Test
    //missing confirmed password
    public void InvalidRegister5(){
        registerPage = new RegisterPage(driver);
        registerPage.navigateregisterPage();
        registerPage.Invalid_missingConfirmation(data.get("firstnameValid"),data.get("lastnameValid"),data.get("emailValid"),data.get("telephoneValid"),data.get("passwordValid"));
        registerPage.ValidateErrorMessageConPass();
    }
    @Test
    //invalid tele
    public void InvalidRegister6(){
        registerPage = new RegisterPage(driver);
        registerPage.navigateregisterPage();
        registerPage.Invalid_missingtele(data.get("firstnameValid"),data.get("lastnameValid"),data.get("emailValid"),data.get("passwordValid"),data.get("confirmedValid"));
        registerPage.ValidateErrorMessageTele();
    }


}
