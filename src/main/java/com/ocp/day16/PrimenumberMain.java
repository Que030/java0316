package com.ocp.day16;

public class PrimenumberMain {

    public static void main(String[] args) {
        Primenumber num = (n) -> {
            boolean v = true;

            for (int a = 2 ; a < n; a++) {
                if (n % a == 0) {
                    v = false;
                }
            }

             return v;
        };

        System.out.println(num.isPrime(9973));
    }

}
