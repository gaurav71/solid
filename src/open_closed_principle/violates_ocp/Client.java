package open_closed_principle.violates_ocp;

public class Client {
    public static void main(String[] args) {
        PaymentProcessor paymentProcessor = new PaymentProcessor();
        String paymentType = "credit_card";
        paymentProcessor.processPayment(paymentType, 500);
    }
}
