package CreditCalculator;

/**
 * Формула нашего калькулятора
 * x = S × (P + N), где
 * S(amount) — размер кредита;
 * Р(monthlyRate) — одна сотая доля процентной ставки (в месяц);
 * N(term) — срок погашения (месяц).
 * */
public class LoanCalculator {
    public  static double calculateMonthlyPayment(Loan loan) {
        double monthlyRate = loan.getAnnualRate() / 12.0 / 100.0;
        return (loan.getAmount() * monthlyRate) / (1 - Math.pow(1 + monthlyRate, -loan.getTerm()));
    }
    public static double overPayment(Loan loan) {
        double Overpayment = calculateMonthlyPayment(loan) * loan.getTerm();
        return Overpayment;
    }
}
