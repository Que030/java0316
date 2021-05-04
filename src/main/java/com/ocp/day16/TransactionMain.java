package com.ocp.day16;

public class TransactionMain {
    public static void main(String[] args) {
        Transtion t = (amount, price) ->System.out.println(amount*price);
        t.print(10, 35);
        
    }
   
}
