package AdminDepartment;

import SuperDepartment.superDepartment;

public class adminDepartment extends superDepartment {
	
	public String departmentName() {
		return "Admin Department";
	}
	
	public String getTodaysWork() {
		return "Complete your documents submission";
	}
	
	public String getWorkDeadline() {
		return "Complete by EOD";
	}
}