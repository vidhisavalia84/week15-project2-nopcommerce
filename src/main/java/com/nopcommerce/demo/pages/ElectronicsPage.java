package com.nopcommerce.demo.pages;

import com.nopcommerce.demo.utility.Utility;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.testng.Reporter;

public class ElectronicsPage extends Utility {
        @CacheLookup
        @FindBy(xpath = "//body/div[6]/div[2]/ul[1]/li[2]/a[1]")
        WebElement electonicTab ;
    //By electonicTab = By.xpath("//body/div[6]/div[2]/ul[1]/li[2]/a[1]");

    @CacheLookup
    @FindBy(xpath = "//body/div[6]/div[2]/ul[1]/li[2]/ul[1]/li[2]/a[1]")
    WebElement cellphonee ;
    //By cellphonee = By.xpath("//body/div[6]/div[2]/ul[1]/li[2]/ul[1]/li[2]/a[1]");

    @CacheLookup
    @FindBy(xpath = "//a[contains(text(),'List')]")
    WebElement listTab ;
    //By listTab = (By.xpath("//a[contains(text(),'List')]"));

    @CacheLookup
    @FindBy(xpath = "//body/div[6]/div[3]/div[1]/div[3]/div[1]/div[2]/div[2]/div[2]/div[1]/div[1]/div[3]/div[1]/div[2]/h2[1]/a[1]")
    WebElement nokiaLumia1020 ;
    //By nokiaLumia1020 = By.xpath("//body/div[6]/div[3]/div[1]/div[3]/div[1]/div[2]/div[2]/div[2]/div[1]/div[1]/div[3]/div[1]/div[2]/h2[1]/a[1]");

    @CacheLookup
    @FindBy(xpath = "//span[@id='price-value-20']")
    WebElement verifyPrice$349 ;
   // By verifyPrice$349 = By.xpath("//span[@id='price-value-20']");

    @CacheLookup
    @FindBy(css = "#product_enteredQuantity_20")
    WebElement quantity  ;
   // By quantity = By.cssSelector("#product_enteredQuantity_20");

    @CacheLookup
    @FindBy(xpath = "//button[@id='add-to-cart-button-20']")
    WebElement  addToCartButton;
   // By addToCartButton = By.xpath("//button[@id='add-to-cart-button-20']");

    @CacheLookup
    @FindBy(xpath = "//p[@class='content']")
    WebElement verifyMessage  ;
   // By verifyMessage = By.xpath("//p[@class='content']");

    @CacheLookup
    @FindBy(xpath = "//span[@class='close']")
    WebElement  crossButton;
   // By crossButton = By.xpath("//span[@class='close']");

    @CacheLookup
    @FindBy(xpath = "//a[@href='/cart'and@class='ico-cart']")
    WebElement shoppingCart ;
   // By shoppingCart = By.xpath("//a[@href='/cart'and@class='ico-cart']");

    @CacheLookup
    @FindBy(xpath = "//button[contains(text(),'Go to cart')]")
    WebElement gotoCartButton ;
    //By gotoCartButton = By.xpath("//button[contains(text(),'Go to cart')]");

    @CacheLookup
    @FindBy(xpath = "//h1[contains(text(),'Shopping cart')]")
    WebElement messageShoppinCart ;
   // By messageShoppinCart = By.xpath("//h1[contains(text(),'Shopping cart')]");

    @CacheLookup
    @FindBy(xpath = "//span[contains(text(),'(2)')]")
    WebElement  messageText2;
   // By messageText2 = By.xpath("//span[contains(text(),'(2)')]");

    @CacheLookup
    @FindBy(xpath = "//table[@class='cart-total']/tbody/tr[4]/td[2]")
    WebElement total$698  ;
    //By total$698 = By.xpath("//table[@class='cart-total']/tbody/tr[4]/td[2]");

    @CacheLookup
    @FindBy(id = "termsofservice")
    WebElement termsOfServiceButton ;
  //  By termsOfServiceButton = By.id("termsofservice");

    @CacheLookup
    @FindBy(xpath = "//button[@id='checkout']")
    WebElement checkOut ;
    //By checkOut = By.xpath("//button[@id='checkout']");

    @CacheLookup
    @FindBy(xpath = "//div[@class='page-title']/h1")
    WebElement pleaseSignIn ;
    //By pleaseSignIn = By.xpath("//div[@class='page-title']/h1");

    @CacheLookup
    @FindBy(xpath = "//a[contains(text(),'Register')]")
    WebElement register ;
    //By register = By.xpath("//a[contains(text(),'Register')]");

