package repository;

import DB.LocalDB;
import model.UserModel;

public class UserRepository {

    public int saveUser(UserModel userModel){
        LocalDB.userList.add(userModel);
        return 0;
    }

}
