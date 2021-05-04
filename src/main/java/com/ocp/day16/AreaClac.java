package com.ocp.day16;

public class AreaClac {

    public static void main(String[] args) {
        double r = 15.0;

        CircleArea ca = new CicleAreaImp1();
        System.out.println(ca.getArea(r));

//匿名內部類別(求圓面積)
        CircleArea ca2 = new CircleArea() {
            @Override
            public double getArea(double r) {
                return r * r * Math.PI;
            }
        };
        System.out.println(ca2.getArea(r));


//體積
        CircleArea ca3 = new CircleArea() {
            @Override
            public double getArea(double r) {
                return r * r * r * Math.PI / 3 * 4;
            }
        };
        System.out.println(ca3.getArea(r));
        
    }
}
