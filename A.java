package collection13feb;

public class A {
	public static void main(String[] args) {
		
		Student s1 = new Student(1,"dipu",90.0f);
		Student s2 = new Student(1,"dipu",90.0f);
		Student s3 = new Student(1,"dipu",90.0f);
		
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






