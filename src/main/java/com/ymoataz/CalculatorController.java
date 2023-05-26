package com.ymoataz;

public class CalculatorController {

    private CalculatorModel model;
    private CalculatorView view;

    CalculatorController(CalculatorModel calculatorModel, CalculatorView calculatorView) {
        this.model = calculatorModel;
        this.view = calculatorView;
    }

    void add() {
        model.add(view.getFirstNumber(), view.getSecondNumber());
        view.printCalculationResult(model.getResult());
    }

    void subtract() {
        model.subtract(view.getFirstNumber(), view.getSecondNumber());
        view.printCalculationResult(model.getResult());
    }

    void multiply() {
        model.multiply(view.getFirstNumber(), view.getSecondNumber());
        view.printCalculationResult(model.getResult());
    }

}
