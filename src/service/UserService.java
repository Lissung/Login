package service;

import com.sun.xml.internal.bind.v2.TODO;
import model.UserModel;
import repository.UserRepository;

import java.util.List;

public class UserService {

    UserRepository userRepository = new UserRepository();

    public int saveUser(String id, String password) {

        //1. userList를 가져온다
        List<UserModel> userList = userRepository.findAll();

        //2. userList를 돌면서 id중복을 확인한다.
        for (UserModel model : userList) {
            if (id.equalsIgnoreCase(model.getId())) {
                // 똑같은 id가 있는 경우
                return -1;
            }
        }

        //3. 중복된게 없으면 회원가입
        UserModel newuser = new UserModel();
        newuser.setId(id);
        newuser.setPassword(password);

        userRepository.saveUser(newuser);

        //4. 결과값 반환
        return 1;

    }

    public int login(String id, String password) {
        // 0 : id 없음
        // 1 : 비밀번호 틀림
        // 2 : 로그인 성공
        int result = 0;


        //1. userList를 가져온다.
        List<UserModel> userList = userRepository.findAll();

        //2. userList를 돌며,
        for (UserModel model : userList) {
            //2-1.  똑같은 id가 있는지 확인한다.
            if (id.equalsIgnoreCase(model.getId())) {
                //3. 똑같은 id가 있으면, 비밀번호가 같은지 확인한다.
                if (password.equalsIgnoreCase(model.getPassword())) {
                    result = 2;
                    return result; //return 2;
                }

                // 똑같은 id지만 비번 틀린경우
                result = 1;
                return result;
            }
        }

        //4. 결과값을 반환한다.
        return 0;
    }


}
