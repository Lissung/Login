import DB.LocalDB;
import model.UserModel;
import view.FrontView;

public class EntryPoint {

    public static void main(String[] args)
    {
        UserModel userModel = new UserModel();
        userModel.setId("jin");
        userModel.setPassword("123");

        LocalDB.userList.add(userModel);

      



//        UserModel Jin = new UserModel();
//        Jin.setId("JIn");
//        Jin.setPassword("0815");
//
//        System.out.println("[USER MODEL]");
//        System.out.println(Jin.toString());
        FrontView loginView = new FrontView();
        loginView.registerView(); //resister가 어떠한 명령어나 메서드? 그런 것을 의미하는 것인지..
    }
}
