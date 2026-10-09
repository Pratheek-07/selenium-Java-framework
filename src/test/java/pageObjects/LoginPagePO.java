package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPagePO {

    WebDriver driver;

    public LoginPagePO(WebDriver driver) {
        this.driver = driver;

    }

    By userName = By.xpath("//input[@id='username");
    By passWord = By.xpath("//input[@id='password']");
    By termsAndConditions = By.xpath("//input[@id='terms']");
    By signInButton = By.xpath("//input[@id='signInBtn']");



    public void enterUserName(String name){
        driver.findElement(userName).sendKeys(name);
    }

    public void enterPassword(String pwd){
        driver.findElement(passWord).sendKeys(pwd);
    }

    public void clickOnTermsAndCondiations(){
        driver.findElement(termsAndConditions).click();
    }

    public void clickOnSignin(){
        driver.findElement(signInButton).click();
    }



}

