package liskov_substitution_principle.maintains_lsv;

// Do not extend Vehicle
// Maybe some interface can be created which will have common methods
public class ElectricVehicle {
    public String vehicleNumber;
    public void charge() throws Exception {
        System.out.println("Charging");
    }

    public void accelerate() {
        System.out.println("accelerate");
    }
}
