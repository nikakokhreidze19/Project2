package Steps;

import Page.SushiMainPage;
import com.codeborne.selenide.SelenideElement;
import io.qameta.allure.Step;
import org.testng.asserts.SoftAssert;


public class SushiMainPageSteps {
    SushiMainPage sushiMainPage = new SushiMainPage();
    SoftAssert softAssert = new SoftAssert();

    private SelenideElement firstFavElement;

    @Step("Let's check that the voucher is not sold and find the first item")
    public SushiMainPageSteps chackVauchers() {
        for (SelenideElement element : sushiMainPage.sushiCollection) {
            SelenideElement voucherElement = element.find(".voucher-diagram div");
            Double voucher = Double.parseDouble(voucherElement.getAttribute("data-width"));
            if (voucher < 100) {
                firstFavElement = element;
                break;
            }
            softAssert.fail("vouchers sold out");

        }
        softAssert.assertAll();
        return this;
    }

    @Step("Click on the first element whose vouchers are not sold")
    public SushiMainPageSteps clickFirstFavoriteItem() {
        SelenideElement favouriteItem = firstFavElement.find(".deal-box-wishlist a");
        favouriteItem.click();
        return this;
    }


    @Step("Sort elements with {0}")
    public SushiMainPageSteps sortDescending(String selectItem) {
        sushiMainPage.sortingDesc.selectOption(selectItem);
        return this;
    }

    @Step("then click first element")
    public SushiMainPageSteps clickFirstElement() {
        sushiMainPage.firstSushiElement.click();
        return this;
    }

}
