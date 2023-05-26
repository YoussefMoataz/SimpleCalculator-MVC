package com.ymoataz;

public class Main {
    public static void main(String[] args) {

        CalculatorModel mainModel = new CalculatorModel();
        CalculatorView mainView = new CalculatorView();
        CalculatorController mainController = new CalculatorController(mainModel, mainView);

//        mainController.add();
//        mainController.subtract();
        mainController.multiply();

    }
}