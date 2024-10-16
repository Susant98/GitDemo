package javaProgram;

public class CountOffOcurance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str1= "my name is susant";
		int len=str1.length();
		
		int lem_a = str1.replace("a","").length();
		
		int total = len-lem_a;
		System.out.println(total);
		

	}

}
