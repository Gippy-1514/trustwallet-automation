package tests;

import org.testng.annotations.Test;
import pages.CreateWalletPage;
import utils.DriverUtils;

public class CreateWalletTest extends BaseTest {

    @Test
    public void validTestWalletCreation() {
        CreateWalletPage createWalletPage = new CreateWalletPage(DriverUtils.getDriver());
        createWalletPage.clickCreateButton();
    }
}