package Steps;

import Page.FacebookPage;
import com.codeborne.selenide.Condition;
import com.codeborne.selenide.Selenide;
import io.qameta.allure.Step;

public class FacebookPageSteps {
    FacebookPage facebookPage = new FacebookPage();

    @Step("validate facebook page has appea and close window")
    public FacebookPageSteps validateFacebook() {
        Selenide.switchTo().window(1);
        facebookPage.facebookVisual.should(Condition.appear);
        return this;
    }
}
