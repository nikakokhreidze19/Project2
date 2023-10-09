package Steps;

import Page.HomePage;
import io.qameta.allure.Step;

import static com.codeborne.selenide.Selenide.executeJavaScript;

public class HomePageSteps {
    HomePage homePage = new HomePage();

    @Step("click rest item")
    public HomePageSteps clickRestItem() {
        homePage.restCategories.click();
        return this;
    }

    @Step("click categories button")
    public HomePageSteps clickCategories() {
        executeJavaScript("arguments[0].click()", homePage.categories);
        return this;
    }

    @Step("click login button")
    public HomePageSteps clickLogin() {
        homePage.loginButton.click();
        return this;
    }

}
