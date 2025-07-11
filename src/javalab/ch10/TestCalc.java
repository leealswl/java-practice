package javalab.ch10;

public class TestCalc implements Calc {

	@Override
	public int add(int num1, int num2) {
		return num1 +num2 + 1; // add()함수에+1  
	}

	@Override
	public int substract(int num1, int num2) {
		return num1 -num2;
	}

	@Override
	public int times(int num1, int num2) {
		return num1 *num2;
	}

	@Override
	public int divide(int num1, int num2) {
		return num1 /num2;
	}

}
