package com.ocp.day11;

class Manager extends  Employee{

    public int getBudget() {
        return budget;
    }

    public void setBudget(int budget) {
        this.budget = budget;
    }
    private int budget;

    @Override
    public String toString() {
        return "Manager{" + "budget = " + budget + ", salary = " + getSalary() +'}' ;
    }
    
}
