package com.nopcommerce.demo.pages;

import com.nopcommerce.demo.utility.Utility;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.testng.Reporter;

public class ComputerPage1 extends Utility {
    @CacheLookup
    @FindBy(xpath = "//body/div[6]/div[2]/ul[1]/li[1]/a[1]")
    WebElement computertab;

    //By computertab =By.xpath("//body/div[6]/div[2]/ul[1]/li[1]/a[1]");

    @CacheLookup
    @FindBy(xpath = "/html[1]/body[1]/div[6]/div[3]/div[1]/div[2]/div[1]/div[2]/ul[1]/li[1]/ul[1]/li[1]/a[1]")
    WebElement desktopTab;
    // By desktopTab = By.xpath("/html[1]/body[1]/div[6]/div[3]/div[1]/div[2]/div[1]/div[2]/ul[1]/li[1]/ul[1]/li[1]/a[1]");

    @CacheLookup
    @FindBy(id = "products-orderby")
    WebElement selectPosition;
    //  By selectPosition=By.id("products-orderby");

    @CacheLookup
            @FindBy(xpath = "/html[1]/body[1]/div[6]/div[3]/div[1]/div[3]/div[1]/div[2]/div[2]/div[2]/div[1]/div[1]/div[1]/div[1]/div[2]/div[3]/div[2]/button[1]")
   // @FindBy(xpath = "//body/div[6]/div[3]/div[1]/div[3]/div[1]/div[2]/div[2]/div[2]/div[1]/div[1]/div[1]/div[1]/div[2]/div[3]/div[2]/button[1]")
    WebElement addToCart;
    // By addToCart =By.xpath("/html[1]/body[1]/div[6]/div[3]/div[1]/div[3]/div[1]/div[2]/div[2]/div[2]/div[1]/div[1]/div[1]/div[1]/div[2]/div[3]/div[2]/button[1]");

    @CacheLookup
    @FindBy(xpath = "//h1[contains(text(),'Build your own computer')]")
    WebElement verifyTextBuildYourOwnComputer;
    //By verifyTextBuildYourOwnComputer = By.xpath("//h1[contains(text(),'Build your own computer')]");

    @CacheLookup
    @FindBy(css = "#product_attribute_1")
    WebElement sortProcessor;
    //  By sortProcessor = By.cssSelector("#product_attribute_1");

    @CacheLookup
    @FindBy(xpath = "//dd[@id='product_attribute_input_1']//option[2]")
    WebElement selectProcessor;
    // By selectProcessor = By.xpath("//dd[@id='product_attribute_input_1']//option[2]");

    @CacheLookup
    @FindBy(xpath = "//select[@data-attr ='2']")
    WebElement selectRam;
    //By selectRam = By.xpath("//select[@data-attr ='2']");

    @CacheLookup
    @FindBy(xpath = "//option[@data-attr-value ='5']")
    WebElement select8Gb;
    // By select8Gb = By.xpath("//option[@data-attr-value ='5']");

    @CacheLookup
    @FindBy(xpath = "//label[@for ='product_attribute_3_7']")
    WebElement selectHddRadio;
    //By selectHddRadio = By.xpath("//label[@for ='product_attribute_3_7']");

    @CacheLookup
    @FindBy(xpath = "//input[@id ='product_attribute_4_9']")
    WebElement selectOSradio;
    // By selectOSradio = By.xpath("//input[@id ='product_attribute_4_9']");

    @CacheLookup
    @FindBy(xpath = "//input[@id ='product_attribute_5_10']")
    WebElement selectMicrosoftOffice;
    //By selectMicrosoftOffice = By.xpath("//input[@id ='product_attribute_5_10']");

    @CacheLookup
    @FindBy(xpath = "//input[@id ='product_attribute_5_12']")
    WebElement selectTotalCommander;
    //  By selectTotalCommander = By.xpath("//input[@id ='product_attribute_5_12']");

    @CacheLookup
    @FindBy(xpath = "//span[@id ='price-value-1']")
    WebElement verifyPrice;
    // By verifyPrice = By.xpath("//span[@id ='price-value-1']");

