package javalab.ch05;

public class StudentTest {

	public static void main(String[] args) {
		Student student1 = new Student();
		student1.studentName ="홍"; //new 생성자
		System.out.println(student1.getStudentName()); //멤버변수
		
		Student student2 = new Student();
		student2.studentName="타코야끼";
		System.out.println(student2.getStudentName());

		// student클래스 인스턴스인 student3 생성하고, 멤버필드 studentname을 고길동으로 초기화한뒤 출력.
		Student student3 = new Student();
		student3.studentName ="고길동";
		System.out.println(student3.getStudentName());
		
		System.out.println(student1);
		System.out.println(student2);
		System.out.println(student3);
		
		
	}

}
