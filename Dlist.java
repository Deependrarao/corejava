package collection13feb;

import java.util.ArrayList;
import java.util.List;
import java.util.Vector;



public class Dlist {
	public static void main(String[] args) {
		Student2 s1 = new Student2(1,"Deep","B.Tech",60.0f);
		Student2 s2 = new Student2(2,"Dipu","MBA",78.0f);
		Student2 s3 = new Student2(3,"divya","M.Tech",39.0f);
		Student2 s4 = new Student2(3,"Shiv","M.Tech",80.0f);
		Student2 s5 = new Student2(3,"Shivraj","M.Tech",40.0f);
		
	 List <Student2> studlist = new Vector<>();
	    studlist.add(s1);
	    studlist.add(s2);
	    studlist.add(s3);
	    studlist.add(s4);
	    studlist.add(s5);
		 
		 for(Student2 s : studlist) {
			 if(s.per>40) {
				 System.out.println("pass students:->"+s);
			 }
		 }
		 
		 System.out.println("============================");
		 for(Student2 s : studlist) {
			 if(s.per<=40) {
				 System.out.println("fail students:->"+s);
			 }
		 }
		 
		 System.out.println("===========================");
		 for(Student2 s : studlist) {
			 if(s.name.contains("Sh")) {
				 System.out.println("Name start with s students:->"+s);
			 }
		 }
	}

}