    @CacheLookup
    @FindBy(xpath = "//button[@id ='add-to-cart-button-1']")
    WebElement clickOnAddToCart;
    //By clickOnAddToCart = By.xpath("//button[@id ='add-to-cart-button-1']");

    @CacheLookup
    @FindBy(xpath = "//body/div[@id='bar-notification']/div[1]/p[1]")
    WebElement verifyTheMessage;
    // By verifyTheMessage = By.xpath("//body/div[@id='bar-notification']/div[1]/p[1]");

    @CacheLookup
    @FindBy(xpath = "//span[@class='close']")
    WebElement closeButton;
    // By closeButton = By.xpath("//span[@class='close']");

    @CacheLookup
    @FindBy(xpath = "//body/div[@id='bar-notification']/div[1]/span[1]")
    WebElement verifyShoppingCartMessage;
    //By verifyShoppingCartMessage = By.xpath("//body/div[@id='bar-notification']/div[1]/span[1]");////a[@class='ico-cart']

    @CacheLookup
    @FindBy(xpath = "//span[contains(text(),'Shopping cart')]")
    WebElement mouseHoverOnShoppingCart;
    // By mouseHoverOnShoppingCart = By.xpath("//span[contains(text(),'Shopping cart')]");

    @CacheLookup
    @FindBy(xpath = "//button[@class='button-1 cart-button']")
    WebElement clickOnGoToCart;
    //By clickOnGoToCart = By.xpath("//button[@class='button-1 cart-button']");

    @CacheLookup
    @FindBy(xpath = "//h1[contains(text(),'Shopping cart')]")
    WebElement verifyMessageShoppingCart;
    // By verifyMessageShoppingCart = By.xpath("//h1[contains(text(),'Shopping cart')]");

    @CacheLookup
    @FindBy(xpath = "//input[@value='1']")
    WebElement clearText;
    //By clearText = By.xpath("//input[@value='1']");

    @CacheLookup
    @FindBy(xpath = "//input[@value='1']")
    WebElement sendTextToQuantity;
    //By sendTextToQuantity = By.xpath("//input[@value='1']");

    @CacheLookup
    @FindBy(xpath = "//button[@id='updatecart']")
    WebElement clickOnUpdateShoppingCart;
    // By clickOnUpdateShoppingCart = By.xpath("//button[@id='updatecart']");

    @CacheLookup
    @FindBy(xpath = "//tbody/tr[1]/td[6]/span[1]")
    WebElement verifyTotal;

    @CacheLookup
    @FindBy(xpath = "//input[@id='termsofservice']")
    WebElement clickOnCheckbox;
    //By clickOnCheckbox = By.xpath("//input[@id='termsofservice']");

    @CacheLookup
    @FindBy(id = "checkout")
    WebElement checkout;
    //button[@id='checkout'] ;

    @CacheLookup
    @FindBy(xpath = "//button[@id='checkout']")
    WebElement clickOnCheckout;
    // By clickOnCheckout = By.xpath("//button[@id='checkout']");

    @CacheLookup
    @FindBy(xpath = "//h1[contains(text(),'Welcome, Please Sign In!')]")
    WebElement verifyTextWelcome;
    //By VerifyTextWelcome, PleaseSignIn = By.xpath("//h1[contains(text(),'Welcome, Please Sign In!')]");

    @CacheLookup
    @FindBy(xpath = "//button[contains(text(),'Checkout as Guest')]")
    WebElement clickOnCheckoutAsGuest;
    // By clickOnCheckoutAsGuest = By.xpath("//button[contains(text(),'Checkout as Guest')]");

    @CacheLookup
    @FindBy(id = "BillingNewAddress_FirstName")
    WebElement sendTextToFirstName;
    // By sendTextToFirstName = By.id("BillingNewAddress_FirstName");

    @CacheLookup
    @FindBy(id = "BillingNewAddress_LastName")
    WebElement sendTextToLastName;
    //By sendTextToLastName = By.id("BillingNewAddress_LastName");

    @CacheLookup
    @FindBy(id = "BillingNewAddress_Email")
    WebElement sendTextToEmail;
    //By sendTextToEmail = By.id("BillingNewAddress_Email");

