package javalab.ch12;


//wrapper class 
//기본형을 참조형으로 변환(박싱) 사용
//참조형을 기본형으로 변환(언박싱) 사용
public class WrapperEx {
	public static void main(String[] args) {
		
		Integer num =10; //박싱
		int iNum =num.intValue();//언박싱
		int jNum =200;
		
		int sum =iNum +jNum;
		System.out.println(sum);
	
		int total = num +jNum; //자동으로 언박싱
		System.out.println(total);
	
	}
	
	

}
