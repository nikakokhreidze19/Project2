package Page;

import com.codeborne.selenide.ElementsCollection;
import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selectors.byId;
import static com.codeborne.selenide.Selenide.$;

public class SortDescPage {
    public ElementsCollection
            sushiCollection = $(byId("partialid")).$$(".special-offer");

    public SelenideElement
            firstSushiPrice = sushiCollection.first().$(".discounted-prices p"),
            secondSushiPrice = sushiCollection.get(1).$(".discounted-prices p"),
            visualAppear = $("#body[style*='unset']");


}
