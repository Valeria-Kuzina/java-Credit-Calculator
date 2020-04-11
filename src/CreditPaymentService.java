public class CreditPaymentService {
    public int calculate(int loan, double year, double interestRate) {

        double pow = Math.pow((1 + interestRate / 100 / 12), (year * 12));
        int monthlyPayment = (int) (loan * ((interestRate / 100 / 12) * pow) / (pow - 1));
        return monthlyPayment;
    }
}
