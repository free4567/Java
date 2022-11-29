package sub1;

/*
 * 날짜 : 2022/09/22
 * 이름 : 이상헌
 * 내용 : 정적변수 연습문제
 */
public class ex04 {
				studentld;
	private String studentName;
	private String major;
	private String grade;
	
	public Student(String studentName, String major, int grade) {
		this.studentId++;
		this,studentName = studentName;
		this.major = major;
		this.grade = grade;
	}   
	
	public void studentInfo() {
		System.out.println("");
		System.out.println("학번 : "+studentId);
		System.out.println("이름 : "+studentName);
		System.out.println("전공 : "+major);
		System.out.println("학년 : "+grade);
		System.out.println("");
		
	}
	
}

public class Test04 { 
	public static void main(String[] args) {
		
		Student.studentId = 2020100;
		
		Student kim = 
	    kim.studentInfo();
		
		Student lee =
		lee.studentINfo();
		
		student lim =
		lim. studentInfo();
	}	
}		
		

