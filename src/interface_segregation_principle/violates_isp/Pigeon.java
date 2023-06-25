package interface_segregation_principle.violates_isp;

public class Pigeon implements Bird{
    @Override
    public String makeSound() {
        return "Pigeon Sound";
    }

    @Override
    public void fly() {
        System.out.println("Fly");
    }
}
