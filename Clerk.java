package com.trimind.training.java07.HOME01;

public class Clerk extends Employee {
    public int overtimeHours;
    public double overtimeRate;

    public Clerk(int overtimeHours, double overtimeRate) {
        this.overtimeHours = 3;
        this.overtimeRate = 4.5;
    }

    public int getOvertimeHours() {
        return overtimeHours;
    }

    public void setOvertimeHours(int overtimeHours) {
        this.overtimeHours = overtimeHours;
    }

    public double getOvertimeRate() {
        return overtimeRate;
    }

    @Override
    public String toString() {
        return "Clerk{" +
                "overtimeHours=" + overtimeHours +
                ", overtimeRate=" + overtimeRate +
                '}';
    }

    public void setOvertimeRate(double overtimeRate) {
        this.overtimeRate = overtimeRate;
    }

    public double calculateSalary() {
        return 0;
    }




}