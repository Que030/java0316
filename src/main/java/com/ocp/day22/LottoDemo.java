package com.ocp.day22;

public class LottoDemo {
    public static void main(String[] args) {
        Lotto a = Lotto.getLotto();
        System.out.println("小明今日四星彩開獎"+a.getValue());
        Lotto b = Lotto.getLotto();
        System.out.println("小華今日四星彩開獎"+b.getValue());
        Lotto c = Lotto.getLotto();
        System.out.println("小英今日四星彩開獎"+c.getValue());
      /*You want to create a singleton class by using the Singleton design pattern.
Which two statements enforce the singleton nature of the design?

A. Make the class static.
*B. Make the constructor private.
C. Override equals() and hashCode() methods of the java.lang.Object class.
*D. Use a static reference to point to the single instance.
E. Implement the Serializable interface.
*/
    }
}
