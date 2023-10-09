package Steps;

import Page.HotelsPage;
import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;
import io.qameta.allure.Step;
import org.openqa.selenium.By;
import org.testng.asserts.SoftAssert;

public class HotelsPageSteps {
    HotelsPage hotelsPage = new HotelsPage();
    SoftAssert softAssert = new SoftAssert();


    @Step("Let's check if the price is in the 200 to 230 range")
    public HotelsPageSteps checkPriceRange() {
        hotelsPage.visualAppear.should(Condition.appear);
        for (SelenideElement element : hotelsPage.hotels) {
            SelenideElement priceElement = element.find(By.className("outs-and-shorts"))
                    .findAll(By.className("deal-voucher-price"))
                    .first();
            String StrPrice = priceElement.getText().trim().replaceAll("₾", "");
            int price = Integer.parseInt(StrPrice);

            if (price < 200 || price > 230) {
                softAssert.fail("Price is not within the expected range: " + price);
            }
        }
        softAssert.assertAll();
        return this;
    }


}
