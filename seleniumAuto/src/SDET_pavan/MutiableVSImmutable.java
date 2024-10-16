package SDET_pavan;

public class MutiableVSImmutable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		//mutuable can change
	//	int a[] = {10,30,20};
	//	Arrays.sort(a);
	//	System.out.println("After sorting "+Arrays.toString(a));
		
		//immutable===cant change
	//	String s = new String("welcome");
	//	s.concat(" to java");
	//	System.out.println(s);    //only "welcome" will print
		
	//	String s = new String("welcome");
	//	String concat = s.concat(" to java");
	//	System.out.println(concat);    //welcome to java will print
		
		//mutuable
//		StringBuffer sb = new StringBuffer("welcome");
//		sb.append(" to java");
//		System.out.println(sb);
		
		//== and equal() method
//		String s1 = "welcome";
//		String s2 = "welcome";
//		System.out.println(s1==s2);   //true
//		System.out.println(s1.equals(s2)); //true
		
		
	//	String s1 = "welcome";
	//	String s2 = new String("welcome");
	//	System.out.println(s1==s2);   //false
	//	System.out.println(s1.equals(s2)); //true
		
//		String s1 = new String("welcome");
//		String s2 = new String("welcome");
//		System.out.println(s1==s2);   //false
//		System.out.println(s1.equals(s2)); //true
		
		String s1 = "welcome";
		String s2 = new String("welcome");
		String s3 = s2;
		System.out.println(s3==s2); //true bcz object are same
		System.out.println(s1.equals(s2)); //true
		
		
		

	}

}
