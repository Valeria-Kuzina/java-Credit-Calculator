public class Main {
    public static void main(String[] args) {
        CreditPaymentService creditPaymentService = new CreditPaymentService();

        int monthlyPaymentOneYear = creditPaymentService.calculate(1_000_000, 1, 9.99);
        int monthlyPaymentTwoYears = creditPaymentService.calculate(1_000_000, 2, 9.99);
        int monthlyPaymentThreeYears = creditPaymentService.calculate(1_000_000, 3, 9.99);

        System.out.println("Ежемесячный платёж = " + monthlyPaymentOneYear);
        System.out.println("Ежемесячный платёж = " + monthlyPaymentTwoYears);
        System.out.println("Ежемесячный платёж = " + monthlyPaymentThreeYears);
    }
}
