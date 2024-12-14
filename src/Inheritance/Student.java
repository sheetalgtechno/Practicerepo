package Inheritance;

public class Student extends College{
	
	int studentId;
	String collegeName;
	int deptId;
	
	void setData() {
		int studentId = 6;
		String collegeName = "Nagpur University";
		int deptId = 202;
	}
	
	void printData() {
		System.out.println(studentId + " - " + collegeName + " - " + deptId);
	}
	
}
