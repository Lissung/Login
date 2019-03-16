package service;

import model.UserModel;
import repository.UserRepository;

public class UserService {

    UserRepository userRepository = new UserRepository();

    public int saveUser(String id, String password){

        UserModel user = new UserModel(id, password);
        userRepository.saveUser(user);



        return 0;
    }

//asdfjkadlsfdjsdalkfdjsalk
}
