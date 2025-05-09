package Tests;

import Base.TestBase;
import Pages.LoginPage;
import org.testng.annotations.Test;

public class LoginTests extends TestBase{


        LoginPage loginPage;

        @Test
        public void validlogin() {

            loginPage = new LoginPage(driver);
            loginPage.navigate();
            loginPage.enteremail("emanmaher135i@gmail.com");
            loginPage.enterpassword("eman135");
            loginPage.clickloginbutton();

        }

        @Test
        public void loginwithinvalidemail() {

            LoginPage loginpage = new LoginPage(driver);
            loginPage.navigate();
            loginPage.enteremail("invalid");
            loginPage.enterpassword("eman135");
            loginPage.clickloginbutton();
        }

        @Test
        public void loginwithinvalidpassword() {
            LoginPage loginPage = new LoginPage(driver);
            loginPage.navigate();
            loginPage.enteremail("emanmaher135i@gmail.com");
            loginPage.enterpassword("invalid");
            loginPage.clickloginbutton();
        }

        @Test
        public void loginwithinvalidemailandpassword() {

            LoginPage loginPage = new LoginPage(driver);
            loginPage.navigate();
            loginPage.enteremail("invalid");
            loginPage.enterpassword("invalid");
            loginPage.clickloginbutton();

        }
    }




































