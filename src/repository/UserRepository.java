package repository;

import DB.LocalDB;
import model.UserModel;

import java.util.List;

public class UserRepository {

    public int saveUser(UserModel userModel){   //UserModel userModel...?
        LocalDB.userList.add(userModel);
        return 0;
    }
    public List<UserModel> findAll(){
        return  LocalDB.userList;
    }
}
