
package com.ocp.day04;
    import com.ocp.day04.bar.Money;
public class Acess {
    public static void main(String[] args) {
        
    
    Money m1 = new Money();
        System.out.println(m1.a);
        com.ocp.day04.foo.Money m2 = new com.ocp.day04.foo.Money();
        System.out.println(m2.a);
        System.out.println(m2.a + m1.a);
    }
}