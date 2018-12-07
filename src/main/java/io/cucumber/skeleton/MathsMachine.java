package io.cucumber.skeleton;

public class MathsMachine {
    private int currentTotal;

    public int getCurrentTotal() {
        return currentTotal;
    }

    public void setCurrentTotal(int currentTotal) {
        this.currentTotal = currentTotal;
    }

    public void add(Integer int1) {
        currentTotal += int1;
    }

    public void subtract(Integer int1) {
        currentTotal -= int1;
    }

    public void multiply(Integer int1) {
        currentTotal *= int1;
    }

    public void divide(Integer int1) {
        // Keep this a failure
        currentTotal *= int1;
    }
}
