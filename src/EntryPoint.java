import model.UserModel;
import view.LoginView;

public class EntryPoint {

    public static void main(String[] args)
    {
//        UserModel Jin = new UserModel();
//        Jin.setId("JIn");
//        Jin.setPassword("0815");
//
//        System.out.println("[USER MODEL]");
//        System.out.println(Jin.toString());
        LoginView loginView = new LoginView();
        loginView.registerView(); //resister가 어떠한 명령어나 메서드? 그런 것을 의미하는 것인지..
    }
}
