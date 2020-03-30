package com.company;

public class CalculatorWithCounter extends CalculatorWithOperator {
    double sum (double a,double b);
    double div (double a,double b);
    double mul (double a,double b);
    double step (double a,double b);

    getCountOperation() {
        return i;
    }

    CalculatorWithOperator calculatorWithOperator = new CalculatorWithOperator();
    CalculatorWithMath calculatorWithMath = new CalculatorWithMath();

                                                        // конструктор\\
    public CalculatorWithCounter(CalculatorWithOperator calculatorWithOperator, CalculatorWithMath calculatorWithMath) {
        this.calculatorWithOperator = calculatorWithOperator;
        this.calculatorWithMath = calculatorWithMath;
    }




    private CalculatorWithOperator getCalculatorWithOperator() {
        return calculatorWithOperator;
    }

    private void setCalculatorWithOperator(CalculatorWithOperator calculatorWithOperator) {
        this.calculatorWithOperator = calculatorWithOperator;
    }

    private CalculatorWithMath getCalculatorWithMath() {
        return calculatorWithMath;
    }

    private void setCalculatorWithMath(CalculatorWithMath calculatorWithMath) {
        this.calculatorWithMath = calculatorWithMath;
    }





}
