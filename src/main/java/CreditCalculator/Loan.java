package CreditCalculator;
/**
 * @ Здесь производится полный сбор информации о кредите.
 * @ Геттеры и Сеттеры нашего калькулятора и проверка заначений
* */


public class Loan{

    /**
     * Геттеры и Сеттеры нашего калькулятора
     * */

    private double amount;
    private int term;
    private double annualRate;
/**
 * @ Проверка вводимых значений <=0
* */
    public Loan(double amount, int term, double annualRate) {
        if(amount <= 0 || term <= 0 || annualRate <= 0){
            throw new IllegalArgumentException("Все значения должны быть больше 0.");
        }
        this.amount = amount;
        this.term = term;
        this.annualRate = annualRate;
    }


    /**
     * @ Размер нашего кредита
     * */
    public double getAmount() {
        return amount;
    }

    /**
     * @ Срок нашего кредита
     * */
    public int getTerm() {
        return term;
    }

    /**
     * @ Годовая % ставка нашего кредита
     * */
    public double getAnnualRate() {
        return annualRate;
    }
}