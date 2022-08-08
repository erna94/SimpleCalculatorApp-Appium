package com.example.steps;

import com.example.BaseTest;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class ListPageSteps extends BaseTest {

  @And("user do scroll")
  public void userDoScroll() {
    listPage.swipeList();
  }

  @When("user double tap in second list")
  public void userDoubleTapInSecondList() {
    listPage.doubleTap();
  }

  @Then("toast should appear twice")
  public void toastShouldAppearTwice() {
    listPage.toastSecondList();
  }

  //tambahan
//  @And("user change operator")
//  public void userChangeOperator() {
//    listPage.changeOprtr();
//  }
}
