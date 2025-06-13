package pages;

import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.support.ui.ExpectedConditions;
import java.time.Duration;

public class CreateWalletPage extends BasePage {

    @AndroidFindBy(id = "com.wallet.crypto.trustapp:id/buttonTitle")
    private WebElement createNewWalletButton;

    public CreateWalletPage(AndroidDriver driver) {
        super(driver); 
    }

    public void clickCreateButton() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.visibilityOf(createNewWalletButton));
        createNewWalletButton.click();    
    }
}