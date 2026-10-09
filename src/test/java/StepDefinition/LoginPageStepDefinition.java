package StepDefinition;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
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

        // For running headless mode
//        ChromeOptions options = new ChromeOptions();
//        options.addArguments("-headless");
//        tcs.driver = new ChromeDriver(options);

        tcs.driver = new ChromeDriver();
        tcs.driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        tcs.driver.manage().window().maximize();
        tcs.driver.get("https://rahulshettyacademy.com/loginpagePractise/");
        tcs.driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));

        System.out.println(" Pushing to branch ");

    }

    @When("User login to website using {string} and {string}")
    public void user_login_to_website_using_and(String username, String password)  {

        tcs.driver.findElement(By.xpath("//input[@id='username']")).sendKeys(username);
        tcs.driver.findElement(By.xpath("//input[@id='password']")).sendKeys(password);
        tcs.driver.findElement(By.xpath("//input[@id='terms']")).click();
        tcs.driver.findElement(By.xpath("//input[@id='signInBtn']")).click();

    }

}
