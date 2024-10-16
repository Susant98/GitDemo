package SDET_pavan;

public class Static_nonStatic {
	
	
	
	static int a =10;
	int b=30;
	
	
	static void m1() {
		System.out.println("this is m1 static method");
	}
	
	void m2() {
		System.out.println("this is m2 method");
	}
	
	void m() {
		System.out.println(a);      //Non-static method can access everything directly
		System.out.println(b);
		m1();
		m2();
	}

	public static void main(String[] args) {
		
		// 1. static method can acess static stuff directly
	//	System.out.println(a);
	//	m1();
		
		
		//System.out.println(b); //cant not access non static variable directly
		//m2();
		
		Static_nonStatic t1 = new Static_nonStatic();
		t1.m2();
		
		
		
		
	}

}
