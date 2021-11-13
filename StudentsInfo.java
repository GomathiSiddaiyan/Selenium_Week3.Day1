package week3.day1;

public class StudentsInfo {
	public void getStudentInfo() {
		// getStudentInfo
		System.out.println("Student Information:");
	}
	public void getStudentInfo(int stuId) {
		// getStudentInfo
		System.out.println("Student ID: "+stuId);
	}
	public void getStudentInfo(int stuId, String stuName) {
		// getStudentInfo
		System.out.println("Student Id: "+stuId);
		System.out.println("Student Name: "+stuName);
	}
	public void getStudentInfo(String stuEmail, long phNo) {
		// getStudentInfo
		System.out.println("Student Email Id: "+stuEmail);
		System.out.println("Student Phone Number: "+phNo);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Method Override Program");
		System.out.println("===============================");
		StudentsInfo std=new StudentsInfo();
		std.getStudentInfo();
		std.getStudentInfo(130);
		std.getStudentInfo(130, "Gomathi");
		std.getStudentInfo("gomusidyan@gmail.com", 987543210);
	}

}
