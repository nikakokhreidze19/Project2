package Tests;


import Data.DataOfRegistration;
import Data.Database.InsertUserInfo;
import Data.DateOfSushiPage;
import Data.RestPageData;
import Steps.*;
import Util.Screenshoter;
import io.qameta.allure.*;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import java.sql.SQLException;

@Listeners(Screenshoter.class)
@Epic("we test swoop.ge ")
@Feature("We open the site and test the functionality of the site, check the prices and register a new user from the database.")
public class TestSwoop extends Config {
    HomePageSteps homePageSteps = new HomePageSteps();
    RestPageSteps restPageSteps = new RestPageSteps();
    RestPageData restPageData = new RestPageData();
    HotelsPageSteps hotelsPageSteps = new HotelsPageSteps();
    CategoriesPageSteps categoriesPageSteps = new CategoriesPageSteps();
    SushiMainPageSteps sushiMainPageSteps = new SushiMainPageSteps();
    OneSushiPageSteps oneSushiPageSteps = new OneSushiPageSteps();
    SortDescPageSteps sortDescPageSteps = new SortDescPageSteps();
    FacebookPageSteps facebookPageSteps = new FacebookPageSteps();
    RegistrationPageSteps registrationPageSteps = new RegistrationPageSteps();

    @Severity(SeverityLevel.NORMAL)
    @Description("Click on 'დასვენება' in menu set min and max price to desired , submit and check if all the returned items meet desired price range")
    @Story(" click rest item input price range and check")
    @Test(description = "click rest item scroll down, input min and max price and check", groups = "regression1")
    public void testPriceRange() {
        homePageSteps.clickRestItem();
        restPageSteps.
                scrollToPrice().
                inputMinPrice(restPageData.minPrice).
                inputMaxPrice(restPageData.maxPrice).
                submit();
        hotelsPageSteps.checkPriceRange();

    }

    @Severity(SeverityLevel.CRITICAL)
    @Description("Click on categories then hover 'კვება' and click 'სუში' , check voucher is not sold out and click favourit item")
    @Story(" click rest categories hover element validate voucher and verify authorization page appear")
    @Test(description = "add element in wishlist and verify authorization", groups = "regression1")
    public void checkVouchersAndVerify() {

        homePageSteps.
                clickCategories();
        categoriesPageSteps.
                hoverToKvebaItem().
                clickSushiItem();
        sushiMainPageSteps.
                chackVauchers().
                clickFirstFavoriteItem();
        registrationPageSteps.
                verifyAuthorizationPage();


    }

    @Severity(SeverityLevel.NORMAL)
    @Description("Click on categories then hover 'კვება' and click 'სუში' , sort price descending and check")
    @Story("sort descending and check that  price of the first element is higher than the second")
    @Test(description = "Sort items be descending price and validate that sort order is correct", groups = "regression2")
    public void sortDescendingAndCheck() {
        homePageSteps.clickCategories();

        categoriesPageSteps.
                hoverToKvebaItem().
                clickSushiItem();

        sushiMainPageSteps.
                sortDescending(DateOfSushiPage.sorting);

        sortDescPageSteps.
                checkPrice();


    }

    @Severity(SeverityLevel.CRITICAL)
    @Description("Click on categories then hover 'კვება' and click 'სუში' , validate that login page appear")
    @Story("click first item , share and validate facebook page")
    @Test(description = "Validate that appear  facebook login", groups = "regression2")
    public void clickOnShareAndSeeFacebookLogin() {
        homePageSteps.
                clickCategories();

        categoriesPageSteps.
                hoverToKvebaItem().
                clickSushiItem();

        sushiMainPageSteps.
                clickFirstElement();

        oneSushiPageSteps.
                clickShare();

        facebookPageSteps.
                validateFacebook();


    }


    @Severity(SeverityLevel.CRITICAL)
    @Description("click registration and input data from database")
    @Story("set values in fields from database and check that info massage is appeared")
    @Test(description = "validate registration parameter", groups = "regression2")
    public void registration() throws SQLException {
        homePageSteps.
                clickLogin();

        InsertUserInfo.
                insertData();


        registrationPageSteps.
                clickRegistration().
                setFirstName().
                setLastName().
                setEmail().
                setMobileNumber().
                setDataOfBirth().
                setPassword().
                setConfirmedPassword().
                scroll().
                submit().
                validateMessage(DataOfRegistration.message);


    }
}
