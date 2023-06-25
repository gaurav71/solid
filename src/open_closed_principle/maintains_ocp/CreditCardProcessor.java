package open_closed_principle.maintains_ocp;

public class CreditCardProcessor implements PaymentProcessor {
    public String processPayment(double amount) {
        System.out.println("credit_card payment logic");
        return "Success";
    }
}
