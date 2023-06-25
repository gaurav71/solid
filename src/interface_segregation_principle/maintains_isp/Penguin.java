package interface_segregation_principle.maintains_isp;

public class Penguin implements Bird {
    @Override
    public String makeSound() {
        return "Penguin sound";
    }
}
