package com.trimind.training.java07.HOME01;

import java.util.Scanner;

public class Account
{
    public int accountNo;
    public double balance;
    public int dateCreated;

    public Account(int accountNo, double balance, int dateCreated) {
        this.accountNo = accountNo;
        this.balance = balance;
        this.dateCreated = dateCreated;
    }

    public Account() {
    }

    public double deposit()
    {
        int presentMoney;
        int moneyToBeAdded;
        Scanner sc = new Scanner(System.in);
        presentMoney=sc.nextInt();
        System.out.println("enter money to be added");
        moneyToBeAdded=sc.nextInt();
        int newMoney;
        newMoney = presentMoney + moneyToBeAdded;
        System.out.println("the new money is " +newMoney);
        return newMoney;

    }

    public double withDraw()

    {
        int presentMoney;
        System.out.println("enter the money u want to remove");
        int moneyToBeRemoved;
        Scanner sc = new Scanner(System.in);
        presentMoney=sc.nextInt();
        moneyToBeRemoved=sc.nextInt();
        presentMoney = presentMoney - moneyToBeRemoved;
        System.out.println("the present money after withdraw"+presentMoney);
        return presentMoney;
    }

    @Override
    public String toString() {
        return "Account{" +
                "accountNo=" + accountNo +
                ", balance=" + balance +
                ", dateCreated=" + dateCreated +
                '}';
    }
}
