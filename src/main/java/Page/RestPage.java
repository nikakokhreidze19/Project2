package Page;

import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;

public class RestPage {
    public SelenideElement

            minPriceInput = $(By.xpath("//*[@id='sidebar']//*[@id='minprice']")),
            maxPriceInput = $(By.xpath("//*[@id='sidebar']//*[@id='maxprice']")),
            submitButon = $(By.xpath("//*[@id='sidebar']//*[@class='submit-button']"));


}
