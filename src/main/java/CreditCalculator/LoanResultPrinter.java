package CreditCalculator;

import java.text.DecimalFormat;

public class LoanResultPrinter {
    private static final DecimalFormat df = new DecimalFormat("0.00");

    public static void printLoanPaymentSchedule(Loan loan) {
        double monthlyPayment = LoanCalculator.calculateMonthlyPayment(loan);
        System.out.println("Месячный платеж составит " + df.format(monthlyPayment) + " RUB.");
        System.out.println("График выплат: ");
        for (int i = 1; i <= loan.getTerm(); i++) {
            System.out.println("Месяц " + i + " : " + df.format(monthlyPayment) + " RUB.");
        }
        int overPayment = (int)LoanCalculator.overPayment(loan);
        System.out.println("Сумма по кредиту с переплатой составит: " + overPayment + " RUB." );


    }
}

