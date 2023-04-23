package collection13feb;

import java.util.ArrayList;

public class EmpArray {
	public static void main(String[] args) {
		Employee e1 = new Employee(1,"Deep","HOD",29000.0f);
		Employee e2 = new Employee(2,"Dipu","CEO",30000.0f);
		Employee e3 = new Employee(3,"divya","Developer",25000.0f);
		Employee e4 = new Employee(3,"Shiv","Tester",22000.0f);
		Employee e5 = new Employee(3,"Shivraj","Tester",23000.0f);
		
		ArrayList<Employee> a1 = new ArrayList<>();
		 a1.add(e1);
		 a1.add(e2);
		 a1.add(e3);
		 a1.add(e4);
		 a1.add(e5);
		 
		 for(Employee e : a1) {
			 if(e.sal>25000) {
				 System.out.println("employee salary is high :->"+e);
			 }
		 }
		 
		 System.out.println("============================");
		 for(Employee e : a1) {
			 if(e.role.contains("Tester")) {
				 System.out.println("employee work as testing :->"+e);
			 }
		 }
		 
		 System.out.println("============================");
		 for(Employee e : a1) {
			 if(e.role.contains("Developer")) {
				 System.out.println("employee work as developer :->"+e);
			 }
		 }
		 
		 
	}

}
