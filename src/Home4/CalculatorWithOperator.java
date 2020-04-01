package com.company;

import java.util.Objects;

public class CalculatorWithOperator implements ICalculator {



   public double sum (double a,double b){
             double q = a + b;
             return q;
        }
       public double sub (double a,double b) {
             double w = a - b;
             return w;
       }
        public double div ( double a,double b){
             double e = a / b;
             return e;
           }
        public double mul ( double a, double b){
             double r = a * b;
             return r;
           }
         public double step ( double a, double b){
             double t = 1;
             for (int i = 0; i < b; i++) {
                   t = t * a;
               }
             return t;
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




