package com.ocp.day06;

public class ArrayCV {

    public static void main(String[] args) {
        double[] number = {10, 20, 30};
        double sum = 0;
        for (double n : number) {
            sum += n;

        }
        System.out.printf("sum = %.1f\n",sum );
        
        double avg = sum / number.length;
        System.out.printf("avg  = %.1f\n",avg);
         
        double sq = 0;
        for(double n : number) {
            sq += Math.pow(n - avg, 2);
       
        }
        System.out.printf("SQ = %.1f\n",sq);
          
        double sd = Math.sqrt(sq / number.length);
        System.out.printf("S.D = %.1f\n",sd);
        
        double cv = sd / avg ;
        System.out.printf("C.V =%.1f\n",cv);
    }

}


