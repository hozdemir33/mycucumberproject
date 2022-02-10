package stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeOptions;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.safari.SafariOptions;
import utilities.ConfigurationReader;
import utilities.Driver;

import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;
public class GridStepDefs {
    WebDriver driver;


    @Given("on the application_url with edge")

    public void on_the_application_url_with_edge() throws MalformedURLException {
        //  1. Crete a driver object using RemoteWebDriver
        //   URL is coming from hte terminal
        //   new ChromeOptions() is used for running on chrome driver
        driver = new RemoteWebDriver(new URL("http://192.168.1.116:4444"),new EdgeOptions());

        driver.manage().window().maximize();

        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));

        driver.get(ConfigurationReader.getProperty("gmi_login_url"));
    }

    @Then("verify the title of the page is GMIBANK")
    public void verify_the_title_of_the_page_is_gmibank() {

        String title = driver.getTitle();
        Assert.assertEquals("GMIBANK",title);
    }

    @Then("close the remote driver")
    public void close_the_remote_driver() {
        driver.close();
    }

    @Given("user is on the application_url with firefox")
    public void user_is_on_the_application_url_with_firefox() throws MalformedURLException {

        driver=new RemoteWebDriver(new URL("http://192.168.1.116:4444"),new FirefoxOptions());
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(4));
        driver.get(ConfigurationReader.getProperty("https://google.com"));

    }

}