    @CacheLookup
    @FindBy(xpath = "//h1[contains(text(),'Register')]")
    WebElement registerText ;
   // By registerText = By.xpath("//h1[contains(text(),'Register')]");

    @CacheLookup
    @FindBy(id = "gender-female")
    WebElement genderButton ;
    //By genderButton = By.id("gender-female");

    @CacheLookup
    @FindBy(id = "FirstName")
    WebElement firstName ;
   // By firstName = By.id("FirstName");

    @CacheLookup
    @FindBy(id = "LastName")
    WebElement  lastName;
    //By lastName = By.id("LastName");

    @CacheLookup
    @FindBy(xpath = "//select[@name='DateOfBirthDay']")
    WebElement birthDate ;
    //By birthDate = By.xpath("//select[@name='DateOfBirthDay']");

    @CacheLookup
    @FindBy(xpath = "//select[@name='DateOfBirthMonth']")
    WebElement month  ;
    //By month = By.xpath("//select[@name='DateOfBirthMonth']");

    @CacheLookup
    @FindBy(xpath = "//select[@name='DateOfBirthYear']")
    WebElement  year;
    //By year = By.xpath("//select[@name='DateOfBirthYear']");

    @CacheLookup
    @FindBy(xpath = "//input[@id='Email']")
    WebElement email ;
    //By email = By.xpath("//input[@id='Email']");

    @CacheLookup
    @FindBy(xpath = "//input[@id='Company']")
    WebElement  company;
   // By company = By.xpath("//input[@id='Company']");

    @CacheLookup
    @FindBy(xpath = "//input[@id='Password']")
    WebElement password ;
    //By password = By.xpath("//input[@id='Password']");

    @CacheLookup
    @FindBy(xpath = "//input[@id='ConfirmPassword']")
    WebElement  conformPassword;
    //By conformPassword = By.xpath("//input[@id='ConfirmPassword']");

    @CacheLookup
    @FindBy(xpath = "//button[@id='register-button']")
    WebElement registerButton ;
    //By registerButton = By.xpath("//button[@id='register-button']");

    @CacheLookup
    @FindBy(xpath = "//div[contains(text(),'Your registration completed')]")
    WebElement registrationMessage ;
   // By registrationMessage = By.xpath("//div[contains(text(),'Your registration completed')]");

    @CacheLookup
    @FindBy(xpath = "//a[contains(text(),'Continue')]")
    WebElement continue1 ;
    //By continue1 = By.xpath("//a[contains(text(),'Continue')]");

    @CacheLookup
    @FindBy(xpath = "//h1[contains(text(),'Shopping cart')]")
    WebElement  shoppingCart1;
    //By shoppingCart1 = By.xpath("//h1[contains(text(),'Shopping cart')]");

    @CacheLookup
    @FindBy(xpath = "//input[@id='termsofservice'and@type='checkbox']")
    WebElement termasOfService1  ;
    //By termasOfService = By.id("termsofservice");

    @CacheLookup
    @FindBy(id = "checkout")
    WebElement checkout1 ;
    //By checkout1 = By.id("checkout");

    @CacheLookup
    @FindBy(id = "BillingNewAddress_CountryId")
    WebElement  selectCountry;
    //By selectCountry = By.id("BillingNewAddress_CountryId");

    @CacheLookup
    @FindBy(id = "BillingNewAddress_City")
    WebElement city ;
    //By city = By.id("BillingNewAddress_City");

    @CacheLookup
    @FindBy(id = "BillingNewAddress_Address1")
    WebElement address1 ;
   // By address1 = By.id("BillingNewAddress_Address1");

    @CacheLookup
    @FindBy(id = "BillingNewAddress_Address2")
    WebElement  address2;
   // By address2 = By.id("BillingNewAddress_Address2");

    @CacheLookup
    @FindBy(id = "BillingNewAddress_ZipPostalCode")
    WebElement  zipcode;
   // By zipcode = By.id("BillingNewAddress_ZipPostalCode");

    @CacheLookup
    @FindBy(id = "BillingNewAddress_PhoneNumber")
    WebElement phoneNumber ;
   // By phoneNumber = By.id("BillingNewAddress_PhoneNumber");

    @CacheLookup
    @FindBy(id = "BillingNewAddress_FaxNumber")
    WebElement faxNumber;
   // By faxNumber = By.id("BillingNewAddress_FaxNumber");

    @CacheLookup
    @FindBy(name = "save")
    WebElement continue2 ;
    //By continue2 = By.name("save");

