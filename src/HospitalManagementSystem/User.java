package HospitalManagementSystem;

public class User {
    protected String username;
    protected String password;
    protected int user_id;

    public User(String username, String password, int user_id){
        this.username = username;
        this.password = password;
        this.user_id = user_id;
    }

    public String getUsername(){
        return username;
    }

    public void changeUsername(String username){
        this.username = username;
    }
}
