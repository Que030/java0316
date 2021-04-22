package com.ocp.day01;


public class Account {
    //私有
    private int blance;
    
    //查詢帳戶餘額
    int getBalance(){
        return blance;
    }
    //提款
    void withdraw(int money ){
        //提款驗證
        if (money <= 0) {
            System.out.println("提款金額錯誤!!");
        return;
        }
        if (money > blance) {
            System.out.println("帳戶餘額不足");
            return;
        }
blance -= money;
    
}
    
    //存款
void  deposit(int money){
    //驗證存款是否符合條件
    if (money <=0) {
        System.out.println("存款金額錯誤!!");
        return;
    }
blance += money;
}
}