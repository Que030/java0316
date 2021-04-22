package com.ocp.day12;

public class Zoo03 {
    public static void main(String[] args) {
        Cat cat = new Tiger();
        cat.shout();        
        ((Tiger)cat).hunter();
        Cat cat2 = new  Cat();
        if(cat2 instanceof Tiger){
        ((Tiger)cat2).hunter();
        }else{
            System.out.printf("不可轉Tiger");
        }
        
    }
}
