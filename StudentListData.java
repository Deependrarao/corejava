package collection13feb;

import java.util.Vector;



import java.util.List;

public class StudentListData {
	public static void main(String[] args) {
		
		Student s1 = new Student(1,"Deep",60.0f);
		Student s2 = new Student(2,"Dipu",78.0f);
		Student s3 = new Student(3,"Deepak",80.0f);
		
	    List <Student> studlist = new Vector<>();
	    studlist.add(s1);
	    studlist.add(s2);
	    studlist.add(s3);
	    
	    for(Object t :studlist) {
	    	System.out.println(t);
	    }
    	System.out.println("===========================");

	 studlist.forEach(t -> System.out.println(t));
	 System.out.println("============================");
	    studlist.forEach(System.out::println);
	    
	    
	    System.out.println("===============");
	    
	    for(int i=0; i<=20; i++) {
	    	System.out.println(studlist);
	    }

	}

}
