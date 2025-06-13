package pages;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.support.PageFactory;
import java.time.Duration;
import io.appium.java_client.pagefactory.AndroidFindBy;
import org.openqa.selenium.WebElement;



public class BasePage {
    protected AndroidDriver driver;

    public BasePage(AndroidDriver driver) {
        this.driver = driver;
        PageFactory.initElements(new AppiumFieldDecorator(driver, Duration.ofSeconds(10)), this);
    }
}