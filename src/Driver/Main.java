package Driver;

import AdminDepartment.adminDepartment;
import HrDepartment.hrDepartment;
import TechDepartment.techDepartment;

public class Main {
	public static void main(String[] args) {
		
		adminDepartment  ad = new adminDepartment();
		hrDepartment	 hd = new hrDepartment();
		techDepartment   td = new techDepartment();
		
		System.out.println("Welcome to " +ad.departmentName());
		System.out.println(ad.getTodaysWork());
		System.out.println(ad.getWorkDeadline());
		System.out.println(ad.isTodayAHoliday()+"\n");
		
		System.out.println("Welcome to " +hd.departmentName());
		System.out.println(hd.doActivity());
		System.out.println(hd.getTodaysWork());
		System.out.println(hd.getWorkDeadline());
		System.out.println(hd.isTodayAHoliday()+"\n");
		
		System.out.println("Welcome to " +td.departmentName());
		System.out.println(td.getTodaysWork());
		System.out.println(td.getWorkDeadline());
		System.out.println(td.getTechStackInformation());
		System.out.println(td.isTodayAHoliday()+"\n");
				
	}
}