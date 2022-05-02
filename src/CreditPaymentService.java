public class CreditPaymentService {
    public double calculate(int amount, float rate, int period) {
        float monthlyRate = rate / (100 * 12);
        double denominator = Math.pow((1 + monthlyRate), -period);
        double annuityPayment = (int)(amount * (monthlyRate / (1 - denominator)));
        return annuityPayment;
    }
}