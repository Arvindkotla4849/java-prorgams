package com.trimind.training.java07.HOME01;

public class Manager extends Employee
{
    double travelClaims;


    public double getTravelClaims()
    {
        return travelClaims;
    }

    public void setTravelClaims(double travelClaims)
    {
        this.travelClaims = travelClaims;
    }

    public Manager(double travelClaims) {
        this.travelClaims = travelClaims;
    }

    public Manager(String name, int yearjoined, double basicSalary, double allowance, double travelClaims) {

        this.name="niru";
        this.travelClaims = 20.2;
    }

    @Override
    public String toString() {
        return "Manager{" +
                "travelClaims=" + travelClaims +
                '}';
    }
    public double calculateSalary()
    {
        return 0;
    }


}