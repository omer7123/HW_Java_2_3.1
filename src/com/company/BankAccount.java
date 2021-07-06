package com.company;

public class BankAccount {
    double amount = 0.0;

    void deposit(double sum) {
        amount = getAmount() + sum;
    }


    void withDraw(int sum) throws LimitException {
        if (getAmount() < sum) {
            amount = getAmount() - getAmount();
            throw new LimitException("Недостаточно средств на лицевом счете и списалась оставшееся сумма: ", 2000);

        }
        amount = getAmount() - sum;
    }


    public double getAmount() {
        return amount;
    }
}
