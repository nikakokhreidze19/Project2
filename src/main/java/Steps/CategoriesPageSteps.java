package Steps;

import Page.CategoriesPage;
import io.qameta.allure.Step;

public class CategoriesPageSteps {
    CategoriesPage categoriesPage = new CategoriesPage();

    @Step("hover to kveba item")
    public CategoriesPageSteps hoverToKvebaItem() {
        categoriesPage.kvebaButton.hover();
        return this;
    }

    @Step("click sushi item")
    public CategoriesPageSteps clickSushiItem() {
        categoriesPage.sushi.click();
        return this;
    }

}
