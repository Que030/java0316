package com.ocp.day08;

public class MultiArrayDemo3 {
    public static void main(String[] args) {
        double[][] hw = {{170 , 60},{160 ,45},{180,90}};
        
        double[] bmi = {0,0,0};
        
        for (int i = 0; i < 3; i++) {
            
            bmi[i] = hw[i][1]/Math.pow(hw[i][0]/100,2);
            System.out.printf("%.2f\n",bmi[i]);
            /*for(double[] x:hw){
            double h = x[]:
            double w = x[2]
            bmi[i] = h/Math.pow(w/100,2);
            
            }
            */
}
    }
    
}
