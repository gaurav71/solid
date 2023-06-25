package open_closed_principle.maintains_ocp;

public class ChequeProcessor implements PaymentProcessor {
    public String processPayment(double amount) {
        System.out.println("cheque payment logic");
        return "Success";
    }
}
