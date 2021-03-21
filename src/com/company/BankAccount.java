package com.company;

public class BankAccount {
     double amount;

    public  double getAmount() {
        return amount;
    }

    public void deposit(double sum){
        amount=amount+sum;
        System.out.println("na shetu"+amount);

    }
    public void  withDraw(int sum) throws LimitException {


        if (sum>amount){
            throw new LimitException("nedostatochno", getAmount());
        }
        else {
            amount= amount-sum;
            System.out.println("snyato"+ sum);

        }

    }
}
