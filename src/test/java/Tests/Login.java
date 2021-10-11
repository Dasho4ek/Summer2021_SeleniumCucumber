package Tests;

import DriverWrapper.Web;
import Pages.Facebook.Homepage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Login extends Web {

    @Test
    public void isLoginButtonEnabled(){
    openWebpage();
    Homepage homepage= new Homepage();
   Assert.assertTrue(homepage.isLoginEnabled(), "Login button is not enabled");

   quitWebpage();

    }

}
