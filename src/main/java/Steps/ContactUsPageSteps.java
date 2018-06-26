package Steps;

import Pages.ContactUsPage;
import cucumber.api.java.en.When;
import cucumber.api.java.en.Then;

import static junit.framework.TestCase.assertTrue;

public class ContactUsPageSteps {

    ContactUsPage CUP = new ContactUsPage();

    @When("^I click on the Contact Us Page link$")
    public void iClickOnTheContactUsPageLink() throws Throwable {
        CUP.clickOnTheContactUsPageLink();
    }

    @Then("^the Contact Us Page is displayedd$")
    public void contactUsPageIsDisplayed() throws Throwable {
        assertTrue(CUP.isOnContactUsPage());
    }
}