    @CacheLookup
    @FindBy(id = "BillingNewAddress_Company")
    WebElement sendTextToCompany;
    // By sendTextToCompany = By.id("BillingNewAddress_Company");

    @FindBy(xpath = "//select[@id='BillingNewAddress_CountryId']")
    WebElement country;

    @CacheLookup
    @FindBy(xpath = "//input[@id='BillingNewAddress_City']")
    WebElement sendTextToCity;
    // By sendTextToCity = By.xpath("//input[@id='BillingNewAddress_City']");

    @CacheLookup
    @FindBy(css = "#BillingNewAddress_Address1")
    WebElement sendTextToAddress1;
    // By sendTextToAddress1 = (By.cssSelector("#BillingNewAddress_Address1"));

    @CacheLookup
    @FindBy(css = "#BillingNewAddress_Address2")
    WebElement sendTextToAddress2;
    //By sendTextToAddress2 = (By.cssSelector("#BillingNewAddress_Address2"));

    @CacheLookup
    @FindBy(xpath = "//input[@id='BillingNewAddress_ZipPostalCode']")
    WebElement sendTextToPostalCode;
    //By sendTextToPostalCode = By.xpath("//input[@id='BillingNewAddress_ZipPostalCode']");

    @CacheLookup
    @FindBy(xpath = "//input[@id='BillingNewAddress_PhoneNumber']")
    WebElement sendTextToPhoneNumber;
    //By sendTextToPhoneNumber = By.xpath("//input[@id='BillingNewAddress_PhoneNumber']");

    @CacheLookup
    @FindBy(xpath = "//body/div[6]/div[3]/div[1]/div[1]/div[1]/div[2]/ol[1]/li[1]/div[2]/div[1]/button[4]")
    WebElement clickOnContinue;
    // By clickOnContinue = By.xpath("//body/div[6]/div[3]/div[1]/div[1]/div[1]/div[2]/ol[1]/li[1]/div[2]/div[1]/button[4]");

    @CacheLookup
    @FindBy(xpath = "//input[@id='shippingoption_1']")
    WebElement clickOnNextDayAir;
    //By clickOnNextDayAir = By.xpath("//input[@id='shippingoption_1']");

    @CacheLookup
    @FindBy(xpath = "//body/div[6]/div[3]/div[1]/div[1]/div[1]/div[2]/ol[1]/li[3]/div[2]/form[1]/div[2]/button[1]")
    WebElement clickOnContinueTab;
    // By clickOnContinueTab = By.xpath("//body/div[6]/div[3]/div[1]/div[1]/div[1]/div[2]/ol[1]/li[3]/div[2]/form[1]/div[2]/button[1]");

    @CacheLookup
    @FindBy(xpath = "//input[@id='paymentmethod_1']")
    WebElement clickOnCreditCard;
    // By clickOnCreditCard = By.xpath("//input[@id='paymentmethod_1']");

    @CacheLookup
    @FindBy(xpath = "//button[@class='button-1 payment-method-next-step-button']")
    WebElement continueButton;
    //By continueButton = By.xpath("//button[@class='button-1 payment-method-next-step-button']");

    @CacheLookup
    @FindBy(xpath = "//body/div[6]/div[3]/div[1]/div[1]/div[1]/div[2]/ol[1]/li[4]/div[2]/div[1]/button[1]")
    WebElement clickOnMasterCard;
    // By clickOnMasterCard = By.xpath("//body/div[6]/div[3]/div[1]/div[1]/div[1]/div[2]/ol[1]/li[4]/div[2]/div[1]/button[1]");

    @CacheLookup
    @FindBy(id = "CardholderName")
    WebElement cardholdername;
    //By cardholdername = By.id("CardholderName");

    @CacheLookup
    @FindBy(id = "CardNumber")
    WebElement cardNumber;
    //By cardNumber = By.id("CardNumber");

    @CacheLookup
    @FindBy(id = "CardCode")
    WebElement cardCode;
    // By cardCode = By.id("CardCode");

