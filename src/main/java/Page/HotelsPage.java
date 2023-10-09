package Page;
import com.codeborne.selenide.ElementsCollection;
import com.codeborne.selenide.SelenideElement;
import static com.codeborne.selenide.Selenide.$;

public class HotelsPage {
    public ElementsCollection
            hotels = $(".container.deal-container.category-offers").findAll(".special-offer");

    public SelenideElement
            visualAppear = $("#body[style*='unset']");
}
