package javalab.ch05;


// 1. 모든 학생은 학번과 성명을 가지고있다.변경불가능하다.
// 2. 국어와 수학 과목이 있고, 각각 과목명과 점수가 있고 변경 불가능하다.
public class Student4 {
	private int studentID;
	private String studentName;
	
	private Subject korean;
	private Subject math;

	//1. 학번과 성명 
	// 생성자는 멤버변수 초기화, 객체 생성시 1번만 실행됨.
	public Student4(int pStudentID, String pStudentName) {
		studentID = pStudentID;
		studentName = pStudentName;		
	}
	
	//getter, setter 디자인패턴이라고 함. 
	//source -> generate getter,setter
	
	//학번만 추출
	public int geStudentID() {
		return studentID;
	}
	//이름만 추출
	public String GetStudentName() {
		return studentName;
	}
	//  private 변수에 값을 저장하는 메서드
	public void setStudentName(String pStudentName) {
		studentName =pStudentName;
	}
	
	
	public Subject getKorean() {
		return korean;
	}

	public void setKorean(Subject korean) {
		this.korean = korean;
	}

	public Subject getMath() {
		return math;
	}

	public void setMath(Subject math) {
		this.math = math;
	}

	public void showInfo() {
		System.out.println("학번:" +studentID + ", 이름: " + studentName);
		System.out.println("국어:" +korean.subjectName + korean.scorePoint +", \n"
				+ "			수학:" +math.subjectName +math.scorePoint );
	}
	
	
	
}
