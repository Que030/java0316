package com.ocp.day02;

public class BMI {
//屬性定義區
    String name;
    double height;
    double weight;
    
//建構子區
    
    BMI(){
    
    }    

    BMI(String n, double h, double w) {
        name = n;
        height = h;
        weight = w;
    }
    
//方法實作區
    double getbmiValue(){//取得算bmi的資料型態
        double bmiValue = weight / Math.pow(height/100,2);
        return bmiValue;
    }
    String getResultValue(){//取得體重
        double bmiValue = getbmiValue();
        String resultvalue = (bmiValue >23)?"過重":(bmiValue < 18)?"過輕":"正常";
        return resultvalue;
    }
    
    void print(){
    double bmiValue = getbmiValue();
    String resultValue = getResultValue();
    System.out.printf("姓名: %s 身高: %.1f 體重: %.1f BMI: %2f 結果: %s\n", name ,height ,weight ,bmiValue ,resultValue);
    
    }
}
