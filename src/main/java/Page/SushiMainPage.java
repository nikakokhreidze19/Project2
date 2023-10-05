package Page;

import com.codeborne.selenide.ElementsCollection;
import com.codeborne.selenide.SelenideElement;
import static com.codeborne.selenide.Selectors.byId;
import static com.codeborne.selenide.Selenide.$;

public class SushiMainPage {

    public ElementsCollection
            sushiCollection = $(byId("partialid")).$$(".special-offer");
    public SelenideElement
            sortingDesc =$(byId("sort")),
            firstSushiElement = sushiCollection.first();

}
