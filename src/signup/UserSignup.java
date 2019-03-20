package signup;

import view.LoginView;

import java.util.Scanner;

public class UserSignup {

    Scanner scan = new Scanner(System.in);

    String id2 = null;
    String pwd2 = null;

    System.out.print("ID : ");
    id2 = scan.nextLine();

    System.out.print("Passward : ");
    pwd2 = scan.nextLine();


    if (id2 != id){
        System.out.print("회원가입 완료");
    }
    else {
        System.out.print("다른 아이디를 사용하세요");
    }
}
