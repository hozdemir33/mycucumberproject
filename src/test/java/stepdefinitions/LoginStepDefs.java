
package stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import pages.LoginPage;
import utilities.ConfigurationReader;
import utilities.Driver;

public class LoginStepDefs {
    LoginPage loginPage = new LoginPage();
    @Given("user is on the login page")
    public void user_is_on_the_login_page() {
        Driver.getDriver().get(ConfigurationReader.getProperty("gmi_login_url"));
    }
    @Given("user clicks on login dropdown")
    public void user_clicks_on_login_dropdown() {
//        Create pages, locate the elements
        loginPage.loginDropdown.click();
    }
    @Given("user clicks on sign in button")
    public void user_clicks_on_sign_in_button() {
        loginPage.signInButton.click();
    }
    @Given("user sends username {string}")
    public void user_sends_username(String string) {
        loginPage.username.sendKeys(string);
    }
    @Given("user sends password {string}")
    public void user_sends_password(String string) {
        loginPage.password.sendKeys(string);
    }
    @Given("user clicks on the login button")
    public void user_clicks_on_the_login_button() {

        loginPage.loginButton.click();
    }

    @Given("user enters admin_id and admin_password")
    public void user_enters_admin_id_and_admin_password(io.cucumber.datatable.DataTable dataTable) {
        // Write code here that turns the phrase above into concrete actions
        // For automatic transformation, change DataTable to one of
        // E, List<E>, List<List<E>>, List<Map<K,V>>, Map<K,V> or
        // Map<K, List<V>>. E,K,V must be a String, Integer, Float,
        // Double, Byte, Short, Long, BigInteger or BigDecimal.



    }
    @Then("verify the login is successful")
    public void verify_the_login_is_successful() {




    }

}