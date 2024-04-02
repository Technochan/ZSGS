package java_assignment_12_Abstract_classes_and_abstract_methods.book.model;

public class UserDetails {

    private int userId;
    private String username;
    private String userPassword;


    public UserDetails(int userId, String username, String userPassword) {
        this.userId = userId;
        this.username = username;
        this.userPassword = userPassword;
    }


    public int getUserId() {
        return userId;
    }

    public String getUsername() {
        return username;
    }

    public String getUserPassword() {
        return userPassword;
    }


}
