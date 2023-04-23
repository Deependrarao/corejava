package collection13feb;

import java.util.ArrayList;

public class EnhanceFor {
	public static void main(String[] args) {
		
	ArrayList a1 = new ArrayList();
	
	a1.add(10);
	a1.add("deepu");
	a1.add("deepak");
	a1.add('#');
	a1.add(10.0);
	
	for(Object t : a1) {
		System.out.println(t);
	}
	}

}
