package pageObjects;

import org.openqa.selenium.WebDriver;

public class PageObjectsManager {

    public HomePagePO homePagePO;
    public LoginPagePO loginPagePO ;
    public WebDriver driver;
    public FormPageObjects formPageObjects;

    public  PageObjectsManager(WebDriver driver){
        this.driver = driver;
    }

    public HomePagePO homePagePO(){
       return homePagePO = new HomePagePO(driver);
    }

    public LoginPagePO getLoginPagePO() {
        return loginPagePO = new LoginPagePO(driver);
    }

    public FormPageObjects getFormPageObjects(){
        return formPageObjects = new FormPageObjects(driver);
    }

}