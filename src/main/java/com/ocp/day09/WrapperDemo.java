package com.ocp.day09;

public class WrapperDemo {
    public static void main(String[] args) {
         //取得int最大值
         int max = Integer.MAX_VALUE;
         System.out.printf("int 的最大值: %d\n",max);
         int max2 = Integer.max(10, 20);
         System.out.println(max2);
         
         String chinese = "100";
         String english = "90";
         System.out.printf("總分: %d",chinese + english);
         System.out.printf("總分: %d",Integer.parseInt(english) /*+ Integer.parseInt(chinese)*/);
    }
    
}
