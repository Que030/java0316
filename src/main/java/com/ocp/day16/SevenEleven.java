package com.ocp.day16;

public class SevenEleven {
//結帳方法
    public void submit(int price) {
        String name = "微粒炸醬麵";
        
//交易類別        
        class Tansaotion {

//交易資料            
            void print() {
                System.out.printf("交易金額 %d\n ", price);
            }
        }

        Tansaotion t = new Tansaotion();
        t.print();
    }
    public static void main(String[] args) {
        SevenEleven se = new SevenEleven();
        se.submit(100);
    }
}
