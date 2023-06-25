package single_responsibility_principle.maintains_srp;

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
}
