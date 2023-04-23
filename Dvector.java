package collection13feb;

import java.util.ArrayList;
import java.util.Vector;

public class Dvector {
	public static void main(String[] args) {
		Student2 s1 = new Student2(1,"Deep","B.Tech",60.0f);
		Student2 s2 = new Student2(2,"Dipu","MBA",78.0f);
		Student2 s3 = new Student2(3,"divya","M.Tech",39.0f);
		Student2 s4 = new Student2(3,"Shiv","M.Tech",80.0f);
		Student2 s5 = new Student2(3,"Shivraj","M.Tech",40.0f);
		
		Vector<Student2> a1 = new Vector<>();
		 a1.add(s1);
		 a1.add(s2);
		 a1.add(s3);
		 a1.add(s4);
		 a1.add(s5);
		 
		 for(Student2 s : a1) {
			 if(s.per>40) {
				 System.out.println("pass students:->"+s);
			 }
		 }
		 
		 System.out.println("============================");
		 for(Student2 s : a1) {
			 if(s.per<=40) {
				 System.out.println("fail students:->"+s);
			 }
		 }
		 
		 System.out.println("===========================");
		 for(Student2 s : a1) {
			 if(s.name.contains("Sh")) {
				 System.out.println("Name start with s students:->"+s);
			 }
		 }
		 
		 System.out.println("===========================");
		 a1.forEach(s -> System.out.println(s));
	}

}
