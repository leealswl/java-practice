package javalab.ch09;

//추상클래스
//선언만 있고, 구현이 없는 메서드. 자식클래스에서 반드시 오버라이딩해야함.
//추상메서드를 하나라도 가지면 abstract로 선언해야함.
//추상클래스는 객체생성불가.
public abstract class Computer {
	public abstract void display();
	public abstract void typing(); 
}
