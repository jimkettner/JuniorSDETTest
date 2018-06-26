package Pages;

import Base.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class WhoWeArePage extends BasePage {

    @FindBy(css = ".menu-item menu-item-type-post_type menu-item-object-page menu-item-337")
    private WebElement whoWeAreLink;

    public boolean isOnWhoWeArePage() {
        return hasElementDisplayed(By.cssSelector(".page_title"));
    }
    public void clickOnWhoWeAreLink() {
        clickButton(whoWeAreLink);
    }
}
