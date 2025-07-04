package javalab.ch04;

public class IfExample {

	public static void main(String[] args) {
		//if 문 예제
		// 나이 age가8이상이면 학교에 다닙니다. 
		// 그밖에 경우는 학교에 다니지 않습니다. 현재 아이의 나이는 2,
		int age = 2;
		if (age >=8) {
			System.out.println("학교에 다닙니다.");
		} else {
			System.out.println("학교에 다니지 않습니다.");
		}

		
		// else if문 예제
		age = 9;
		int charge;
		
		if (age<8) {
			charge =1000;
			System.out.println("취학 전 아동입니다.");
		} else if (age<14) {
			charge =2000;
			System.out.println("초등학생입니다.");
		} else if (age<20) {
			charge =2500;
			System.out.println("중,고등학생입니다.");
		} else {
			charge =3000;
			System.out.println("일반인입니다.");
		} //System.out.println ("입장료는" +charge+ " 원 입니다.");
		System.out.printf("입장료는 %d 원입니다.", charge);
		
		// 자바는 f-string 문법이 없어서 println 사용할경우 + 로 연결해서 사용하거나
		// printf 사용해 포맷 지정 출력 함. %d ->숫자, %s-> 문자열 
		
		
	
	}

}
