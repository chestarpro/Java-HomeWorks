package com.company.A;

public class Main {

    public static void main(String[] args) {
        Credit credit1 = new Credit("CB-23452", 35_000, 1, 10.2);
        System.out.println(credit1);

        Credit credit2 = new Credit("CB-23453", 200_000, 18, 7.2);
        System.out.println(credit2);

        Credit credit3 = new Credit("CB-23454", 3_000_000, 48, 4.3);
        System.out.println(credit3);

        Credit credit4 = new Credit("CB-23455", 120_000, 12, 7.8);
        System.out.println(credit4);

        Credit credit5 = new Credit("CB-23456", 95_000, 9, 8.2);
        System.out.println(credit5);

        System.out.println("Количество выданных кредитов: " + Credit.getCountCredit());
        System.out.println("Общая сумма выданных кредитов: " + Credit.getTotalSumCredits() + " сом");
        System.out.println("Средняя сумма кредитов: " + Credit.getAverageSumCredits() + " сом");
    }
}
