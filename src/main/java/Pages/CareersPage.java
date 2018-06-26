package Pages;

import Base.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CareersPage extends BasePage {

    @FindBy(css = ".menu-item menu-item-type-post_type menu-item-object-page menu-item-965")
    private WebElement CareersPageLink;

    public boolean isOnCareersPage(){
        return hasElementDisplayed(By.cssSelector(".page_title"));
    }

    public void clickOnTheCareersPageLink() {
        clickButton(CareersPageLink);
    }
}
