package Pages;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import jdk.nashorn.internal.objects.annotations.Getter;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.PageFactory;

/**
 * Created by ASUS on 08-11-2016.
 */
public class HomePage extends BasePage {

    public HomePage(AndroidDriver driver) {
        super(driver);
        PageFactory.initElements(new AppiumFieldDecorator(driver),this);
    }

    WebElement welcomeTextElement;

    @AndroidFindBy(xpath = "//android.widget.Button[@text='Continue']")
    public AndroidElement continueButton;

    @AndroidFindBy(xpath = "//android.widget.EditText[@text='Username']")
    public AndroidElement usernameField;

    @AndroidFindBy(xpath = "//android.widget.EditText[@text='Password']")
    public AndroidElement passwordField;

    @AndroidFindBy(xpath = "//android.widget.Button[@text='Log in']")
    public AndroidElement logInButton;

    @AndroidFindBy(xpath = "//android.view.View[@text='. Activities']")
    public AndroidElement activitiesTab;

    public WebElement getWelcomeTextElement(){
        return driver.findElement(By.cssSelector("app-welcome h1"));
    }

}
