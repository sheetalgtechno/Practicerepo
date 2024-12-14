package Inheritance;

public class College {

	int collegeId;
	String collegeName;
	int deptId;
	
	void setData() {
		int collegeId = 11;
		String collegeName = "Pune University";
		int deptId = 101;
	}
	
	void displayData() {
		System.out.println(collegeId + " - " + collegeName + " - " + deptId);
	}

}
