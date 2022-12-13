package com.nopcommerce.demo.testsuite;

import com.nopcommerce.demo.pages.ComputerPage1;
import com.nopcommerce.demo.testbase.BaseTest;
import org.checkerframework.checker.units.qual.A;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class ComputerPageTest extends BaseTest {

    ComputerPage1 computerPage1;

    @BeforeMethod(alwaysRun = true)
    public void inIt() {
        computerPage1 = new ComputerPage1();
    }



    @Test(groups = {"sanity","regression"})
    public void verifyProductAddedToShoppingCartSuccessfully()throws InterruptedException{
        computerPage1.clickOnComputerTab();
        computerPage1.clickOnDesktop();
        //computerPage1.clickOnSortByPosition();
        computerPage1.selectOptionAtoZFromList();
        Thread.sleep(1000);
        computerPage1.addToCartButton();
        Assert.assertEquals(computerPage1.verifyTextBuildYourOwnComputer(),"Build your own computer");
        computerPage1.selectProcessorFromDropDownList();
        computerPage1.selectRamFromDropDownList();
        computerPage1.select8GBFromDropDown();
        computerPage1.selectHddRadioButton();
        computerPage1.selectOSradioVistaPremiumButton();
        computerPage1.setSelectTotalCommanderCheckBox();
       // Assert.assertEquals(computerPage1.verifyMessage(),"$1,475.00");
        computerPage1.clickAgainOnAddToCartButton();
        Assert.assertEquals(computerPage1.verifyTheMessage(),"The product has been added to your shopping cart");
        //computerPage1.closeMessageTextButton();
        //Assert.assertEquals(computerPage1.verifyShoppingCartMessage(),"Shopping cart");
        computerPage1.closeMessageTextButton();
        computerPage1.mouseHoverOnElementShoppingCart();
        computerPage1.clickOnGoToCart();
        computerPage1.clearTextInQuantityField();
        computerPage1.sendTextToQuantityField();
        computerPage1.clickOnUpdateShoppingCartButton();
        Assert.assertEquals(computerPage1.verifyTotal(),"$2,950.00");
        computerPage1.clickOnCheckBoxIAgreeWithTermsAndCondition();
        computerPage1.clickOnCheckOutButton();
        Assert.assertEquals(computerPage1.verifyWelcometText(),"Welcome, Please Sign In!");
        computerPage1.clickOnCheckOutAsGuest();
        computerPage1.sendTextToFirstNameField("Krishna");
        computerPage1.sendTextToLastNameField("vara");
        computerPage1.sendTextToEmailField("Krish@gmail.com");
        computerPage1.sendTextToCompanyField("Prime");
        computerPage1.selectCountryFromDropDownList();
        computerPage1.sendTextToCityField("London");
        computerPage1.sendTextToAddressLine1("12 block, om nagar");
        computerPage1.sendTextToAddressLine2("Amreli");
        computerPage1.sendTextToPostcode("HA3 9UY");
        computerPage1.sendTextToPhoneNumberField("07896542535");
        computerPage1.clickOnContinueButton();
        computerPage1.clickOnNextDayAirButton();
        computerPage1.clickOnContinueButtonAgain();
        computerPage1.clickOnCreditCardButton();
        computerPage1.selectClickOnContinue1();
        computerPage1.selectMasterCardFromCreditCardDropdown();
        computerPage1.sendTextTOCardHolderName("Krish");
        computerPage1.sendTextTOCardNumber("1111222233334444");
        computerPage1.sendTextToCardCode("406");
        computerPage1.selectMonthAndYearForCreditCardExpireData();
        computerPage1.clickOnContinueButton2();
        Assert.assertEquals(computerPage1.creditCardMessage(),"Credit Card");
        Assert.assertEquals(computerPage1.nextDayAirMessage(),"Next Day Air");
        Assert.assertEquals(computerPage1.totalAmountMessage(),"$2,950.00");
        computerPage1.clickOnConformButton();
        Assert.assertEquals(computerPage1.thankYouMessage(),"Thank you");
        Assert.assertEquals(computerPage1.yourOrderMessage(),"Your order has been successfully processed!");
        computerPage1.clickOnContinueButton3();
        Assert.assertEquals(computerPage1.finalMessage(),"Welcome to our store");

    }
}
