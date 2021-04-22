package com.ocp.day16;

public class Dept {
private String name = "IT";
public static final String companyName = "HaHa";
    public class stuff {
        private String name = "John";
        public void job(){
            String name = "寫程式";
            System.out.printf("%s 在 %s 公司的 %s 部門下 %s\n",
                    this.name ,Dept.companyName ,Dept.this.name ,name);
        }
        
    }
}
