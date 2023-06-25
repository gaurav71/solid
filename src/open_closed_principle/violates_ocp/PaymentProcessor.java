package open_closed_principle.violates_ocp;

public class PaymentProcessor {
    // Violates OCP because the function/class is not closed for modification.
    //If a new paymentType is added, the function will be modified
    public String processPayment(String paymentType, double amount) {
        if (paymentType.equals("credit_card")) {
           System.out.println("credit_card payment logic");
        } else if (paymentType.equals("cheque")) {
            System.out.println("cheque payment logic");
        } else if (paymentType.equals("cash")) {
            System.out.println("cash payment logic");
        }
        return "Success";
    }
}
