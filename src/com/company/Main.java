package com.company;

public class Main {

    public static void main(String[] args) {
//        BankAccount bankAccount= new BankAccount();
//        bankAccount.deposit(200);
//        try {
//            bankAccount.withDraw(100);
//        } catch (LimitException e) {
//            e.printStackTrace();
//        }

        bankOperation();
    }

    private static void bankOperation() {
        BankAccount bankAccount= new BankAccount();
        bankAccount.deposit(20000);
        for (int i = 0; ;i++) {
            try {
                bankAccount.withDraw(6000);
            } catch (LimitException e) {
                e.printStackTrace();
                e.getRemainingAmount();
                break;
            }



        }
    }
}
