package com.ocp.day06;

public class Mymath {

    public static double sum(double[] number) {
        int sum = 0;
        for (double n : number) {
            sum += n;
        }
        return sum;

    }

    public static double avg(double[] number) {
        double sum = sum(number);
        double n = number.length;
        double avg = sum / n;
        return avg;
    }

    public static double sd(double[] number) {
        double avg = avg(number);
        double sq = 0;
        for (double n : number) {
            sq += Math.pow(n - avg, 2);
        }
        double n = number.length;
        double sd = Math.sqrt(sq / n);
        return sd;
    }

    public static double cv(double[] number) {
        double avg = avg(number);
        double sd = sd(number);
        double cv = sd / avg;
        return cv;
    }

    public static double max(double[] number) {
        double max = number[0];
        for (double n : number) {

            if (max < n) {
                max = n;
            }

        }
        return max;
    }

public static double min(double[] number) {
        double min = number[0];
        for (double n : number) {

            if (min > n) {
                min = n;
            }

        }
        return min;
    }

}


