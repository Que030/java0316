package com.ocp.day16;

public class DeptDemo {

    public static void main(String[] args) {
        Dept dept = new Dept();
        Dept.stuff stuff = dept.new stuff();
        stuff.job();
        
        Dept.stuff stuff2 = new Dept().new stuff();
        
        new Dept().new stuff().job();

    }
}
