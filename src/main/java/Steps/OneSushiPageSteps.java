package Steps;

import Page.OneSushiPage;
import io.qameta.allure.Step;

public class OneSushiPageSteps {
    OneSushiPage oneSushiPage = new OneSushiPage();

    @Step("click share button")
    public OneSushiPageSteps clickShare() {
        oneSushiPage.shareButton.click();
        return this;
    }
}
