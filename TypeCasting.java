package collection13feb;

public class TypeCasting {
	public static void main(String[] args) {
		int a=10;
		
		//primitive to wrapper class :=Boxing
		
		Integer i1 = new Integer(a);
		System.out.println(i1);
		
		//wrapper to primitive class := UnBoxing
		
		float f = i1.floatValue();
		System.out.println(f);
		
      //primitive to wrapper class := Auto-Boxing
		
		Integer i2 = a;
		System.out.println(i2);
		
		//wrapper to primitive class := Auto-UnBoxing
		
		float f1 = i2;
		System.out.println(f1);


	}

}
