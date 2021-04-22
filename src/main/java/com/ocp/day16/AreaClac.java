package com.ocp.day16;

public class AreaClac {

    public static void main(String[] args) {
        double r =15.0;
        CircleArea ca = new CicleAreaImp1();    
        System.out.println(ca.getArea(r));
        
//匿名內部類別
CircleArea ca2 = new CircleArea(){
    @Override
    public double getArea(double r){
        return r*r*Math.PI;
    }
};
        System.out.println(ca2.getArea(r));
    }

}
