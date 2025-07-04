package javalab.ch02;


//형변환 
public class TypeConversion {

	public static void main(String[] args) {
		int iNum = 1000;
		byte bNum = (byte)iNum; // 명시적형변환 인트4바이트 바이트 1바이트, 
								// int 값의 크기가 byte 범위인지확인 -> 값이 크면 오버플로우현상발생
		
		System.out.println(iNum);
		System.out.println(bNum);
		
		double dNum = 3.14;
		int iNum2 = (int)dNum;
		System.out.println(dNum);
		System.out.println(iNum2); // 명시적형변환 더블 8바이트, 인트 4바이트
									// 더블값 크기가 인트범위인지 확인 
		
		// 1.2 와 0.9F 를 더한값을 정수형으로 출력하세요. 단 변수명은 dNum ,fNum을 이용해주세요.
		//결과값은 int형 iNum3 으로 대입하여 출력하세요. 
		double dNum1 = 1.2;
		float fNum2=0.9F;
		
		int iNum3 = (int)dNum1+(int)fNum2;
		int iNum4 = (int)(dNum1 + fNum2); // 이게 정답.
		System.out.println(iNum3);
		System.out.println(iNum4);
		
		//묵시적 
		
		byte bNum1 =10;
		int INum1 =bNum1;
		
		System.out.println(bNum1);
		System.out.println(INum1);
		
		int iNum5 =20;
		float fNum1 = iNum5;
		
		System.out.println(iNum5);
		System.out.println(fNum1);
		
		double dNum2; //기본형 변수는 사용전 초기화 필수
		dNum2 = fNum1 + iNum5;
		System.out.println(dNum2);
		
	}

}
