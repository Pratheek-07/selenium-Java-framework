package StepDefinition;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import utils.TestContectSetup;

import java.time.Duration;

public class LoginPageStepDefinition {

    TestContectSetup tcs;
    public LoginPageStepDefinition(TestContectSetup tcs){
        this.tcs = tcs;
    }

//    WebDriverWait wait = new WebDriverWait(tcs.driver, Duration.ofSeconds(5));

    @Given("User is on login page")
    public void userInLoginPage(){
       // System.out.println("User is on login page");

        tcs.driver = new FirefoxDriver();
        tcs.driver.get("https://rahulshettyacademy.com/loginpagePractise/");
        tcs.driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));


    }

    @When("User login to website using {string} and {string}")
    public void user_login_to_website_using_and(String username, String password) {

        tcs.driver.findElement(By.xpath("//input[@id='username']")).sendKeys(username);
        tcs.driver.findElement(By.xpath("//input[@id='password']")).sendKeys(password);
        tcs.driver.findElement(By.xpath("//input[@id='terms']")).click();
        tcs.driver.findElement(By.xpath("//input[@id='signInBtn']")).click();

    }

}
