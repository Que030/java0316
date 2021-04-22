package com.ocp.day11;

import java.util.Scanner;
import static com.ocp.day11.EmployeeAPI.*;


import java.util.Arrays;
public class Main {
    public static void main(String[] args) {
        
    }
    public static void menu(){
        System.out.println("-------------------------------------------------");
        System.out.println("1.所有員工資料");
        System.out.println("2.總薪資");
        System.out.println("3.平均薪資");
        System.out.println("4.總預算");
        System.out.println("5.員工總數");
        System.out.println("9.結束");
        System.out.println("請選擇: ");
        Scanner sc = new Scanner(System.in);
        
        int idx = sc.nextInt();
        switch (idx) {
            case 1:
                System.out.println(Arrays.toString(getEmployees()));
                break;
            case 2:
                System.out.printf("總薪資: %,d\n",getTOtalSalary());
                break;
            case 3:
                System.out.printf("平均薪資: %,d\n",getSalaryAvg());
                break;
            case 4:
                System.out.printf("總預算: %,d\n",getTotalBudget());
                break;
            case 5:
                System.out.printf("員工總數: %,d\n",getamount());
                break;
            case 9:
               return ;
            
            
              
        }
        menu();
        
    
    
    }
    
}
