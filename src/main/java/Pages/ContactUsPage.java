package Pages;

import Base.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ContactUsPage  extends BasePage{

    @FindBy(css = ".menu-item menu-item-type-post_type menu-item-object-page menu-item-26")
    private WebElement contactUsPageLink;

    public boolean isOnContactUsPage() {
        return hasElementDisplayed(By.cssSelector(".breadcrumbs"));
    }
    public void clickOnTheContactUsPageLink() {
        clickButton(contactUsPageLink);
    }
}
