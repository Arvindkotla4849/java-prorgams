package com.trimind.training.java07.HOME01;

public class Test
{
    public static void main(String[] args)
    {

        System.out.println("enter transaction details");
        SavingsAccount sav= new SavingsAccount(5,450);
        System.out.println("enter presentmoney in your account");
        sav.deposit();
        sav.withDraw();

        Account bank = new Account(217123,23623,2);
        System.out.println("the Account output statements are");
        System.out.println( bank.toString());

        System.out.println("the savingsAccount output statements are");
        sav.calculate();
        System.out.println(sav.toString());

        CheckingAccount cha = new CheckingAccount(60,5);
        cha.deposit();
        cha.withDraw();
        System.out.println("the checking account output statements are");
        cha.calculate();
        System.out.println(cha.toString());
    }

}
