package Page;
import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;
import static com.codeborne.selenide.Selenide.$;

public class CategoriesPage {
    public SelenideElement
            kvebaButton = $(By.xpath("//a[@href='/category/15/restornebi-da-barebi']")),
            sushi = $(By.xpath("//a[@href='/category/235/restornebi-da-barebi/sushi']"));


}
