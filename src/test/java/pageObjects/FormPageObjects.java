package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class FormPageObjects {

    WebDriver driver;
    public FormPageObjects(WebDriver driver){
        this.driver = driver;
    }

    By fverySatisfied = By.xpath("//input[@id='input_3_0_0']");
    By fsatisfied = By.xpath("//input[@id='input_3_0_1']");
    By fneutral = By.xpath("//input[@id='input_3_0_2']");
    By funsatisfied = By.xpath("//input[@id='input_3_0_3']");
    By fveryUnsatisfied = By.xpath("//input[@id='input_3_0_4']");
    By kverySatisfied = By.xpath("//input[@id='input_3_1_0']");
    By ksatisfied = By.xpath("//input[@id='input_3_1_1']");
    By kneutral = By.xpath("//input[@id='input_3_1_2']");
    By kunsatisfied = By.xpath("//input[@id='input_3_1_3']");
    By kveryUnsatisfied = By.xpath("//input[@id='input_3_1_4']");
    By qverySatisfied = By.xpath("//input[@id='input_3_2_0']");
    By qsatisfied = By.xpath("//input[@id='input_3_2_1']");
    By qneutral = By.xpath("//input[@id='input_3_2_2']");
    By qunsatisfied = By.xpath("//input[@id='input_3_2_3']");
    By qveryUnsatisfied = By.xpath("//input[@id='input_3_2_4']");
    By useServiceInFutureYes = By.id("input_4_0");
    By useServiceInFutureNo = By.id("input_4_1");
    By useServiceInFutureMayBe = By.id("input_4_2");
    By textArea = By.xpath("//textarea[@placeholder=\"Type here...\"]");
    By clickOnSignIn = By.xpath("//button[@type='submit']");


    public void fSelectVerySatisfied(){
        driver.findElement(fverySatisfied).click();
    }

    public void kSelectVerySatisfied(){
        driver.findElement(kverySatisfied).click();
    }

    public void qSelectVerySatisfied(){
        driver.findElement(qverySatisfied).click();
    }

    public void fSelectSatisfied(){
        driver.findElement(fsatisfied).click();
    }

    public void kSelectSatisfied(){
        driver.findElement(ksatisfied).click();
    }

    public void qSelectSatisfied(){
        driver.findElement(qsatisfied).click();
    }

    public void fSelectNeutral(){
        driver.findElement(fneutral).click();
    }

    public void kSelectNeutral(){
        driver.findElement(kneutral).click();
    }

    public void qSelectNeutral(){
        driver.findElement(qneutral).click();
    }

    public void fSelectUnsatisfied(){
        driver.findElement(funsatisfied).click();
    }

    public void kSelectUnsatisfied(){
        driver.findElement(kunsatisfied).click();
    }

    public void qSelectUnsatisfied(){
        driver.findElement(qunsatisfied).click();
    }


    public void fSelectVeryUnsatisfied(){
        driver.findElement(fveryUnsatisfied).click();
    }
    public void kSelectVeryUnsatisfied(){
        driver.findElement(kveryUnsatisfied).click();
    }
    public void qSelectVeryUnsatisfied(){
        driver.findElement(qveryUnsatisfied).click();
    }



    public void selectUseServiceInFutureYes(){
        driver.findElement(useServiceInFutureYes).click();
    }

    public void selectUseServiceInFutureNo(){
        driver.findElement(useServiceInFutureNo).click();
    }

    public void selectUseServiceInFutureMayBe(){
        driver.findElement(useServiceInFutureMayBe).click();
    }

    public void writeIntextArea(String comment){
        driver.findElement(textArea).sendKeys(comment);
    }

    public void setClickOnSignIn(){
        driver.findElement(clickOnSignIn).click();
    }

}
