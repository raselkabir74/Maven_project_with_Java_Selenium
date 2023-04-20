package pages;

import org.openqa.selenium.remote.RemoteWebDriver;

import base.Base;
import locators.InventoryLocators;

public class InventoryPage extends Base{

    RemoteWebDriver driver;
    CommonMethods commonMethods;

    public InventoryPage(RemoteWebDriver driver){
        this.driver = driver;
        commonMethods = new CommonMethods(this.driver);
    }

    public String getAppLogoName(){
        return driver.findElement(InventoryLocators.appLogoName).getText();
    }
}
