package javalab.ch12;

public class Plastic implements Material {

	@Override
	public void print() {
		System.out.println("Plastic 재료로 출력합니다");
	}
	@Override
	public String toString() {
		return "재료는 플라스틱 입니다.";
	

	}

}
