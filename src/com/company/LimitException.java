package com.company;

import java.io.StringReader;

public class LimitException  extends Exception {
    private double remainingAmount;

    public LimitException(String message, double remainingAmount) {
        super(message);
        this.remainingAmount = remainingAmount;
    }

    public double getRemainingAmount() {
        System.out.println("snyato"+remainingAmount);
        BankAccount bankAccount= new BankAccount();
        remainingAmount= bankAccount.getAmount()-remainingAmount;

        return remainingAmount;
    }
}


