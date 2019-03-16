package model;

public class UserModel {

    private String id;
    private String password;

    public UserModel(String id, String password) {
        this.id = id;
        this.password = password;
    }

    public UserModel() {}

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public String toString() {
        return "UserModel{" +
                "id='" + id + '\'' +
                ", password='" + password + '\'' +
                '}';
    }
}
