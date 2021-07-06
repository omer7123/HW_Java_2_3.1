package com.company;

public class Main {

    public static void main(String[] args) {
        BankAccount Ilya = new BankAccount();
        Ilya.deposit(20000);
        boolean isFinished = true;
        while(isFinished){
            try {
                Ilya.withDraw(6000);
                System.out.println("С вашего баланса списалось 6000" + " \nОтаток на счете составляет: " + Ilya.getAmount());
                System.out.println("");
            } catch (LimitException e) {
                System.out.print(e.getMessage());
                System.out.println(e.getRemainingAmount());
                System.out.println("Остаток на счете: " + Ilya.getAmount());
                isFinished = false;
            }
        }
    }
}