    @CacheLookup
    @FindBy(id = "shippingoption_2")
    WebElement dayAir ;
    //By dayAir = By.id("shippingoption_2");

    @CacheLookup
    @FindBy(xpath = "//button[@class='button-1 shipping-method-next-step-button']")
    WebElement  continue3;
    //By continue3 = By.xpath("//button[@class='button-1 shipping-method-next-step-button']");

    @CacheLookup
    @FindBy(id = "paymentmethod_1")
    WebElement creitCardBtn ;
   // By creitCardBtn = By.id("paymentmethod_1");

    @CacheLookup
    @FindBy(xpath = "//button[@class='button-1 payment-method-next-step-button']")
    WebElement continue4 ;
   // By continue4 = By.xpath("//button[@class='button-1 payment-method-next-step-button']");

    @CacheLookup
    @FindBy(id = "CreditCardType")
    WebElement visa ;
  //  By visa = By.id("CreditCardType");

    @CacheLookup
    @FindBy(id = "CardholderName")
    WebElement cardHolderName ;
    //By cardHolderName = By.id("CardholderName");

    @CacheLookup
    @FindBy(id = "CardNumber")
    WebElement cardNumber  ;
   // By cardNumber = By.id("CardNumber");

    @CacheLookup
    @FindBy(id = "ExpireMonth")
    WebElement expireMonth ;
    //By expireMonth = By.id("ExpireMonth");

    @CacheLookup
    @FindBy(id = "ExpireYear")
    WebElement expireYear ;
   // By expireYear = By.id("ExpireYear");

    @CacheLookup
    @FindBy(id = "CardCode")
    WebElement cardCode ;
    //By cardCode = By.id("CardCode");

    @CacheLookup
    @FindBy(xpath = "//button[@class='button-1 payment-info-next-step-button']")
    WebElement continue5 ;
    //By continue5 = By.xpath("//button[@class='button-1 payment-info-next-step-button']");

    @CacheLookup
    @FindBy(xpath = "//li[@class='payment-method']/span[2]")
    WebElement messageCreditCard ;
    //By messageCreditCard = By.xpath("//li[@class='payment-method']/span[2]");

    @CacheLookup
    @FindBy(xpath = "//li[@class='shipping-method']/span[2]")
    WebElement message2ndDayAir ;
  //  By message2ndDayAir = By.xpath("//li[@class='shipping-method']/span[2]");

    @CacheLookup
    @FindBy(xpath = "//tr[@class='order-total']/td[2]/span/strong")
    WebElement message698 ;
   // By message698 = By.xpath("//tr[@class='order-total']/td[2]/span/strong");

    @CacheLookup
    @FindBy(xpath = "//button[@class='button-1 confirm-order-next-step-button']")
    WebElement conform;

    @CacheLookup
    @FindBy(xpath = "//h1[contains(text(),'Thank you')]")
    WebElement thankyou ;

    @CacheLookup
    @FindBy(xpath = "//strong[contains(text(),'Your order has been successfully processed!')]")
    WebElement successfulMessage ;

    @CacheLookup
    @FindBy(xpath = "//button[@class='button-1 order-completed-continue-button']")
    WebElement continue6 ;

    @CacheLookup
    @FindBy(xpath = "//h2[contains(text(),'Welcome to our store')]")
    WebElement  lastMessage  ;

    @CacheLookup
    @FindBy(xpath = "//a[@class='ico-logout']")
    WebElement logout;





