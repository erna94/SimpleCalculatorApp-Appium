package com.example.steps;

import com.example.BaseTest;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.hamcrest.MatcherAssert;
import org.hamcrest.Matchers;
import org.junit.jupiter.api.Assertions;

public class LoginPageSteps extends BaseTest {

  @Given("user is on login page")
  public void userIsOnLoginPage() {
    //kosong
  }

  @When("user input username {string}")
  public void userInputUsername(String username) {
    loginPage.inputUsername(username);
  }

  @And("user input password {string}")
  public void userInputPassword(String password) {
    loginPage.inputPassword(password);
  }

  @And("user click button login")
  public void userClickButtonLogin() {
    loginPage.clickLoginBtn();
  }

  @Then("user successfully login")
  public void userSuccessfullyLogin() {
    //getText
    String titleText = calculatorPage.getTitle();
    Assertions.assertEquals("Calculator", titleText);
    //isDisplayed
    boolean isDisplayed = calculatorPage.checkHamburgerBtnAppear();
    Assertions.assertTrue(isDisplayed);
    //Hamcrest
    MatcherAssert.assertThat(isDisplayed, Matchers.equalTo(true));
  }

  //tambahan
  @And("long press on button login")
  public void longPressOnButtonLogin() {
    loginPage.longPressBtnLogin();
  }

  @Then("toast should appear with text Login Failed")
  public void toastShouldAppearWithTextLoginFailed() {
    loginPage.toastFailedLogin();
  }
}
