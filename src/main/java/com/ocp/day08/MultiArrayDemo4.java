package com.ocp.day08;

public class MultiArrayDemo4 {
    public static void main(String[] args) {
        double[][] hw = {{170 , 160, 180},{60, 45, 90}};
        double[] bmi = {0,0,0,};
        
        for (int i = 0; i < 3; i++) {
            bmi[i] = hw[1][i]/Math.pow(hw[0][i]/100, 2);
           
            System.out.printf("%.2f\n",bmi[i]);
            
        }
    }
    
}