    public void mousehoverOnElectronicsTab() {
        Reporter.log("Mouse hover on electrinics "+electonicTab.toString());
        mouseHoverToElement(electonicTab);
    }
    public void mousehoverOnCellphoneAndClickOnCellphone() {
        Reporter.log("Mouse hover on cells phones and click "+cellphonee.toString());
        mouseHoverToElementAndClick(cellphonee);
    }
    public void clickOnListViewTab() {
        Reporter.log("click on vista"+listTab.toString());
        clickOnElement(listTab);
    }
    public void clickOnNokiaLumia1020Cellphone() {
        Reporter.log("click on nokia lumia 1020"+nokiaLumia1020.toString());
        try {
            clickOnElement(nokiaLumia1020);
           // driver.findElement(By.xpath("//body/div[6]/div[3]/div[1]/div[3]/div[1]/div[2]/div[2]/div[2]/div[1]/div[1]/div[3]/div[1]/div[2]/h2[1]/a[1]")).click();
        } catch (org.openqa.selenium.StaleElementReferenceException e) {
            clickOnElement(nokiaLumia1020);
        }
    }
    public String getNokiaLumia1020Message() {
        Reporter.log("Get nokia lumia 1020 text");
        return getTextFromElement(By.xpath("//h1[contains(text(),'Nokia Lumia 1020')]"));
    }
    public String verifyPrice$349() {
        Reporter.log("Verify price $349 "+verifyPrice$349.toString());
        return getTextFromElement(verifyPrice$349);
    }
    public void clearTextOfElement() {

        Actions actions = new Actions(driver);
        quantity.clear();
    }
    public void addQuantityOf2() {
        Reporter.log("Add quantity 2"+quantity.toString());
        sendTextToElement(quantity, "2");
    }
    public void clickOnAddToCartButton() {
        Reporter.log("Click on add to cart button "+addToCartButton.toString());
        clickOnElement(addToCartButton);
    }
    public String verifyMessage() {

        return getTextFromElement(verifyMessage);
    }
    public void clickOnCrossButton() {
        Reporter.log("Close the mesage"+crossButton.toString());
        clickOnElement(crossButton);
    }
    public void mouseHoverOnShoppingCart() {
        Reporter.log("Mouse hover on shopping cart "+shoppingCart.toString());
        mouseHoverToElement(shoppingCart);
    }
    public void clickOnGoToCartButton() {
        Reporter.log("click on go to cart"+gotoCartButton.toString());
        clickOnElement(gotoCartButton);
    }
    public String verifyMessageShoppinCart() {
        Reporter.log("Verify text shopping cart "+messageShoppinCart.toString());
        return getTextFromElement(messageShoppinCart);
    }
    public String verifyMessageText2() {
        Reporter.log("Verify quantity 2"+messageText2.toString());
        return getTextFromElement(messageText2);
    }
    public String verifyTotal$698() {
        Reporter.log("Verify total $698"+total$698.toString());
        return getTextFromElement(total$698);
    }
    public void mouseHoverOnTermsOfServiceButtonAndClick() {
        Reporter.log("Click on terms of service "+termsOfServiceButton.toString());
        mouseHoverToElementAndClick(termsOfServiceButton);
    }
    public void clickOnCheckOutButton() {
        Reporter.log("Click on check out button "+checkOut.toString());
        clickOnElement(checkOut);
    }
    public String VerifyPleaseSignIn() {
        Reporter.log("Verify sign in text "+pleaseSignIn.toString());
        return getTextFromElement(pleaseSignIn);
    }
    public void clickOnRegister() {
        Reporter.log("Click on register "+register.toString());
        clickOnElement(register);
    }
    public String verifyRegisterText() {
        Reporter.log("Verify register text "+registerText.toString());
        return getTextFromElement(registerText);
    }
    public void clickOnGenderButton() {
        Reporter.log("Select gender"+genderButton.toString());
        clickOnElement(genderButton);
    }
    public void enterFirstName(String name) {
        Reporter.log("Enter first name "+firstName.toString());
        sendTextToElement(firstName, name);
    }
    public void enterLasttName(String name) {
        Reporter.log("Enter last name "+lastName.toString());
        sendTextToElement(lastName, name);
    }
    public void enterBirthDate() {
        Reporter.log("Enter birth date "+birthDate.toString());
        selectByValueFromDropDown(birthDate,"10");

    }
    public void enterBirthMonth() {
        Reporter.log("Enter birth month "+month.toString());
        selectByValueFromDropDown(month,"2");
    }
    public void enterBirthYear() {
        Reporter.log("Enter birth year "+year.toString());
        selectByValueFromDropDown(year,"1956");

    }
    public void enterEmail(String emailaddress) {
        Reporter.log("Enter email "+email.toString());
        sendTextToElement(email, emailaddress);
    }
    public void enterCompanyName(String companyName) {
        Reporter.log("Enter company name "+companyName.toString());
        sendTextToElement(company, companyName);
    }
    public void enterPassword(String passwordText) {
        Reporter.log("Enter password "+password.toString());
        sendTextToElement(password, passwordText);
    }
    public void enterConformPassword(String password) {
        Reporter.log("Conform password"+conformPassword.toString());
        sendTextToElement(conformPassword, password);
    }
    public void clickOnRegisterButton() {
        Reporter.log("Click on register button "+registerButton.toString());
        clickOnElement(registerButton);
    }
    public String verifyRegistrationMessage() {
        Reporter.log("Verify registration message "+registrationMessage.toString());
        return getTextFromElement(registrationMessage);
    }
    public void clickContinue1() {
        Reporter.log("click on continue "+continue1.toString());
        clickOnElement(continue1);
    }
    public String verifyShoppingCartText1() {
        Reporter.log("Verify message "+shoppingCart1.toString());
        return getTextFromElement(shoppingCart1);
    }
    public void clickOnTermsofService1() {
        Reporter.log("Click on terms of services "+termasOfService1.toString());
        //clickOnElement(termasOfService);
        clickOnElement(termasOfService1);
    }
        public void clickOnCheckOut1(){
            Reporter.log("Click on chechout "+checkout1.toString());
            clickOnElement(checkout1);
        }

