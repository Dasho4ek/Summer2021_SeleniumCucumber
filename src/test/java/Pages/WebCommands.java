package Pages;

import DriverWrapper.Web;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;

public class WebCommands {

    Web web = new Web();

    public WebElement getWebElement(By locator) {
        return web.getDriver().findElement(locator);
    }

    public void clickThis(By locator) {
        getWebElement(locator).click();
    }

    public void type(String data, By locator){
        getWebElement(locator).sendKeys(data);
    }

    public boolean isWebElementEnabled(By locator){
        return getWebElement(locator).isEnabled();
    }

    public boolean isWebElementDisplayed(By locator) {
        return getWebElement(locator).isDisplayed();
    }

    public void scrollDown(int pixels){
        JavascriptExecutor js= (JavascriptExecutor) web.getDriver();
        js.executeScript("scrollBy(0,"+pixels+")");
    }
}
