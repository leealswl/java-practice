package javalab.ch06;
//하나의 소스코드안에 클래스를 2개이상 선언하는 경우 접근제어자 public은 클래스는한개여야만된다.
class BirthDay {
	int day;
	int month;
	int year;
	
	public void setYear(int year) {
		this.year = year; //this : new 키워드로 객체가 생성되었을때 객체주소값
	}
	
	public void printThis() {
		System.out.println(this); //주소값출력
	}
	
	
}
class Person{
	String name;
	int age;
	
	public Person () {
		this("이름없음",1); // 자기 자신의 다른 생성자 호출 ,생성자 overloading
	}
	public Person(String name,int age) {
		this.name = name;
		this.age= age;
	}
	
	public void printThis() {
		System.out.println(this); //주소값출력
	}
}

public class ThisEx {

	public static void main(String[] args) {
		BirthDay bDay =new BirthDay();
		bDay.setYear(2000);
		System.out.println(bDay);
		bDay.printThis();
		
		BirthDay bDay1 =new BirthDay();
		System.out.println(bDay1);
		bDay1.printThis();
		
		Person noName =new Person(); //기본생성자로 호출
		System.out.println(noName.name);
		System.out.println(noName.age);
		noName.printThis();

	}

}
