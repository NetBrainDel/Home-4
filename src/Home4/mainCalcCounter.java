package com.company;

public class mainCalcCounter {

    public static class CalcWithCounterMain {
        public static void main(String[] args) {
            CalculatorWithCounter getCalc = new CalculatorWithCounter();
            System.out.println(getCalc.sub(4,1));
            System.out.println(getCalc.sum(3,4));
            System.out.println(getCalc.getCounter());
        }
    }
}
