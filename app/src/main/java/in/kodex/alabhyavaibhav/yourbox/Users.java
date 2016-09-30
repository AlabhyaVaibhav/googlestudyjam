package in.kodex.alabhyavaibhav.yourbox;

/**
 * Created by Alabhya on 9/29/2016.
 */

public class Users {
    private String username, password;

    Users() {

    }

    Users(String username, String password){
        this.username = username;
        this.password = password;
    }

    void setUsername(String user) {
        this.username = user;


    }

    String getUsername() {
        return username;
    }

    void setPassword(String pass) {
        password = pass;
    }

    String getPassword() {
        return password;
    }


}
