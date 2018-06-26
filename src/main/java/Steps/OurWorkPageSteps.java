package Steps;

import Pages.OurWorkPage;
import cucumber.api.java.en.When;
import cucumber.api.java.en.Then;

import static junit.framework.TestCase.assertTrue;

public class OurWorkPageSteps {

    OurWorkPage OWP = new OurWorkPage();

    @When("^I click on the Our Work Page Link$")
    public void iClickOnOurWorkPageLink() throws Throwable {
        OWP.clickOnOurWorkPageLink();
    }

    @Then("^the Our Work Page is Displayed$")
    public void ourWorkPageIsDisplayed() throws Throwable {
        assertTrue(OWP.isOnOurWorkPage());
    }

}
