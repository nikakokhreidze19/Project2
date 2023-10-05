package Steps;

import Page.SortDescPage;
import com.codeborne.selenide.Condition;
import io.qameta.allure.Step;
import org.testng.asserts.SoftAssert;

public class SortDescPageSteps {
    SortDescPage sortDescPage = new SortDescPage();
    SoftAssert softAssert = new SoftAssert();

    @Step("Check that the price of the first item is higher than the price of the second item")
    public SortDescPageSteps checkPrice() {
        sortDescPage.visualAppear.should(Condition.appear);
        int firstItemPrice = Integer.parseInt(sortDescPage.firstSushiPrice.getText().trim().replaceAll("₾", ""));
        int secondItemPrice = Integer.parseInt(sortDescPage.secondSushiPrice.getText().trim().replaceAll("₾", ""));
        softAssert.assertTrue(firstItemPrice > secondItemPrice);
        softAssert.assertAll();
        return this;
    }
}
