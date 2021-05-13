package com.ocp.day24;

import com.ocp.day24.DataCenter;
import com.ocp.day24.Food;
import java.util.Set;

public class Hungry {
    public static void main(String[] args) {
        DataCenter dc = new  DataCenter();
        Set<Food> catalong = dc.getCatalog();
        System.out.println(catalong);
        System.out.println(catalong.size());
    }
}
