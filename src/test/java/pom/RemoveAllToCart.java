package pom;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class RemoveAllToCart extends BasePage{
    private By removeOneLocator=By.name("remove-sauce-labs-backpack");
    private By removeTwoLocator=By.name( "remove-sauce-labs-bike-light");
    private By removeThreeLocator=By.name( "remove-sauce-labs-bolt-t-shirt");
    private By removeFourLocator=By.name("remove-sauce-labs-fleece-jacket" );
    private By removeFiveLocator=By.name( "remove-sauce-labs-onesie");
    private By removeSixLocator=By.name( "remove-test.allthethings()-t-shirt-(red)");

    public RemoveAllToCart(WebDriver driver) {
        super(driver);
    }

    public void removeAllProducts() throws Exception {
        this.clickInElement(removeOneLocator);
        this.await();
        this.clickInElement(removeTwoLocator);
        this.await();
        this.clickInElement(removeThreeLocator);
        this.await();
        this.clickInElement(removeFourLocator);
        this.await();
        this.clickInElement(removeFiveLocator);
        this.await();
        this.clickInElement(removeSixLocator);

    }
}
