package com.ymoataz;

public class CalculatorModel {

    private Double result;

    public void add(Double num1, Double num2) {
        result = num1 + num2;
    }

    public void subtract(Double num1, Double num2) {
        result = num1 - num2;
    }

    public void multiply(Double num1, Double num2) {
        result = num1 * num2;
    }

    public Double getResult() {
        return result;
    }

}
