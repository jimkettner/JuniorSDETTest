package Pages;

import Base.BasePage;
import org.openqa.selenium.By;

public class HomePage extends BasePage {

    public boolean isOnHomePage() {

        return hasElementDisplayed(By.cssSelector(".slick-list draggable"));
    }
}
