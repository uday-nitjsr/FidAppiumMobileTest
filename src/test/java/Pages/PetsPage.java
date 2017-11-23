package Pages;

import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebDriver;

/**
 * Created by asus on 6/29/2017.
 */
public class PetsPage extends BasePage {
    public PetsPage(AndroidDriver driver) {
        super(driver);
    }

    public WebElement getHeaderTopTextElement(){
        return driver.findElement(By.xpath("//div[@class='container xd-container']/h2"));
    }
}
