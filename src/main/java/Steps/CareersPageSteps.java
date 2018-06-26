package Steps;

import Pages.CareersPage;
import cucumber.api.java.en.When;
import cucumber.api.java.en.Then;

import static junit.framework.TestCase.assertTrue;

public class CareersPageSteps {

    CareersPage CP = new CareersPage();

    @When("^I click on the Careers Page Link$")
    public void iClickOnTheCareersPageLink() throws Throwable {
        CP.clickOnTheCareersPageLink();
    }

    @Then("^the Careers Page is displayed$")
    public void CareersPageIsDisplayed() throws Throwable {
        assertTrue(CP.isOnCareersPage());
    }
}
