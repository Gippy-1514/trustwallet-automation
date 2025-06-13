package pages;

import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.support.ui.ExpectedConditions;
import java.time.Duration;

public class WelcomePage extends BasePage {

    @AndroidFindBy(xpath = "//*[@text='Create new wallet']")
    private WebElement createNewWalletText;

    @AndroidFindBy(xpath = "//*[@resource-id='CreateNewWalletButton']")
    private WebElement createNewWalletButtonParent;

    @AndroidFindBy(xpath = "//*[@text='I already have a wallet']")
    private WebElement importWalletButton;

    public WelcomePage(AndroidDriver driver) {
        super(driver);
    }

    public boolean isCreateWalletButtonDisplayed() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        try {
            wait.until(ExpectedConditions.visibilityOf(createNewWalletText));
            return createNewWalletText.isDisplayed();
        } catch (Exception e) {
            return false;
        }
    }

    public boolean isImportWalletButtonDisplayed() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        try {
            wait.until(ExpectedConditions.visibilityOf(importWalletButton));
            return importWalletButton.isDisplayed();
        } catch (Exception e) {
            return false;
        }
    }

    public void clickCreateNewWallet() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.visibilityOf(createNewWalletText));
        try {
            createNewWalletText.click();
        } catch (Exception e) {
            createNewWalletButtonParent.click();
        }
    }
}