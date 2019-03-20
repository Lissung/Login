package model;

public class UserModel {

    private String id;
    private String password;

    public UserModel(String id, String password) {
        this.id = id; //this는 자기 자신을 의미
        this.password = password;
    }

    public UserModel() {}

    public String getId() {
        return id;
    } // get은 가져오는 것 set은 지정하는 것

    public void setId(String id) {
        this.id = id;
    } // void는 return 값이 없을 때

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Override // toString 은 개체를 문자열로 반환?? 먼말이여
    public String toString() {
        return "UserModel{" +
                "id='" + id + '\'' +
                ", password='" + password + '\'' +
                '}';
    }
}
