package Pages;

import Base.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class OurWorkPage extends BasePage {

    @FindBy(css = ".menu-item menu-item-type-post_type menu-item-object-page menu-item-336")
    private WebElement ourWorkPageLink;

    public boolean isOnOurWorkPage() {
        return hasElementDisplayed(By.cssSelector(".page_title"));
    }

    public void clickOnOurWorkPageLink() {
        clickButton(ourWorkPageLink);
    }
}
