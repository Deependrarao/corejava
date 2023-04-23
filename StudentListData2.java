package collection13feb;

import java.util.Vector;



import java.util.List;

public class StudentListData2 {
	public static void main(String[] args) {
		
		Student s1 = new Student(1,"Deep",60.0f);
		Student s2 = new Student(1,"Dipu",78.0f);
		Student s3 = new Student(1,"Deepak",80.0f);
		
	    List <Student> studlist = new Vector<>();
	    studlist.add(s1);
	    studlist.add(s2);
	    studlist.add(s3);
	    
	    for(Student t :studlist) {
	    	if(t.per>70) 
	    	System.out.println(t);
	    }
	    
	  
	}

}
