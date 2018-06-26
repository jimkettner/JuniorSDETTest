package Base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public abstract class WebDriverPage {

    private static WebDriver driver = new ChromeDriver();

    public static WebDriver getDriverInstance(){

        return driver;
    }

}
