package com.ocp.day12;

public class Zoo02 {
    public static void main(String[] args) {
        Tiger tiger = new Tiger();
        playShot(tiger);
        
        Cat cat = new Cat();
        playShot(cat);
        
        Cat cat2 = new Tiger();
        playShot(cat2);
    }
    
    public static void playShot(Cat x){
        x.shout();
        
    }
}
