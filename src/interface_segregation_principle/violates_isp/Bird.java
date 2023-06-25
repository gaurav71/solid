package interface_segregation_principle.violates_isp;

// Violates ISP as not all birds can fly and interface is not generic in that case.
public interface Bird {
    String makeSound();
    void fly();
}
