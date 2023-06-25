package interface_segregation_principle.maintains_isp;

public class Pigeon implements Bird, Flyable {
    @Override
    public String makeSound() {
        return "Pigeon Sound";
    }

    @Override
    public void fly() {
        System.out.println("Fly");
    }
}
