package com.company;

public class CalculatorWithCounter implements ICalculator {
    private int counter;
//    private  CalculatorWithMath calculatorWithMath;
      private CalculatorWithCounter calculatorWithCounter;
//    public  CalculatorWithCounter(CalculatorWithMath calculatorWithMath){
//        this.calculatorWithMath = calculatorWithMath;
//    }

    public  CalculatorWithCounter(){
        this.calculatorWithCounter = calculatorWithCounter;
    }
    public int getCounter() {
        return counter;
    }

    public double sum(double a, double b){
        this.counter++;
        double c=a+b;
        return c;
    }
    public double sub (double a,double b){
        this.counter++;
        double c=a-b;
        return c;
    }
    public double div (double a,double b){
        this.counter++;
        double c=a/b;
        return c;
    }
    public double mul (double a,double b){
        this.counter++;
        double c=a*b;
        return c;
    }
    public double step (double a,double b){
        this.counter++;
        double c = Math.pow(a,b);
        return c;
    }
    public double abs ( double a){
        double y = Math.abs(a);
        return y;
    }
    public double kor ( double a){
        double o = Math.sqrt(a);
        return o;
    }
}








