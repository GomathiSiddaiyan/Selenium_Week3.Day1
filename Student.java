package week3.day1;

public class Student extends Department{

	public void studentName() {
		// studentName
		System.out.println("Student Name: Gomathi Siddaiyan");
	}
	public void studentDept() {
		// studentDept
		System.out.println("Student Department: CSE");
	}
	public void studentID() {
		// public
		System.out.println("Student ID: 84644");
	}

	
	public static void main(String[] args) {
		Student st= new Student();
		System.out.println("College class Methods:");
		System.out.println("================================");
		st.collegeName();
		st.collegeCode();
		st.collegeRank();
		System.out.println();
		
		System.out.println("Deparment class Methods:");
		System.out.println("================================");
		st.deptName();
		System.out.println();
		
		System.out.println("Student class Methods:");
		System.out.println("================================");
		st.studentName();
		st.studentDept();
		st.studentID();
		
	}
}
