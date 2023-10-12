package CreditCalculator;


import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        double amount;
        int term;
        double annualRate;
        Scanner reader = new Scanner(System.in);
        System.out.print("Введите сумму кредита: ");
        amount = reader.nextDouble();
        System.out.print("Введите срок кредита: ");
        term = reader.nextInt();
        System.out.print("Введите проценцентную ставку по кредиту: ");
        annualRate = reader.nextDouble();

        try {
            Loan loan = new Loan(amount, term, annualRate);
            LoanResultPrinter.printLoanPaymentSchedule(loan);
        } catch (IllegalArgumentException e){
            System.out.println("Некорректные значения кредита: " + e.getMessage());
        }
    }
}