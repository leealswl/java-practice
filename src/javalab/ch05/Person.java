package javalab.ch05;

public class Person {
	String name;
	int height;
	double weight;
	char gender;
	boolean married;
	
	//메서드(생성자)오버로딩
	//메서드는 각각의 메서드(생성자)를 구별할 경우 메서드명+매개변수타입의 조합 (시그니처)를 이용한다.
	
	//2. 기본생성자 - 사용자생성자가 없는경우 자동생성. 사용자 생성자가 있는경우는 수동생성.
	
	public Person() {
		
	}
	
	//3. 사용자생성자 -
	public Person(String pName) {
		name = pName;
	}
	
	//1. 사용자 생성자 - 이름 키 몸무게 필수로 만드는 생성자
	public Person(String pName, int pHeight, double pWeight) {
		if (pHeight <1)
			System.out.println("키는 0보다 작을수없지!");
		else {
		name =pName;
		height = pHeight;
		weight =pWeight;
	}
	}
}
