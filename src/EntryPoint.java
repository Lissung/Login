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
        loginView.registerView();
    }
}
