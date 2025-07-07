package javalab.ch05;

public class Student1Test {

	public static void main(String[] args) {
		Student1 stud1 =new Student1();
		
		//기본형
		stud1.KoreanName = "국어";
		stud1.koreanScore =95;
		stud1.mathName ="수학";
		stud1.mathScore=92;
		
		stud1.koreanScore =100; //side effect (부작용)
		
		System.out.println(stud1.toString());

		//참조형(클래스)
		Subject kor = new Subject();
		kor.subjectName ="국어";
		kor.scorePoint=90;
		Subject math = new Subject();
		math.subjectName="수학";
		math.scorePoint=91;
		
		stud1.korean =kor;
		stud1.math = math;
		
		//생성자이용1-2
		Subject korean1 = new Subject("국어",90);
		stud1.korean =korean1;
		
		stud1.math=new Subject("수학",80);
	}

}
