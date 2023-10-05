package Steps;

import Data.Database.SelectUserInfo;
import Page.RegistrationPage;
import com.codeborne.selenide.Condition;
import io.qameta.allure.Step;
import org.testng.asserts.SoftAssert;

import java.sql.SQLException;

import static com.codeborne.selenide.Selenide.executeJavaScript;

public class RegistrationPageSteps {
    RegistrationPage registrationPage = new RegistrationPage();
    SoftAssert softAssert = new SoftAssert();


    @Step(" verify that Login Window has appeared")
    public RegistrationPageSteps verifyAuthorizationPage() {
        registrationPage.authorizationForm.should(Condition.appear);
        return this;
    }

    @Step("click registration button")
    public RegistrationPageSteps clickRegistration() {
        registrationPage.registrationForm.click();
        return this;
    }


    @Step("set firstName from database")
    public RegistrationPageSteps setFirstName() throws SQLException {
        registrationPage.firstNameInput.setValue(SelectUserInfo.getInfo().get(0)[0].toString());
        return this;
    }

    @Step("set lastName from database")
    public RegistrationPageSteps setLastName() throws SQLException {
        registrationPage.lastNameInput.setValue(SelectUserInfo.getInfo().get(0)[1].toString());
        return this;
    }

    @Step("set email from database")
    public RegistrationPageSteps setEmail() throws SQLException {
        registrationPage.emailInput.setValue(SelectUserInfo.getInfo().get(0)[3].toString());
        return this;
    }

    @Step("set mobile number from database")
    public RegistrationPageSteps setMobileNumber() throws SQLException {
        registrationPage.mobileInput.setValue(SelectUserInfo.getInfo().get(0)[2].toString());
        return this;
    }

    @Step("set dataOfBirth from database")
    public RegistrationPageSteps setDataOfBirth() throws SQLException {
        executeJavaScript("arguments[0].valueAsDate= new Date(arguments[1]);", registrationPage.dataBirth, SelectUserInfo.getInfo().get(0)[4].toString());
        return this;
    }

    @Step("set password from database")
    public RegistrationPageSteps setPassword() throws SQLException {
        registrationPage.passwordInput.setValue(SelectUserInfo.getInfo().get(0)[5].toString());
        return this;
    }

    @Step("confirm password")
    public RegistrationPageSteps setConfirmedPassword() throws SQLException {
        registrationPage.passwordConfirmInput.setValue(SelectUserInfo.getInfo().get(0)[5].toString());
        return this;
    }

    @Step("scroll down")
    public RegistrationPageSteps scroll() {
        registrationPage.submitRegistration.scrollTo();
        return this;
    }

    @Step("submit registration info")
    public RegistrationPageSteps submit() {
        registrationPage.submitRegistration.click();
        return this;
    }

    @Step("validate that  {0} message appeared")
    public RegistrationPageSteps validateMessage( String message) {
        softAssert.assertTrue(registrationPage.infoMessage.isDisplayed());
        softAssert.assertEquals(registrationPage.infoMessage.getText(), message);
        softAssert.assertAll();
        return this;
    }

}
