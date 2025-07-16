package javalab.ch14;

public class IdFormatTest {

	public static void main(String[] args) {
		IDFormat user =new IDFormat();
		
		try {
			user.setUserID("12345"); //메서드가 예외를 던질수잇어서
		} catch (IDFormatException e) {
			System.out.println(e.getMessage());
		}

	}

}
