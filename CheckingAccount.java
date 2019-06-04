package com.trimind.training.java07.HOME01;

public class CheckingAccount extends Account
{
   public  int noOfaAdditionalTransactions;
   public int intrest=5;

    public CheckingAccount(int noOfaAdditionalTransactions, int intrest) {
        this.noOfaAdditionalTransactions = noOfaAdditionalTransactions;
        this.intrest = intrest;
    }

    public int getNoOfaAdditionalTransactions()
    {
        return noOfaAdditionalTransactions;
    }

    public void setNoOfaAdditionalTransactions(int noOfaAdditionalTransactions) {
        this.noOfaAdditionalTransactions = noOfaAdditionalTransactions;
    }

    public int getIntrest() {
        return intrest;
    }

    public void setIntrest(int intrest)

    {
        this.intrest = intrest;
    }

    public double calculate()
    {
        balance=noOfaAdditionalTransactions*intrest;
        return balance;
    }
}
