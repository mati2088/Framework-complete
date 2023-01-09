package pom;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class AddToCartPage extends BasePage{

    private By itemOneLocator=By.cssSelector("#item_4_img_link > img");
    private By backToHomeLocator=By.name("back-to-products");
    private By addToCar1=By.name("add-to-cart-sauce-labs-backpack");
    private By itemTwoLocator=By.cssSelector("#item_0_img_link > img");

    private By itemThreeLocator=By.cssSelector("#item_1_img_link > img");
    private By itemFourLocator=By.cssSelector("#item_5_img_link > img");
    private By itemFiveLocator=By.cssSelector("#item_2_img_link > img");
    private By itemSixSelector=By.cssSelector("#item_3_img_link > img");



    private By addToCar2=By.name("add-to-cart-sauce-labs-bike-light");
    private By addToCar3=By.name("add-to-cart-sauce-labs-bolt-t-shirt");
    private By addToCar4=By.name("add-to-cart-sauce-labs-fleece-jacket");
    private By addToCar5=By.name("add-to-cart-sauce-labs-onesie");
    private By addToCar6=By.name("add-to-cart-test.allthethings()-t-shirt-(red)");






    public AddToCartPage(WebDriver driver) {
        super(driver);
    }

    public void allProductsToCart() throws Exception {
        this.clickInElement(itemOneLocator);
        this.clickInElement(addToCar1);
        this.clickInElement(backToHomeLocator);
        this.clickInElement(itemTwoLocator);
        this.clickInElement(addToCar2);
        this.clickInElement(backToHomeLocator);
        this.clickInElement(itemThreeLocator);
        this.clickInElement(addToCar3);
        this.clickInElement(backToHomeLocator);
        this.clickInElement(itemFourLocator);
        this.clickInElement(addToCar4);
        this.clickInElement(backToHomeLocator);
        this.clickInElement(itemFiveLocator);
        this.clickInElement(addToCar5);
        this.clickInElement(backToHomeLocator);
        this.clickInElement(itemSixSelector);
        this.clickInElement(addToCar6);
        this.clickInElement(backToHomeLocator);



    }
}