    @CacheLookup
    @FindBy(xpath = "//button[@class='button-1 payment-info-next-step-button']")
    WebElement continueButton2;
    //By continueButton2=By.xpath("//button[@class='button-1 payment-info-next-step-button']");

    @CacheLookup
    @FindBy(xpath = "//button[@class='button-1 confirm-order-next-step-button']")
    WebElement conform;
    //By conform=By.xpath("//button[@class='button-1 confirm-order-next-step-button']");

    @CacheLookup
    @FindBy(css = "div.master-wrapper-page:nth-child(6) div.master-wrapper-content div.master-column-wrapper div.center-1 div.page.checkout-page.order-completed-page div.page-body.checkout-data div.section.order-completed div.buttons > button.button-1.order-completed-continue-button")
    WebElement continueButton3;
    // By continueButton3=By.cssSelector("div.master-wrapper-page:nth-child(6) div.master-wrapper-content div.master-column-wrapper div.center-1 div.page.checkout-page.order-completed-page div.page-body.checkout-data div.section.order-completed div.buttons > button.button-1.order-completed-continue-button");
@CacheLookup
@FindBy(xpath = "//li[@class='payment-method']/span[2]")
WebElement creditCardMessage;

    @CacheLookup
    @FindBy(xpath = "//li[@class='shipping-method']//span[2]")
    WebElement nextDayAirMessage;

    @CacheLookup
    @FindBy(xpath = "//tr[@class='order-total']/td[2]/span/strong")
    WebElement finalAmountMessage;

    @CacheLookup
    @FindBy(xpath = "//h1[contains(text(),'Thank you')]")
    WebElement thankYouMessage;

    @CacheLookup
    @FindBy(xpath = "//strong[contains(text(),'Your order has been successfully processed!')]")
    WebElement successfulMessage;

    @CacheLookup
    @FindBy(xpath = "//h2[contains(text(),'Welcome to our store')]")
    WebElement finalMessage;
    public void clickOnComputerTab() {
        Reporter.log("click on Computer tab"+computertab.toString());
        clickOnElement(computertab);
    }

    public void clickOnDesktop() {
        Reporter.log("Click onDesktop "+ desktopTab.toString());
        clickOnElement(desktopTab);
    }

    /* public void clickOnSortByPosition() {
       clickOnElement(sortByPosition);
   }*/
    public void selectOptionAtoZFromList() {
Reporter.log("Select option Z to A"+selectPosition.toString());
        selectByVisibleTextFromDropDown(selectPosition, "Name: Z to A");

    }

    public void addToCartButton() {
        Reporter.log("Click onAdd to cart button "+addToCart.toString());
        try {
            clickOnElement(addToCart);
        } catch (org.openqa.selenium.StaleElementReferenceException e) {
            clickOnElement(addToCart);
        }
    }

    public String verifyTextBuildYourOwnComputer() {
        Reporter.log("Verify Text build your own computer"+verifyTextBuildYourOwnComputer.toString());
        return getTextFromElement(verifyTextBuildYourOwnComputer);
    }

    public void clickOnProcessorfeildDropDown() {
        Reporter.log("Click on sort processor "+sortProcessor.toString());
        clickOnElement(sortProcessor);
    }

    public void selectProcessorFromDropDownList() {
Reporter.log("Select processor "+selectProcessor.toString());
        clickOnElement(selectProcessor);
    }

    public void selectRamFromDropDownList() {
        Reporter.log("Select ram "+selectRam.toString());
        clickOnElement(selectRam);
    }

    public void select8GBFromDropDown() {
        Reporter.log("Select 8GB "+select8Gb.toString());
        clickOnElement(select8Gb);
    }

    public void selectHddRadioButton() {
        Reporter.log("Select HDD Radio Button "+selectHddRadio.toString());
        clickOnElement(selectHddRadio);
    }

    public void selectOSradioVistaPremiumButton() {
        Reporter.log("Select OS radio vista premium button "+selectOSradio.toString());
        clickOnElement(selectOSradio);
    }

    public void selectMicrosoftOffice() {
        Reporter.log("Select microsoft office "+selectMicrosoftOffice.toString());
        clickOnElement(selectMicrosoftOffice);
    }

