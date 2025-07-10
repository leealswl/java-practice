package javalab.ch05;

public class Student4Test {

	public static void main(String[] args) {
		Student4 stud1 =new Student4(1, "학생1"); //생성자를 이용하여 불변형
		stud1.setStudentName("학생1-1로 수정"); //이렇게 하면 안됌
		
		Subject korean = new Subject("국어",94); //객체를 생성하고 주소를 변수에전달 
		stud1.setKorean(korean);	//변수가 가지고 있는 주고를 매개변수로 전달
		
		stud1.setMath(new Subject("수학",95)); //객체주소만 매개변수로 전달.
		
		stud1.showInfo();
	}

}
