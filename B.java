package collection13feb;

public class B {
public static void main(String[] args) {
		
		Student s1 = new Student (1, "deep", 79.0f);
		Student s2 = new Student (2, "deepak", 89.0f);
		Student s3 = new Student (2, "deepak", 89.0f);

		int a[] = new int[5];
		Student studlist[] = new Student[3];

		studlist[0] = s1;
		studlist[1] = s2;
		studlist[2] = s3;

		for(int i=0; i<studlist.length; i++) {
			System.out.println(studlist[i]);
		}
	}

}






