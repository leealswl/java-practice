package javalab.ch05;

public class PersonTest {

	public static void main(String[] args) {
//2. 기본생성자
		Person personKim =new Person();
		personKim.name ="김씨";
		personKim.weight= 85.5f;
		personKim.height=165;
		//personKim.married =false;
		
		//사용자 생성자 - 객체를 만드는데 필요한 필수 데이터를 지정.
		Person personLee = new Person("이순신", 175, 75);
		
				
	}

}
