package com.ymoataz;

import java.util.Scanner;

public class CalculatorView {

    public void printCalculationResult(Double calcResult) {
        System.out.println("The result is: " + calcResult.toString());
    }

    public Double getFirstNumber() {
        System.out.print("Enter First number: ");
        return new Scanner(System.in).nextDouble();
    }

    public Double getSecondNumber() {
        System.out.print("Enter Second number: ");
        return new Scanner(System.in).nextDouble();
    }

}
