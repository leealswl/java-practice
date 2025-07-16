package coffee;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class LoginManager {
	
	private Member member =new Member("member1", "ads", "hihi");
	private Admin Admin =new Admin("admin1", "ads", "hihiii");
	
	public void memberLogin(Scanner sc) {
		System.out.println("== 사용자 로그인 ==");
		
		System.out.println("ID : ");
		String id = sc.nextLine();
		System.out.println("PW : ");
		String pw = sc.nextLine();
	}
		
		

	public void adminLogin(Scanner sc) {

		
	}

}