    public void setSelectTotalCommanderCheckBox() {
Reporter.log(" Select totla commander checkbox"+selectTotalCommander.toString());
        clickOnElement(selectTotalCommander);
    }

    public String verifyMessage() {
        // Thread.sleep(1000);
        Reporter.log("Verify message "+verifyPrice.toString());
        return getTextFromElement(verifyPrice);
    }

    public void clickAgainOnAddToCartButton() {
        Reporter.log("Click on add to cart button "+clickOnAddToCart.toString());
        clickOnElement(clickOnAddToCart);
    }

    public String verifyTheMessage() {
        return getTextFromElement(verifyTheMessage);
    }

    public void closeMessageTextButton() {
        Reporter.log("Close message button "+closeButton.toString());
        clickOnElement(closeButton);
    }

    public String verifyShoppingCartMessage() {
        Reporter.log("Verify shopping cart message "+verifyShoppingCartMessage.toString());
        return getTextFromElement(verifyShoppingCartMessage);
    }

    public void mouseHoverOnElementShoppingCart() {
        Reporter.log("Mouse hover on shopping cart"+mouseHoverOnShoppingCart.toString());
        mouseHoverToElement(mouseHoverOnShoppingCart);
    }

    public void clickOnGoToCart() {
        Reporter.log("Click on go to cart "+clickOnAddToCart.toString());
        clickOnElement(clickOnGoToCart);
    }

    public String verifyMessageShoppingCart() {
        Reporter.log("Verify message shoppingcart "+verifyShoppingCartMessage.toString());
        return getTextFromElement(verifyMessageShoppingCart);
    }

    public void clearTextInQuantityField() {
        Reporter.log("Clear text in quantity field "+clearText.toString());
        Actions actions = new Actions(driver);
        clearText.clear();
    }

    public void sendTextToQuantityField() {
        Reporter.log("Send text to quantity "+sendTextToQuantity.toString());
        sendTextToElement(sendTextToQuantity, "2");
    }

    public void clickOnUpdateShoppingCartButton() {
        Reporter.log("Click on update shopping cart "+clickOnUpdateShoppingCart.toString());
        clickOnElement(clickOnUpdateShoppingCart);
    }

    public String verifyTotal() {
        Reporter.log("Verify total"+verifyTotal.toString());
        return getTextFromElement(verifyTotal);
    }

    public void clickOnCheckBoxIAgreeWithTermsAndCondition() {
        Reporter.log("click On CheckBox I agree with terms and condition"+clickOnCheckbox.toString());
        clickOnElement(clickOnCheckbox);
    }

    public void clickOnCheckOutButton() {
        Reporter.log("Click on check box "+clickOnCheckbox.toString());
        clickOnElement(clickOnCheckout);
    }

    public String verifyWelcometText() {
        Reporter.log("Wel come text "+verifyTextWelcome.toString());
        return getTextFromElement(verifyTextWelcome);
    }
    public void clickOnCheckOutAsGuest() {
        Reporter.log("Click on checkout as guest "+clickOnCheckoutAsGuest.toString());
        clickOnElement(clickOnCheckoutAsGuest);
    }
    public void sendTextToFirstNameField(String name) {
        Reporter.log("Enter first name "+sendTextToFirstName.toString());
        sendTextToElement(sendTextToFirstName, name);
    }
    public void sendTextToLastNameField(String lastName) {
        Reporter.log("Enter last name "+sendTextToLastName.toString());
        sendTextToElement(sendTextToLastName, lastName);
    }
    public void sendTextToEmailField(String email) {
        Reporter.log("Enter email "+sendTextToEmail.toString());
        sendTextToElement(sendTextToEmail, email);
    }
    public void sendTextToCompanyField(String company) {
        Reporter.log("Enter company name "+sendTextToCompany.toString());
        sendTextToElement(sendTextToCompany, company);
    }

