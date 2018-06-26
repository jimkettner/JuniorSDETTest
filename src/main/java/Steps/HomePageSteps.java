package Steps;

import Pages.HomePage;
import cucumber.api.java.en.Then;

import static org.junit.Assert.assertTrue;

public class HomePageSteps {

    HomePage HP = new HomePage();

    @Then("^the Home Page will be displayed")
    public void userMovesToHomePage() throws Throwable {
        assertTrue(HP.isOnHomePage());
    }
}
