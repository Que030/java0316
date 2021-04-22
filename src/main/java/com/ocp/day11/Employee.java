package com.ocp.day11;

class Employee{
    public int getSalary() {
        return Salary;
    }

    public void setSalary(int Salary) {
        this.Salary = Salary;
    }
    private int Salary;

    @Override
    public String toString() {
        return "Employee{" + "Salary = " + Salary + '}';
    }

  
}