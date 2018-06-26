package Pages;

import Base.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class WhatWeDoPage extends BasePage {

    @FindBy(css = "#<a href=\"https://www.xpanxion.com/services/\">WHAT WE DO</a>")
    private WebElement WhatWeDoPageLink;

    public boolean isOnWhatWeDoPage(){
        return hasElementDisplayed(By.cssSelector(".page_title"));
    }

    public void clickOnWhatWeDoPageLink(){
        clickButton(WhatWeDoPageLink);
    }
}
