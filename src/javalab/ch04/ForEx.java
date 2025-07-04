package javalab.ch04;

import java.util.stream.IntStream;

public class ForEx {

	public static void main(String[] args) {
		//1부터10까지 합을 구하세요.
		int sum=0;
		for (int i=1; i<=10; i++) {
			//for문의 초기화 부분에서 선언된 변수는 for블럭 지역변수이다.
			//sum 은 for 블럭 외부에서 사용되기 때문에 전역변수로 사용되어야합니다.
			sum+=i;
			System.out.println("i" + i + ",sum :" +sum);
		} 
		System.out.println("1부터10까지 합:" +sum);

		//이중for문 예제
		// 정수 구구단을 출력해주세요.
		//변수명 단 (dan), 배수 (times)
		for (int dan=2; dan <=9; dan++) {
			for (int times =1; times <=9; times++) {
				System.out.println(dan + "x" +times + "=" + dan*times);
			}
			System.out.println();
		}
		//continue : continue를 만나면 그 아래 코드는 실행되지 않고, 반복문의 조건 검사(또는 증감식) 단계로 바로 넘어감.
		//1~100까지 숫자중 홀수의 합을 구하세요.
		// 홀수인지 검사하여 처리하세요.
		// 짝수인지 검사하여 처리하세요.
		int total = 0;
		int num;
		
		for (num=1; num<=100; num++) {
			if(num % 2 ==0)
				continue;
			total +=num;
		}
		System.out.println("1부터10까지 홀수합은 " +total);
		
		int total1 = 0;
		int num1;
		
		for (num1=0; num1<=100; num1++) {
			if(num1 % 2 ==1)
				//continue;
			total1 +=num1;
		}
		System.out.println("1부터10까지 짝수합은 " +total1);
		
		// 0부터 시작하여 1씩 증가하여 더한 숫자의 합이 100이 이상인 경우 그 수와 합을 출력하세요.
		// for문 과 while문
		int sum2 =0;
		int num2;
		
		for (num2=0; ; num2++) {
			sum2 +=num2;
			if (sum2 >=100)
				break; // 반복중단
		}
		System.out.println("num2:" + num2 + ", sum2:" + sum2);
	
		
		int sum3=0;
		int num3 =0;
		while (sum3<=100) {
			++num3;
			sum3+=num3;
		} 
		System.out.println("num3:" + num3 + ", sum3:" + sum3);
	
		
		
		System.out.println(IntStream.range(1,11).sum());
	
	
	}
	
}
