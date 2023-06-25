package liskov_substitution_principle.violates_lsv;

public class ElectricVehicle extends Vehicle{
    // Have to override to state that EV cannot perform this action
    // Therefore in code we cannot replace Vehicle's object with ElectricVehicle's object and
    // expect it to run fine
    public void startEngine() throws Exception {
        throw new Exception("EV has no engine");
    }
}
