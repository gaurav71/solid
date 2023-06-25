package solid.single_responsibility_principle.voilates_srp;

// Violates SRP as class is now responsible for managing user and sending email
public class User {
    private String userName;

    private String email;

    User(String userName, String email) {
        this.userName = userName;
        this.email = email;
    }

    public void setEmail(String email) {
        this.email = email;
    }


    // Violates SRP
    public void sendEmail(String message) {
        System.out.println("Sending email");
    }
}
