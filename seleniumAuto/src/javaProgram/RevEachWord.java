package javaProgram;

public class RevEachWord {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str = "my name is susant";
		String revWord=" ";
		
		String[] words = str.split(" ");
		
		for(String word :words) {
			String revString="";
			for(int i=word.length()-1;i>=0;i--) {
				revString = revString+word.charAt(i);
			}
			revWord=revWord+revString+" ";
		}
		System.out.println(revWord);
	}
}
