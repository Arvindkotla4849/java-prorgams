package com.trimind.training.java07.HOME01;

public class SavingsAccount extends Account
{
  public double intrest=5;
  public int lastDayOfMonth;

    public SavingsAccount(double intrest, int lastDayOfMonth) {
        this.intrest = intrest;
        this.lastDayOfMonth = lastDayOfMonth;
    }

    public double getIntrest() {
        return intrest;
    }

    public void setIntrest(double intrest) {
        this.intrest = intrest;
    }

    public int getLastDayOfMonth() {
        return lastDayOfMonth;
    }

    public void setLastDayOfMonth(int lastDayOfMonth) {
        this.lastDayOfMonth = lastDayOfMonth;
    }



    public double calculate()
   {
        balance = intrest * lastDayOfMonth;
        return balance;
   }

}
