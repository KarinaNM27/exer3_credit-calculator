public class Main {
    public static void main(String[] args) {
        CreditPaymentService service = new CreditPaymentService();

        double annuityPayment1 = service.calculate(1_000_000,9.99F,12);
        System.out.println(annuityPayment1);

        double annuityPayment2 = service.calculate(1_000_000,9.99F,24);
        System.out.println(annuityPayment2);

        double annuityPayment3 = service.calculate(1_000_000,9.99F,36);
        System.out.println(annuityPayment3);
    }


}