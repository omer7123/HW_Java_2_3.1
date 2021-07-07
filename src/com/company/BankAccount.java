package com.company;

public class BankAccount {
    double amount = 0.0;

    void deposit(double sum) {
        amount = getAmount() + sum;
    }


    void withDraw(int sum) throws LimitException {
        if (getAmount() < sum) {
            throw new LimitException("Недостаточно средств на лицевом счете и списалась оставшиеся сумма: ", 2000);
        }else{
            amount = getAmount() - sum;
        }
    }


    public double getAmount() {
        return amount;
    }
}