    public void selectCountryFromDropDownList() {
        Reporter.log("Select country "+country.toString());
        selectByIndexFromDropDown(country,156);
    }
    public void sendTextToCityField(String city) {
        Reporter.log("Enter city name "+sendTextToCity.toString());
        sendTextToElement(sendTextToCity, city);
    }
    public void sendTextToAddressLine1(String address) {
        Reporter.log("Enter address "+sendTextToAddress1.toString());
        sendTextToElement(sendTextToAddress1, address);
    }
    public void sendTextToAddressLine2(String address) {
        Reporter.log("Enter address");
        sendTextToElement(sendTextToAddress2, address);
    }
    public void sendTextToPostcode(String postcode) {
        Reporter.log("Enter post code "+sendTextToPostalCode.toString());
        sendTextToElement(sendTextToPostalCode, postcode);
    }
    public void sendTextToPhoneNumberField(String number) {
        Reporter.log("Enter phone number "+sendTextToPhoneNumber.toString());
        sendTextToElement(sendTextToPhoneNumber, number);
    }
    public void clickOnContinueButton() {
        Reporter.log("Click on continue "+clickOnContinue.toString());
        clickOnElement(clickOnContinue);
    }
    public void clickOnNextDayAirButton() {
        Reporter.log("Click on next day air"+clickOnNextDayAir.toString());
        clickOnElement(clickOnNextDayAir);
    }
    public void clickOnContinueButtonAgain() {
        Reporter.log("Click on continue");
        clickOnElement(clickOnContinueTab);
    }
    public void clickOnCreditCardButton() {
        Reporter.log("Click on credit card"+clickOnCreditCard.toString());
        clickOnElement(clickOnCreditCard);
    }
    public void selectClickOnContinue1() {
        Reporter.log("Click on continue");
        clickOnElement(continueButton);
    }
    @FindBy(id = "CreditCardType")
    WebElement creditCard;
    public void selectMasterCardFromCreditCardDropdown() {
        Reporter.log("Select master card "+creditCard.toString());

        selectByIndexFromDropDown(creditCard,1);
    }
    public void sendTextTOCardHolderName(String name) {
        Reporter.log("Enter card holder name "+cardholdername.toString());
        sendTextToElement(cardholdername, name);
    }
    public void sendTextTOCardNumber(String num) {
        Reporter.log("Enter card number"+cardNumber.toString());
        sendTextToElement(cardNumber, num);
    }
    public void sendTextToCardCode(String code) {
        Reporter.log("Enter card code "+cardCode.toString());
        sendTextToElement(cardCode, code);
    }
    @FindBy(id = "ExpireMonth")
    WebElement expireMonth;

    @FindBy(id = "ExpireYear")
    WebElement expireYear;
    public void selectMonthAndYearForCreditCardExpireData() {
        Reporter.log("Select month and year for credit card expire ");

        selectByVisibleTextFromDropDown(expireMonth,"05");
        selectByVisibleTextFromDropDown(expireYear,"2024");
    }
    public void clickOnContinueButton2() {
        Reporter.log("Click on continue "+continueButton2.toString());
        clickOnElement(continueButton2);
    }
    public String creditCardMessage(){
        Reporter.log("Credit card text "+creditCardMessage.toString());
        return getTextFromElement(creditCardMessage);
    }
    public String nextDayAirMessage(){
        Reporter.log("Next day air text"+nextDayAirMessage.toString());
        return getTextFromElement(nextDayAirMessage);
    }
    public String totalAmountMessage(){
        Reporter.log("Total amount message"+finalAmountMessage.toString());
        return getTextFromElement(finalAmountMessage);

    }
    public String thankYouMessage(){
        Reporter.log("Thank you message"+thankYouMessage.toString());
        return getTextFromElement(thankYouMessage);

    }
    public String yourOrderMessage(){
        Reporter.log("Your order message "+successfulMessage.toString());
        return getTextFromElement(successfulMessage);

    }
    public String finalMessage(){
        Reporter.log(" Final message "+finalMessage.toString());
        return getTextFromElement(finalMessage);

    }
    public void clickOnConformButton() {
        Reporter.log("Click on conform button "+conform.toString());
        clickOnElement(conform);
    }
    public void clickOnContinueButton3() {
        Reporter.log("Click on continue button "+continueButton3.toString());
        clickOnElement(continueButton3);
    }

}
