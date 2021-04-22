
package com.ocp.day02;

import com.sun.xml.internal.bind.v2.runtime.output.SAXOutput;

public class Exam1 {
    public static void main(String[] args) {
        Exam e1 = new Exam("Que", 98, 86);
        Exam e2 = new Exam("Feng", 94, 99);
                
        System.out.println(e1.print());
        System.out.println(e2.print());
        
                
    }
    
}
