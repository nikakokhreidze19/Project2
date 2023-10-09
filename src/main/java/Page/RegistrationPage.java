package Page;

import com.codeborne.selenide.SelenideElement;
import static com.codeborne.selenide.Selectors.byId;
import static com.codeborne.selenide.Selenide.$;

public class RegistrationPage {
    public SelenideElement
            authorizationForm = $(".authorization"),
            registrationForm = $(".register"),
            firstNameInput = $(byId("pFirstName")),
            lastNameInput = $(byId("pLastName")),
            emailInput = $(byId("pEmail")),
            mobileInput = $(byId("pPhone")),
            dataBirth = $(byId("pDateBirth")),
            passwordInput = $(byId("pPassword")),
            passwordConfirmInput = $(byId("pConfirmPassword")),
            submitRegistration = $(".dashbord-registration"),
            infoMessage = $("#physicalInfoMassage");


}
