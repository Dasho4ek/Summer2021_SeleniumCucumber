package Pages.Facebook;

import Pages.WebCommands;
import org.openqa.selenium.By;

public class Homepage extends WebCommands {

  //  WebCommands webCommands= new WebCommands();

    By loginButtonLocator= By.tagName("button");
    By emailBoxLocator= By.id("email");
    By pswBoxLocator = By.id("password");


    public void clickLoginButton() {
      clickThis(loginButtonLocator);
    }
     public void typeLoginEmail(String email) {
        type(email,emailBoxLocator);

     }
    public void typeLoginPsw(String psw){
        type(psw, pswBoxLocator);
    }

    public boolean isLoginEnabled(){
      return isWebElementEnabled(loginButtonLocator);

    }





}
