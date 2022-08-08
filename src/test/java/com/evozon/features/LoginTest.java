package com.evozon.features;

import com.evozon.steps.LoginSteps;
import net.serenitybdd.junit.runners.SerenityRunner;
import net.thucydides.core.annotations.Managed;
import net.thucydides.core.annotations.Steps;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;

public class LoginTest extends BaseTest {

    @Test
    public void validLoginTest(){
        loginSteps.navigateToHomepage();
        loginSteps.navigateToLoginPage();
        loginSteps.enterEmail("cosmin@evo.com");
        loginSteps.enterPassword("123123");
        loginSteps.clickLogin();
        loginSteps.verifyUserIsLoggedIn("teasd 123");
    }
}
