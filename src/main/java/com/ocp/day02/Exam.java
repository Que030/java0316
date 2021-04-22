package com.ocp.day02;

import java.io.PrintStream;


public class Exam {
    String name ;
    int chinese;
    int math;

    Exam(String n ,int c ,int m){
        name = n;
        chinese = c;
        math = m;
    }
    
    
    int sum(){
     return  chinese + math ;
    
    }
            
     double avg(){
        
        return sum() / 2.0;
         
     }
     
       String print(){
       
               
         return String.format("姓名: %s 國文成績: %d 數學成績: %d 總分: %d 平均: %.1f",name ,chinese ,math ,sum() ,avg());
    }
}
