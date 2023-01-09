package step_definitions;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;

public class SaudemoTest extends BaseTest{

    public SaudemoTest() throws Exception {
    }
    @Given("^user on  login page$")
    public void userOnLoginPage() throws Throwable {
        Assert.assertTrue(loginPage.loginPageIsDisplayed());
    }

    @When("^user enters and username and password$")
    public void userEntersAndUsernameAndPassword() throws Throwable {
        loginPage.loginSession();


    }

    @When("^clicks on login button$")
    public void clicksOnLoginButton() throws Throwable {
        loginPage.clickButton();
    }

    @When("^user is navigated to the home page$")
    public void userIsNavigatedToTheHomePage() throws Throwable {
        Assert.assertTrue(homePage.homePageIsPresent());
    }


    @When("^user on home page$")
    public void userOnHomePage() throws Throwable {
        Assert.assertTrue(homePage.homePageIsPresent());
    }

    @Given("^user adds a product to cart$")
    public void userAddsAProductToCart() throws Throwable {
        homePage.agregarAlCarrito();
    }



    @When("^user goes to shopping cart$")
    public void userGoesToShoppingCart() throws Throwable {
        cartPage.goToCart();

    }



    @When("^user returns to home page$")
    public void userReturnsToHomePage() throws Throwable {
        cartPage.goToShoping();
    }

    @When("^user selects products from A to Z$")
    public void userSelectsProductsFromAToZ() throws Throwable {
        homePage.selecAZ();
    }



    @When("^user returns to homeCARD$")
    public void userReturnsToCARD() throws Throwable {
        cartPage.goToCart();

        Assert.assertTrue(cartPage.titleIsPresent());

    }

    @When("^user returns to home$")
    public void userReturnsToHome() throws Throwable {
      cartPage.goToShoping();
    }

    @When("^user selects products from low to high$")
    public void userSelectsProductsFromLowToHigh() throws Throwable {
        homePage.selecLowToHigh();
    }

    @When("^user selects products from high to low$")
    public void userSelectsProductsFromHighToLow() throws Throwable {
        homePage.selecHighToLow();
    }

    @When("^user selects products from AZ$")
    public void userSelectsProductsFromAZ() throws Throwable {
        homePage.selecAZ();

    }



    @When("^user returns to cartPage$")
    public void userReturnsToCartPage() throws Throwable {
       cartPage.goToCart();
    }

    @When("^user click in Checkout button$")
    public void userClickInCheckoutButton() throws Throwable {
            checkoutPage.clickCheckout();
        }

    @When("^user enters and firstName and lastName and postalCode$")
    public void userEntersAndFirstNameAndLastNameAndPostalCode() throws Throwable {
        checkoutPage.sendFirstName();
        checkoutPage.sendLastName();
        checkoutPage.sendPostalCode();
    }

    @When("^user  click in continue button$")
    public void userClickInContinueButton() throws Throwable {
       checkoutPage.clickContinue();
    }

    @When("^text Payment Information is  in the page$")
    public void textPaymentInformationIsInThePage() throws Throwable {
       Assert.assertTrue(checkoutPage.paymentTextIsPresent());
    }

    @When("^user click in finish$")
    public void userClickInFinish() throws Throwable {
       checkoutPage.clickFinish();
    }

    @When("^text THANK YOU FOR YOUR ORDER is in the page$")
    public void textTHANKYOUFORYOURORDERIsInThePage() throws Throwable {
       Assert.assertTrue(checkoutPage.completeFinishIsPresent());
    }

    @When("^user back to Home page$")
    public void userBackToHomePage() throws Throwable {
        checkoutPage.clickBackToHome();


    }
    @When("^user logout of page$")
    public void userLogout() throws Throwable {
        homePage.clickBurgerMenu();

    }

    @When("^user Add All Items To cart$")
    public void addAllProducts() throws Throwable {
        addToCartPage.allProductsToCart();

    }


    @When("^user Remove All Items To cart$")
    public void userRemoveAllItemsToCart() throws Throwable {
        removeAllToCart.removeAllProducts();
    }


}
