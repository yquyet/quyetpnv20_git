package tests;


import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;

public class OpenAccountTest extends PageProvider {

    @When("^I click user select$")
    public void clickInWebsite() throws InterruptedException {
        Thread.sleep(3000);
        getOpenAccountPage().chose();
    }

    @And("^I click chose name$")
    public void clickChoseNameInWebsite() throws InterruptedException {
        Thread.sleep(3000);
        getOpenAccountPage().choseName();
    }
    @And("^I click submit$")
    public void clickSubmitLoginInWebsite() throws InterruptedException {
        Thread.sleep(3000);
        getOpenAccountPage().submitLogin();
    }




}
