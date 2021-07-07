package com.company;

public class Main {

    public static void main(String[] args) {
        BankAccount Ilya = new BankAccount();
        Ilya.deposit(20000);
        System.out.println("На Ваш счет зачислили 20000");
        boolean isFinished = true;
        while(isFinished){
            try {
                Ilya.withDraw(6000);
                System.out.println("С вашего баланса списалось 6000" + " \nОстаток на счете составляет: " + Ilya.getAmount());
                System.out.println("");
            } catch (LimitException e ) {
                try {
                    Ilya.withDraw((int) Ilya.getAmount());
                } catch (LimitException e1) {
                    e1.printStackTrace();
                }
                System.out.println(e.getMessage() + e.getRemainingAmount());
                System.out.println("Остаток на счете: " + Ilya.getAmount());
                isFinished = false;
            }
        }
    }
}

