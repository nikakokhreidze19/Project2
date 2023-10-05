package Page;
import com.codeborne.selenide.SelenideElement;
import static com.codeborne.selenide.Selectors.byId;
import static com.codeborne.selenide.Selenide.$;

public class FacebookPage {
    public SelenideElement
            facebookVisual = $(byId("facebook"));

}
