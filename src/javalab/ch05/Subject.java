package javalab.ch05;

public class Subject {
	String subjectName;
	int scorePoint;
	
	public Subject() {
		
	}
	
	//생성자이용1-1
	public Subject(String pSubjectName, int pScorePoint) {
		subjectName = pSubjectName;
		scorePoint =pScorePoint;
	}

	//source -> generate tostring선택
	@Override
	public String toString() {
		return "Subject [subjectName=" + subjectName + ", scorePoint=" + scorePoint + "]";
	}
	
	
	
}
