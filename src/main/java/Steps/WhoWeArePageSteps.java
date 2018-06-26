package Steps;

import Pages.WhoWeArePage;
import cucumber.api.java.en.When;
import cucumber.api.java.en.Then;

import static junit.framework.TestCase.assertTrue;

public class WhoWeArePageSteps {

    WhoWeArePage WWAP = new WhoWeArePage();

    @When("^I click on the Who We Are Page Link$")
    public void iClickOnTheWhoWeArePageLink() throws Throwable {
        WWAP.clickOnWhoWeAreLink();
    }

    @Then("^the Who We Are Page is displayed$")
    public void whoWeArePageIsDisplayed() throws Throwable {
        assertTrue(WWAP.isOnWhoWeArePage());
    }

}