    public void selectCountry() {
        Reporter.log("Select country"+selectCountry.toString());
        selectByValueFromDropDown(selectCountry,"12");

    }
    public void enterCity(String name) {
        Reporter.log("enter city "+city.toString());
        sendTextToElement(city, name);
    }
    public void enterAddress1(String add1) {
        Reporter.log("Enter address "+address1.toString());
        sendTextToElement(address1, add1);
    }
    public void enterAddress2(String add2) {
        Reporter.log("Enter address "+address2.toString());
        sendTextToElement(address2, add2);
    }

    public void enterZipCode(String zip) {
        Reporter.log("Enter zipcode "+zipcode.toString());
        sendTextToElement(zipcode, zip);
    }

    public void enterPhoneNumber(String num) {
        Reporter.log("Enter phone number "+phoneNumber.toString());
        sendTextToElement(phoneNumber, num);
    }

    public void enterFaxNumber(String num) {
        Reporter.log("Enter fax number "+faxNumber.toString());
        sendTextToElement(faxNumber, num);
    }

    public void clickOnContinue2() {
        Reporter.log("click on continue "+continue2.toString());
        clickOnElement(continue2);
    }
    public void clickOn2ndDayAirButton() {
        Reporter.log("click on 2nd day air"+dayAir.toString());
        clickOnElement(dayAir);
    }

    public void clickOnContinue3() {
        Reporter.log("Click on continue "+continue3.toString());
        clickOnElement(continue3);
    }

    public void selectRadioButton() {
        Reporter.log("Select credit card radio button "+creitCardBtn.toString());
        clickOnElement(creitCardBtn);
    }
    public void clickOnContinue4() {
        Reporter.log("Click on continue"+continue4.toString());
        clickOnElement(continue4);
    }
    public void selectVisaFromCreditCardDropDown() {
        Reporter.log("Select visa"+visa.toString());
        selectByValueFromDropDown(visa,"visa");
    }
    public void enterCardHolderName(String name) {
        Reporter.log("Enter card holder name "+cardHolderName.toString());
        sendTextToElement(cardHolderName, name);
    }
    public void enterCardNumber(String name) {
        Reporter.log("Enter card number "+cardNumber.toString());
        sendTextToElement(cardNumber, name);
    }
    public void selectExpireMonth(String name) {
        Reporter.log("Select expire month"+expireMonth.toString());
        selectByValueFromDropDown(expireMonth, name);
    }
    public void selectExpireYear(String name) {
        Reporter.log("Select expire year"+expireYear.toString());
        selectByValueFromDropDown(expireYear, name);
    }
    public void enterCardCode(String num) {
        Reporter.log("Enter card code "+cardCode.toString());
        sendTextToElement(cardCode,num);
    }
    public void clickOnContinue5() {
        Reporter.log("click on continue "+continue5.toString());
        clickOnElement(continue5);
    }
    public String verifymessageCreditCard() {
        Reporter.log("verify text credit card"+messageCreditCard.toString());
        return getTextFromElement(messageCreditCard);
    }
    public String verifymessage2ndDayAir() {
        Reporter.log("Verify text 2nd day air"+message2ndDayAir.toString());
        return getTextFromElement(message2ndDayAir);
    }
    public String verifymessage698() {
        Reporter.log("verify text 698"+message698.toString());
        return getTextFromElement(message698);
    }
    public void conformTransaction() {
        Reporter.log("click on conform"+conform.toString());
        clickOnElement(conform);
    }

    public String verifyMessageThankYou(){
        Reporter.log("Verify thank you text "+thankyou.toString());
        return getTextFromElement(thankyou);
    }

    public String verifyMessageSuccessful(){
        Reporter.log("Verify message "+successfulMessage.toString());
        return getTextFromElement(successfulMessage);
    }
    public void clickOnContinue6(){
        Reporter.log("click on continue "+continue6.toString());
        clickOnElement(continue6);
    }
    public String verifyMessageWelcomeToOurStore(){
        Reporter.log("Verify message "+lastMessage.toString());
        return getTextFromElement(lastMessage);
    }





}
