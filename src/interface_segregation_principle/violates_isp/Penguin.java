package interface_segregation_principle.violates_isp;

import jdk.jshell.spi.ExecutionControl;

public class Penguin implements Bird{
    @Override
    public String makeSound() {
        return "Penguin sound";
    }

    @Override
    public void fly() {
        // Invalid Operation as penguins cannot fly
    }
}
