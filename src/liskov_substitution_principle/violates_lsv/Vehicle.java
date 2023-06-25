package liskov_substitution_principle.violates_lsv;

public class Vehicle {
    public String vehicleNumber;
    public void startEngine() throws Exception {
       System.out.println("Starts engine");
    }

    public void accelerate() {
        System.out.println("accelerate");
    }
}
