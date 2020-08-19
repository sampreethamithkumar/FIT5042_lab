package fit5042.tutex.calculator;

import javax.ejb.Remote;
import javax.ejb.Stateful;


/**
 * A simple monthly payment calculator implementation
 *
 * @author Sampreeth Amith Kumar
 */

@Stateful
public class MonthlyPaymentCalculatorSessionBean implements MonthlyPaymentCalculator {

    public double calculate(double principle, int year, double interestRate) {
        double monthlyPayment = 0.0;
        int numberOfPayments = year * 12;
        if (interestRate > 0) {
            monthlyPayment = principle * (interestRate * (Math.pow((1 + interestRate), numberOfPayments))) / ((Math.pow((1 + interestRate), numberOfPayments)) - 1);
        } else {
            monthlyPayment = 1000;
        }

        return monthlyPayment;
    }
}
