package javalab.ch05;

public class FunctionTest {

	public static void main(String[] args) {
		int num1 =10;
		int num2 =20;
		
		int sum = addNum(num1,num2);
		System.out.println(num1 + "+" + num2 + "="+ sum +"입니다.");

	}	
	public static int addNum(int n1, int n2) {
		int res =n1+n2;
		return res;
	}
	
}
