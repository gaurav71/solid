package open_closed_principle.maintains_ocp;

public class CashProcessor implements PaymentProcessor{
    public String processPayment(double amount) {
        System.out.println("cash payment logic");
        return "Success";
    }
}
