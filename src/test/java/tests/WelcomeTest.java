package tests;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.WelcomePage;
import utils.DriverUtils;

public class WelcomeTest extends BaseTest {

    @Test(description = "Verify Create New Wallet button is visible")
    public void verifyCreateWalletButtonExists() {
        WelcomePage welcomePage = new WelcomePage(DriverUtils.getDriver());
        Assert.assertTrue(welcomePage.isCreateWalletButtonDisplayed(), 
                        "Create New Wallet button should be visible");
    }
    @Test(description = "Verify Import Wallet button is visible")
    public void verifyImportWalletButtonExists() {
        WelcomePage welcomePage = new WelcomePage(DriverUtils.getDriver());
        Assert.assertTrue(welcomePage.isImportWalletButtonDisplayed(),
                        "Import Wallet button should be visible");
    }
    @Test(description = "Test clicking Create New Wallet button")
     public void testCreateNewWalletButton() {
        WelcomePage welcomePage = new WelcomePage(DriverUtils.getDriver());
        Assert.assertTrue(welcomePage.isCreateWalletButtonDisplayed());
        welcomePage.clickCreateNewWallet();
        
    }
}