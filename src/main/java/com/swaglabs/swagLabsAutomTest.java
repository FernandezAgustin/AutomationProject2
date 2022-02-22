package com.swaglabs;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class swagLabsAutomTest {
    public WebDriver driver;

    @BeforeSuite
    public void initializeSuit(){
        System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(1, TimeUnit.SECONDS);
    }

    @AfterSuite
    public void dropDownSuit(){
        driver.close();
        driver.quit();
    }

    @BeforeMethod
    public void initializeMethod(){
        driver.get("https://www.saucedemo.com/");
        driver.manage().window().maximize();
        driver.manage().deleteAllCookies();
    }


    public void dropDownMethod(){

    }

    @Test
    public void simpleTest() {

        //Login con credenciales válidas

        WebElement userName = driver.findElement(By.id("user-name"));
        userName.sendKeys("standard_user");

        WebElement password = driver.findElement(By.id("password"));
        password.sendKeys("secret_sauce");

        WebElement loginButton = driver.findElement(By.id("login-button"));
        loginButton.click();

        //Añadimos al carrito el primer item y hacemos checkout

        WebElement addTocartButton1 = driver.findElement(By.id("add-to-cart-sauce-labs-backpack"));
        addTocartButton1.click();

        WebElement cartButton = driver.findElement(By.className("shopping_cart_link"));
        cartButton.click();

        WebElement checkoutButton = driver.findElement(By.id("checkout"));
        checkoutButton.click();

        //Rellenamos formulario

        WebElement firstNameInput = driver.findElement(By.id("first-name"));
        firstNameInput.sendKeys("Juan");
        WebElement lastNameInput = driver.findElement(By.id("last-name"));
        lastNameInput.sendKeys("Perez");
        WebElement postalCodeInput = driver.findElement(By.id("postal-code"));
        postalCodeInput.sendKeys("B1878");
        WebElement continueButton = driver.findElement(By.id("continue"));
        continueButton.click();

        //Checkout Overview

        WebElement finishButton = driver.findElement(By.id("finish"));
        finishButton.click();

        //Assertion

        WebElement confirmationMessage = driver.findElement(By.className("complete-header"));

        if (confirmationMessage.getText().equals("THANK YOU FOR YOUR ORDER")) {
            WebElement backHomeButton = driver.findElement(By.id("back-to-products"));
            backHomeButton.click();
        } else
            System.out.println("Algo no salio como se esperaba");

        //Procedemos al logout

        WebElement hamburgerButton = driver.findElement(By.id("react-burger-menu-btn"));
        hamburgerButton.click();

        WebElement logoutButton = driver.findElement(By.id("logout_sidebar_link"));
        logoutButton.click();

    }

    @Test
    public void simpleTest1() {

        //Login con credenciales válidas

        WebElement userName = driver.findElement(By.id("user-name"));
        userName.sendKeys("standard_user");

        WebElement password = driver.findElement(By.id("password"));
        password.sendKeys("secret_sauce");

        WebElement loginButton = driver.findElement(By.id("login-button"));
        loginButton.click();

        //Añadimos al carrito el primer item y hacemos checkout

        WebElement addTocartButton1 = driver.findElement(By.id("add-to-cart-sauce-labs-backpack"));
        addTocartButton1.click();
        WebElement addTocartButton2 = driver.findElement(By.id("add-to-cart-sauce-labs-bike-light"));
        addTocartButton2.click();
        WebElement addTocartButton3 = driver.findElement(By.id("add-to-cart-sauce-labs-bolt-t-shirt"));
        addTocartButton3.click();
        WebElement addTocartButton4 = driver.findElement(By.id("add-to-cart-sauce-labs-fleece-jacket"));
        addTocartButton4.click();
        WebElement addTocartButton5 = driver.findElement(By.id("add-to-cart-sauce-labs-onesie"));
        addTocartButton5.click();
        WebElement addTocartButton6 = driver.findElement(By.id("add-to-cart-test.allthethings()-t-shirt-(red)"));
        addTocartButton6.click();

        WebElement cartButton = driver.findElement(By.className("shopping_cart_link"));
        cartButton.click();

        WebElement removeItem = driver.findElement(By.id("remove-sauce-labs-onesie"));
        removeItem.click();
        WebElement removeItem1 = driver.findElement(By.id("remove-test.allthethings()-t-shirt-(red)"));
        removeItem1.click();
        WebElement removeItem2 = driver.findElement(By.id("remove-sauce-labs-fleece-jacket"));
        removeItem2.click();

        WebElement checkoutButton = driver.findElement(By.id("checkout"));
        checkoutButton.click();

        //Rellenamos formulario

        WebElement firstNameInput = driver.findElement(By.id("first-name"));
        firstNameInput.sendKeys("Juan");
        WebElement lastNameInput = driver.findElement(By.id("last-name"));
        lastNameInput.sendKeys("Perez");
        WebElement postalCodeInput = driver.findElement(By.id("postal-code"));
        postalCodeInput.sendKeys("B1878");
        WebElement continueButton = driver.findElement(By.id("continue"));
        continueButton.click();


        //Checkout Overview

        WebElement finishButton = driver.findElement(By.id("finish"));
        finishButton.click();

        //Assertion

        WebElement confirmationMessage = driver.findElement(By.className("complete-header"));

        if (confirmationMessage.getText().equals("THANK YOU FOR YOUR ORDER")) {
            WebElement backHomeButton = driver.findElement(By.id("back-to-products"));
            backHomeButton.click();
        } else
            System.out.println("Algo no salio como se esperaba");

        //Procedemos al logout

        WebElement hamburgerButton = driver.findElement(By.id("react-burger-menu-btn"));
        hamburgerButton.click();

        WebElement logoutButton = driver.findElement(By.id("logout_sidebar_link"));
        logoutButton.click();

    }

    @Test
    public void simpleTest2(){
        //Login con credenciales válidas

        WebElement userName = driver.findElement(By.id("user-name"));
        userName.sendKeys("standard_user");

        WebElement password = driver.findElement(By.id("password"));
        password.sendKeys("secret_sauce");

        WebElement loginButton = driver.findElement(By.id("login-button"));
        loginButton.click();

        //Añadimos al carrito el primer item y hacemos checkout

        WebElement addToCartButton1 = driver.findElement(By.id("add-to-cart-sauce-labs-backpack"));
        addToCartButton1.click();
        WebElement addToCartButton2 = driver.findElement(By.id("add-to-cart-sauce-labs-bike-light"));
        addToCartButton2.click();
        WebElement addToCartButton3 = driver.findElement(By.id("add-to-cart-sauce-labs-bolt-t-shirt"));
        addToCartButton3.click();
        WebElement addToCartButton4 = driver.findElement(By.id("add-to-cart-sauce-labs-fleece-jacket"));
        addToCartButton4.click();
        WebElement addToCartButton5 = driver.findElement(By.id("add-to-cart-sauce-labs-onesie"));
        addToCartButton5.click();
        WebElement addToCartButton6 = driver.findElement(By.id("add-to-cart-test.allthethings()-t-shirt-(red)"));
        addToCartButton6.click();

        WebElement cartButton = driver.findElement(By.id("shopping_cart_container"));
        cartButton.click();

        WebElement checkoutButton = driver.findElement(By.id("checkout"));
        checkoutButton.click();

        //Rellenamos formulario

        WebElement firstNameInput = driver.findElement(By.id("first-name"));
        firstNameInput.sendKeys("Juan");
        WebElement lastNameInput = driver.findElement(By.id("last-name"));
        lastNameInput.sendKeys("Perez");
        WebElement postalCodeInput = driver.findElement(By.id("postal-code"));
        postalCodeInput.sendKeys("B1878");

        WebElement continueButton = driver.findElement(By.id("continue"));
        continueButton.click();

        //Cancelamos.

        WebElement secondaryCancelButton = driver.findElement(By.xpath("//*[@id='cancel']"));
        secondaryCancelButton.click();

        //Removemos 3 items.

        WebElement removeItem = driver.findElement(By.id("remove-sauce-labs-onesie"));
        removeItem.click();
        WebElement removeItem1 = driver.findElement(By.id("remove-test.allthethings()-t-shirt-(red)"));
        removeItem1.click();
        WebElement removeItem2 = driver.findElement(By.id("remove-sauce-labs-fleece-jacket"));
        removeItem2.click();

        WebElement newCartButton = driver.findElement(By.className("shopping_cart_link"));
        newCartButton.click();

        WebElement newCheckoutButton = driver.findElement(By.id("checkout"));
        newCheckoutButton.click();

        WebElement newInputNameField = driver.findElement(By.id("first-name"));
        newInputNameField.sendKeys("Juan");
        WebElement newInputLastNameField = driver.findElement(By.id("last-name"));
        newInputLastNameField.sendKeys("Perez");
        WebElement newZipCodeField = driver.findElement(By.id("postal-code"));
        newZipCodeField.sendKeys("B1878");

        WebElement newContinueButton = driver.findElement(By.id("continue"));
        newContinueButton.click();

        //Checkout Overview

        WebElement finishButton = driver.findElement(By.id("finish"));
        finishButton.click();

        //Assertion

        WebElement confirmationMessage = driver.findElement(By.className("complete-header"));

        if (confirmationMessage.getText().equals("THANK YOU FOR YOUR ORDER")) {
            WebElement backHomeButton = driver.findElement(By.id("back-to-products"));
            backHomeButton.click();
        } else
            System.out.println("Algo no salio como se esperaba");

        //Procedemos al logout

        WebElement hamburgerButton = driver.findElement(By.id("react-burger-menu-btn"));
        hamburgerButton.click();

        WebElement logoutButton = driver.findElement(By.id("logout_sidebar_link"));
        logoutButton.click();

    }

    @Test
    public void simpleTest3(){

        //Login con credenciales válidas

        WebElement userName = driver.findElement(By.id("user-name"));
        userName.sendKeys("standard_user");

        WebElement password = driver.findElement(By.id("password"));
        password.sendKeys("secret_sauce");

        WebElement loginButton = driver.findElement(By.id("login-button"));
        loginButton.click();

        //Filtramos de menor a mayor precio y agregamos un item al carrito.

        Select filterList = new Select(driver.findElement(By.className("product_sort_container")));
        filterList.selectByIndex(2);

        WebElement addToCartButton = driver.findElement(By.id("add-to-cart-sauce-labs-onesie"));
        addToCartButton.click();

        //Filtramos pero de mayor a menor precio y agregamos un item al carrito.

        Select otherFilterListChoice = new Select(driver.findElement(By.className("product_sort_container")));
        otherFilterListChoice.selectByIndex(3);

        WebElement addToCartButton1 = driver.findElement(By.id("add-to-cart-sauce-labs-fleece-jacket"));
        addToCartButton1.click();

        WebElement cartButton = driver.findElement(By.className("shopping_cart_link"));
        cartButton.click();

        WebElement checkoutButton = driver.findElement(By.id("checkout"));
        checkoutButton.click();

        //Relleno formulario

        WebElement firstNameInput = driver.findElement(By.id("first-name"));
        firstNameInput.sendKeys("Juan");
        WebElement lastNameInput = driver.findElement(By.id("last-name"));
        lastNameInput.sendKeys("Perez");
        WebElement postalCodeInput = driver.findElement(By.id("postal-code"));
        postalCodeInput.sendKeys("B1878");

        WebElement continueButton = driver.findElement(By.id("continue"));
        continueButton.click();

        WebElement finishButton = driver.findElement(By.id("finish"));
        finishButton.click();

        //Assertion

        WebElement confirmationMessage = driver.findElement(By.className("complete-header"));

        if (confirmationMessage.getText().equals("THANK YOU FOR YOUR ORDER")) {
            WebElement backHomeButton = driver.findElement(By.id("back-to-products"));
            backHomeButton.click();
        } else
            System.out.println("Algo no salio como se esperaba");

        //Procedemos al logout

        WebElement hamburgerButton = driver.findElement(By.id("react-burger-menu-btn"));
        hamburgerButton.click();

        WebElement logoutButton = driver.findElement(By.id("logout_sidebar_link"));
        logoutButton.click();


    }

}

