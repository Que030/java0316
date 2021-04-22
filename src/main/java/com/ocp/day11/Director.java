package com.ocp.day11;

class Director extends Manager {

    public int getStockoption() {
        return stockoption;
    }

    public void setStockoption(int stockoption) {
        this.stockoption = stockoption;
    }
    private int stockoption;

    @Override
    public String toString() {
        return "Director{" + "stockoption =" + stockoption + "budget =" + getBudget() + ", salary =" + getSalary()  +'}';
    }

}
