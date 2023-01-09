package pom;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class HomePage extends BasePage{
    private By logoVerificatorHome=By.className("app_logo");
    private By addToCart=By.id("add-to-cart-sauce-labs-backpack");
    private By addToCar2=By.id("add-to-cart-sauce-labs-bike-light");
    private By addToCar3=By.id("add-to-cart-sauce-labs-bolt-t-shirt");
    private By addToCar4=By.id("add-to-cart-sauce-labs-fleece-jacket");
    private By addToCar5=By.id("add-to-cart-sauce-labs-onesie");
    private By addToCar6=By.id("add-to-cart-sauce-labs-backpack");



    private By menuAmburguesaLocator=By.id("react-burger-menu-btn");
    private By logoutLocator=By.cssSelector("#logout_sidebar_link");




    private By selectToProducts=By.className("product_sort_container");












    public HomePage(WebDriver driver) {
        super(driver);
    }



    public boolean homePageIsPresent() throws Exception {

        return this.isDisplayed(logoVerificatorHome);

    }

    public void clickBurgerMenu() throws Exception {
        this.clickInElement(menuAmburguesaLocator);
        this.await();
        this.clickInElement(logoutLocator);
    }


    public void agregarAlCarrito() throws Exception {
        this.clickInElement(addToCart);
        this.clickInElement(addToCar2);
        this.clickInElement(addToCar3);
        this.clickInElement(addToCar4);
        this.clickInElement(addToCar5);


    }






    public void selecAZ() throws Exception {

        WebElement productsAZ = this.obtenerElemento(selectToProducts);
        this.clickInElement(selectToProducts);

        Select dropdown = new Select(productsAZ);
        dropdown.selectByVisibleText("Name (Z to A)");
    }
    public void selecLowToHigh() throws Exception {

        WebElement productsAZ = this.obtenerElemento(selectToProducts);
        this.clickInElement(selectToProducts);

        Select dropdown = new Select(productsAZ);
        dropdown.selectByVisibleText("Price (low to high)");
    }
    public void selecHighToLow() throws Exception {

        WebElement productsAZ = this.obtenerElemento(selectToProducts);
        this.clickInElement(selectToProducts);

        Select dropdown = new Select(productsAZ);
        dropdown.selectByVisibleText("Price (high to low)");
    }








}
