package javalab.ch04;

//클래스명을 변경할경우 sts로 생성하였음으로 sts의 리네임을 이용해야함.
public class WhileEx1 {

	public static void main(String[] args) {
		//1부터 10까지 총합을 구하셔요
		int num=1;
		int sum=0;
		
		
		//조건을 먼저 검사 - 블록내 코드가 실행된다는 것을 보장할수 없다.
		//조건을 나중에 검사 - 블록 내 코드가 적어도 1번 실행된다는 것을 보장한다.
		while (num <= 10) {
			sum +=num; //sum =sum+num
			++num; //num =num+1
			
		} System.out.println(sum);
		
		num=1;
		sum=0;
		do {
			sum += num;
			num++;
		} while (num <=10); 
		System.out.println(sum);
	}
}
