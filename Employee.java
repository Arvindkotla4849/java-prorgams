package com.trimind.training.java07.HOME01;

public class Employee
{
    public String name;
    public int yearjoined;
    public double basicSalary;
    public double allowance;

    public Employee() {
    }

    public Employee(String name, int yearjoined, double basicSalary, double allowance) {
        this.name = name;
        this.yearjoined = yearjoined;
        this.basicSalary = basicSalary;
        this.allowance = allowance;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getYearjoined() {
        return yearjoined;
    }

    public void setYearjoined(int yearjoined) {
        this.yearjoined = yearjoined;
    }

    public double getBasicSalary() {
        return basicSalary;
    }

    public void setBasicSalary(double basicSalary) {
        this.basicSalary = basicSalary;
    }

    public double getAllowance() {
        return allowance;
    }

    public void setAllowance(double allowance) {
        this.allowance = allowance;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", yearjoined=" + yearjoined +
                ", basicSalary=" + basicSalary +
                ", allowance=" + allowance +
                '}';
    }
    public double calculateSalary(){
        return basicSalary - allowance;
    }


}
