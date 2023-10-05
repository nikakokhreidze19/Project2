package Page;
import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;
import static com.codeborne.selenide.Selectors.byXpath;
import static com.codeborne.selenide.Selenide.$;

public class HomePage {
    public SelenideElement
            restCategories = $(byXpath("//li[@class='MoreCategories']//a[@href='/category/24/dasveneba']")),
            categories = $(".categoriesTitle"),
            loginButton = $(By.xpath("//p[contains(text(),'შესვლა')]"));


}
