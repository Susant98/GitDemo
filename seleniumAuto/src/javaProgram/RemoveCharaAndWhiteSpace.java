package javaProgram;

public class RemoveCharaAndWhiteSpace {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		String str = "sus@#ant";
//		String str2 = str.replaceAll("[^a-zA-Z0-9]", "");
//		System.out.println(str2);
		
		
		String str = "sus an t";
		String str2 = str.replaceAll("\\s", "");
		System.out.println(str2);

	}

}
