package Tests.AbstractBaseTests;

import Pages.HomePage;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

/**
 * Created by ASUS on 08-11-2016.
 */
public class HomePageTest extends TestBase{
    public HomePage homePage;

    @Override
    public String getName() {
        return null;
    }

    @BeforeTest
    @Override
    public void setUpPage(){
        try {
            homePage = new HomePage(driver);
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    @Test(enabled = true)
    public void checkHeader() throws InterruptedException {
        Thread.sleep(5000);
        homePage.usernameField.sendKeys("smoke_admin");
        homePage.continueButton.click();
        homePage.passwordField.sendKeys("12341234");
        homePage.logInButton.click();
        Thread.sleep(5000);
        Assert.assertEquals(homePage.activitiesTab.isDisplayed(),true);
    }

}
