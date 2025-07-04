package javalab.ch03;

import javax.swing.plaf.synth.SynthStyleFactory;

public class OperatorEx {

	public static void main(String[] args) {
		// 증감 연산자
		// 값을 1씩 증가 감소시키는 연산자
		int num =0;

		System.out.println(++num); // num = num +1, 1을 증가한 뒤에 값을 전달
		System.out.println(num++); // num = num +1 전달한 뒤에 1을 증가시킴 후치연산자
		System.out.println(num);
		
		System.out.println(--num); // num = num -1, 1을 감소한 뒤에 값을 전달
		System.out.println(num--); // num = num -1, 전달한 뒤에 1을 감소시킴 후치연산자
		System.out.println(num);
	
	// 단락회로
		int num1=10;
		int i=2;
		
		boolean value = ((num1 = num1 +10) <10) && ((i=i+2)<10);
		System.out.println(value);
		System.out.println(num1);
		System.out.println(i);
		
		value =((num1 =num1 +10) >10) || ((i=i+2)<10);
		System.out.println(value);
		System.out.println(num1);
		System.out.println(i);
		
		//복합대입연산자
		num1 +=2;
		System.out.println(num1);
		
		//삼항연산자
		int fatherAge = 45;
		int motherAge = 47;
		
		char ch;
		ch = (fatherAge > motherAge) ? 'T' : 'F';
		System.out.println(ch);
		
		//실습 -정수 나눗셈,분모 변수 a에 0을 입력할경우 나눗셈을 하지 않는다. if문, 불린값, 삼항연산자로.
		int a=0, b=3;
		int res = 0;
		
		if (a !=0) {
			res =b/a ;
		}
		
		boolean isCheck = (a!=0) && ((res =b/a) >= 0);
		
		res =(a!=0)? b/a :0;
	
	}
}
