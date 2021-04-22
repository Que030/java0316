
package com.ocp.day02;

public class Student01 {
    public static void main(String[] args) {
        Student Que = new Student("Que", 17, 170, 60);
                
        Que.print();
        
        Que.exam = new Exam("Que", 94, 86);
        Que.print();
        
        System.out.println(Que.bmi.getbmiValue());
        System.out.println(Que.exam.sum());
        Que.exam.math = 75 ;
        Que.print();
              
    }
    
}
