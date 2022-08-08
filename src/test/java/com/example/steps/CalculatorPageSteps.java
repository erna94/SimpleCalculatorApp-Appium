package com.example.steps;

import static org.assertj.core.api.Assertions.assertThat;

import com.example.BaseTest;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.jupiter.api.Assertions;

public class CalculatorPageSteps extends BaseTest {

    @When("user input first number {string}")
    public void inputFirstNumber(String firstNumber) {
        calculatorPage.inputFirstNumber(firstNumber);
    }

    @And("user choose icon {string} operator")
    public void userChooseIconOperator(String operator) {
        calculatorPage.clickSpinnerOperator();
        calculatorPage.chooseSpinnerOperator(operator);
    }

    @And("user input second number {string}")
    public void userInputSecondNumber(String secondNumber) {
        calculatorPage.inputSecondNumber(secondNumber);
    }
    @And("user click button calculate")
    public void userClickButtonCalculate() {
        calculatorPage.clickBtnCalculate();
    }
    @Then("the result should be {string}")
    public void theResultShouldBe(String resultNumber) {
        String result = calculatorPage.checkResult();
        Assertions.assertEquals("Hasil : " + resultNumber, result);
    }
}
