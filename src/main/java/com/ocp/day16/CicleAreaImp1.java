package com.ocp.day16;

public class CicleAreaImp1 implements CircleArea{

    @Override
    public double getArea(double r) {
        return r*r*Math.PI;
    }
    
}
