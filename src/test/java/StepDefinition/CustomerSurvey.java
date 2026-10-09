package StepDefinition;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import pageObjects.FormPageObjects;
import utils.TestContectSetup;

import java.time.Duration;
import java.util.List;

public class CustomerSurvey {

    FormPageObjects fm;
    TestContectSetup tcs;
    Actions actions ;
    public CustomerSurvey(TestContectSetup tcs){
        this.tcs = tcs;
    }


    @Given("User in on the home page")
    public void user_in_on_the_home_page() {
        tcs.driver = new FirefoxDriver();
        tcs.driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        tcs.driver.manage().window().maximize();
        tcs.driver.get("https://form.jotform.com/240741451699463");

    }
    @When("User fills Overall satisfaction rating")
    public void user_fills_overall_satisfaction_rating() {

    }
    @And("Selects Satisfied for {string}")
    public void selects_satisfied_for(String string) {
        fm = new FormPageObjects(tcs.driver);
        fm.fSelectSatisfied();

    }
    @When("Selects Neutral for {string}")
    public void selects_neutral_for(String string) {
        fm.kSelectNeutral();

    }
    @When("Selects Very satisfied for {string}")
    public void selects_very_satisfied_for(String string) {
        fm.qSelectVerySatisfied();


    }
    @When("User selected customer service {string} for future")
    public void user_selected_customer_service_for_future(String string) throws InterruptedException {

            WebElement radio = tcs.driver.findElement(By.id("input_4_0"));
            ((JavascriptExecutor) tcs.driver).executeScript("arguments[0].click();", radio);

        //fm.selectUseServiceInFutureYes();

    }
    @When("User enters How can we improve our service")
    public void user_enters_how_can_we_improve_our_service() {

        fm.writeIntextArea("Additional training to agent can help the knowledge gape");

    }
    @Then("User clicks on the Submit button")
    public void user_clicks_on_the_submit_button() throws InterruptedException {
        actions =  new Actions(tcs.driver);
        actions.sendKeys(Keys.END).perform();
        WebElement submitBtn = tcs.driver.findElement(By.id("input_6"));
        JavascriptExecutor js =(JavascriptExecutor) tcs.driver;
        ((JavascriptExecutor)tcs.driver).executeScript("arugments[0],click()", submitBtn);

       // fm.setClickOnSignIn();



    }


}
