package open_closed_principle.maintains_ocp;

public class Client {
    public static void main(String[] args) {
        PaymentProcessor creditCardProcessor = new CreditCardProcessor();
        creditCardProcessor.processPayment(500);

        PaymentProcessor cashProcessor = new CashProcessor();
        cashProcessor.processPayment(500);
    }
}
