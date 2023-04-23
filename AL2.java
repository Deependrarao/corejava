package collection13feb;

import java.util.ArrayList;

public class AL2 {
	public static void main(String[] args) {
		
		ArrayList a1 = new ArrayList();
		System.out.println("init size: "+ a1.size());
		
		a1.add(10);
		a1.add("dipu");
		a1.add(40.0);
		a1.add(true);
		a1.add('@');
		
		System.out.println("added size :" + a1.size());
		
		System.out.println("data >>");
		
		System.out.println(a1);
		
		a1.remove(2);
		a1.remove("dipu");
		
		System.out.println(a1);
		
		System.out.println("after deleted size:"+a1.size());
		
		
	}

}
