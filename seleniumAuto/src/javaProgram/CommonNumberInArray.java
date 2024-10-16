package javaProgram;

public class CommonNumberInArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String[] str1 = {"susant","kumar"};
		String[] str2 = {"susant","kumar","nahak"};
		
		for(int i=0;i<str1.length;i++) {
			for(int j=0;j<str2.length;j++) {
				if(str1[i]==str2[j]) {
					System.out.println(str1[i]);
				}
			}
		}
		

	}

}
