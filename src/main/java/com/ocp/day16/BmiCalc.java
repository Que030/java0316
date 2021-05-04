package com.ocp.day16;

public class BmiCalc {
    public static void main(String[] args) {
        BMI bmi = ( w , h) -> w/Math.pow(h/100, 2);
        System.out.println(bmi.getResult(60, 170));
              
    }
}
