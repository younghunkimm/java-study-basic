package chapter3.exception.login;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (true) {
            try {
                System.out.print("아이디 입력: ");
                String userId = sc.nextLine();
                System.out.print("비밀번호 입력: ");
                String password = sc.nextLine();

                login(userId, password); // 예외 발생 가능
                System.out.println("로그인 성공!");
                break;
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        }
    }
    
    public static void login(String userId, String password) throws Exception {
        if (!userId.equals("admin") || !password.equals("1234")) {
            throw new Exception("로그인 실패! 아이디 또는 비밀번호가 잘못되었습니다.");
        }
    }
}
