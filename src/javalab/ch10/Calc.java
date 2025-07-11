package javalab.ch10;

public interface Calc {
	double PI=3.14;
	int ERROR = -99999; // 상수. 자동으로 final이 붙습니다. 대문자로 쓰는걸 권고?
	
	int add(int num1, int num2); // 추상메서드, public abstract
	int substract(int num1, int num2);
	int times(int num1, int num2);
	int divide(int num1, int num2);

}

//로직 interface Calc 
// 베이직칼크 -> 추상메서드
// 컴플리트칼크 -> 베이직칼크 상속
