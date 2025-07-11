package javalab.ch10;

//인터페이스의 추상메서드를 모두 구현하지 않고, 일부만 구현하는 경우
public abstract class BasicCalc implements Calc { //implements 코드구현

	@Override
	public int add(int num1, int num2) {
		return num1 +num2;
	}

	@Override
	public int substract(int num1, int num2) {
		return num1 -num2;
	}

	@Override
	public int times(int num1, int num2) {
		return 0;
	}

	@Override
	public int divide(int num1, int num2) {

		return 0;
	}

}
