package io.cucumber.skeleton;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

import static junit.framework.TestCase.assertEquals;

public class ExampleMathsStepDefs {
    MathsMachine mathsMachine = new MathsMachine();

    @Given("Current total is set to {int}")
    public void current_total_is_set_to(Integer int1) {
        mathsMachine.setCurrentTotal(int1);
    }

    @Then("Current total is equal to {int}")
    public void current_total_is_equal_to(Integer int1) {
        assertEquals(int1.intValue(), mathsMachine.getCurrentTotal());
    }

    @When("I add {int}")
    public void i_add(Integer int1) {
        mathsMachine.add(int1);
    }

    @When("I subtract {int}")
    public void i_subtract(Integer int1) {
        mathsMachine.subtract(int1);
    }

    @When("I multiple by {int}")
    public void i_multiple_by(Integer int1) {
        mathsMachine.multiply(int1);
    }

    @When("I divide by {int}")
    public void i_divide_by(Integer int1) {
        mathsMachine.divide(int1);
    }
}
