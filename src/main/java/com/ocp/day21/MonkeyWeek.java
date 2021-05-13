package com.ocp.day21;

public class MonkeyWeek {
    public static void main(String[] args) {
        work(Week.Mon);
        work(Week.Tue);
        
        
    }
    public static void work(Week w){
        switch(w){
            case Mon:
                System.out.println("猴子穿新衣");
                break;
                
            case Tue:
                System.out.println("猴子去烤肉");
                break;
        }
    
    }
}
