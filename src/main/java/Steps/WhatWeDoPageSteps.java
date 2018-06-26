package Steps;

import Pages.WhatWeDoPage;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import sun.security.util.PendingException;

import static junit.framework.TestCase.assertTrue;

public class WhatWeDoPageSteps {

    WhatWeDoPage WWDP = new WhatWeDoPage();

    @When("^I click on the What We Do Page link$")
    public void iClickOnWhatWeDoPageLink() throws PendingException {
        WWDP.clickOnWhatWeDoPageLink();
    }


    @Then("^the What We Do Page is displayed$")
    public void WhatWeDoPageIsDisplayed() throws PendingException{
        assertTrue(WWDP.isOnWhatWeDoPage());
    }
}
