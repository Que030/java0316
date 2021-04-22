package com.ocp.day15;

public class Fighter extends Airplane implements Weapon,Oil{

    @Override
    int speed() {
        return 20000;
    }

    @Override
    public void shoot() {
        System.out.println("響尾蛇飛彈");
    }

    @Override
    public int spend() {
       
        return 20000;
    }
    
    
    
}
