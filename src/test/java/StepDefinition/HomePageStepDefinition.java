package StepDefinition;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import utils.TestContectSetup;

public class HomePageStepDefinition {

    TestContectSetup tcs;
    public HomePageStepDefinition(TestContectSetup tcs){
            this.tcs = tcs;
    }


    @Then("User is logged in and home page is visible")
    public void userIsLoggedInandHomePageIsVisible(){
        System.out.println(tcs.driver.getTitle());

    }

    @And("All the products are visible")
    public void allTheProductsAreVisible() throws InterruptedException {

        WebElement img = tcs.driver.findElement(By.xpath("//a[text()='iphone X']"));
        Thread.sleep(5000);
        Assert.assertTrue(img.isDisplayed());

        tcs.driver.quit();
    }

}
