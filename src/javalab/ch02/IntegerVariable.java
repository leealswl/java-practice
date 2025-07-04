package javalab.ch02;

import java.math.BigInteger;

// 정수형 

public class IntegerVariable {

	public static void main(String[] args) {
		

		byte bVal = 20;
		short sVal =10;
		
		System.out.println(bVal+sVal);
		
		// int num = 12345678900; // int 최대값을 벗어난 오류
		long num1 = 12345678900L; // long 에대한 리터럴
		
		//정수 10, 20 을 더한 값을 출력하세요.
		int a=10;
		int b=20;
		System.out.println(a+b);
		System.out.println(10+20);
		
		//long 의 최대값
		System.out.println(Long.MAX_VALUE);
		System.out.println(Long.MAX_VALUE+1);
		
		BigInteger c = new BigInteger("10000000000000000000000000"); 
		BigInteger d = new BigInteger("1"); 
		BigInteger e = c.add(d); 
		System.out.println(e.toString());
	}

}
