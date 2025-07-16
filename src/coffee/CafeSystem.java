package coffee;

import java.util.*;

public class CafeSystem {

    private static Scanner sc = new Scanner(System.in);
    private static LoginManager loginManager = new LoginManager();

    public static void main(String[] args) {
        while (true) {
            System.out.println("=== 카페 시스템 ===");
            System.out.println("1. 회원 로그인");
            System.out.println("2. 관리자 로그인");
            System.out.println("3. 종료");
            System.out.print("번호 선택: ");
            System.out.println("================");

            String choice = sc.nextLine(); //모든문자를 string으로 읽음

            switch (choice) {
                case "1":
                    loginManager.memberLogin(sc);
                    break;
                case "2":
                    loginManager.adminLogin(sc);
                    break;
                case "3":
                    System.out.println("시스템을 종료합니다.");
                    return;
                default:
                    System.out.println("잘못된 입력입니다. 다시 선택해주세요.");
            }
        }
    }
}
