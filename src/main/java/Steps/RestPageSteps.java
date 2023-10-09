package Steps;

import Page.RestPage;
import io.qameta.allure.Step;

import static com.codeborne.selenide.Selenide.executeJavaScript;

public class RestPageSteps {
    RestPage restPage = new RestPage();

    @Step("scroll down 450 px")
    public RestPageSteps scrollToPrice() {
        executeJavaScript("window.scrollBy(0, 450);");
        return this;
    }

    @Step("Enter the min price in the field")
    public RestPageSteps inputMinPrice(String minPrice) {
        restPage.minPriceInput.setValue(minPrice);
        return this;
    }

    @Step("Enter the maximum price in the field ")
    public RestPageSteps inputMaxPrice(String maxPrice) {
        restPage.maxPriceInput.setValue(maxPrice);
        return this;
    }

    @Step("click submit button")
    public RestPageSteps submit() {
        executeJavaScript("arguments[0].click()", restPage.submitButon);
        return this;
    }

}
