package com.company;

public class MainCalculatorWithOperator {
    public static void main(String[] args) {
        CalculatorWithOperator z = new CalculatorWithOperator();

        double result =z.sum(4.1,z.mul(15,7))+(z.step(z.div(28,5),2));
        System.out.println(result);       //140.45999999999998\\
        System.out.println(result / 0);   //Infinity\\
        System.out.println(result / 0.0d);//Infinity\\

    }
}
 //    4.1 + 15 * 7 + (28 / 5) ^ 2.    \\
 //    a = 15 * 7 + 4.1;               \\
 //    b =(28 / 5) ^ 2;                \\
 //    c = a + b;                      \\
 //    mul//sum//div//step//sum        \\
