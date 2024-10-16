package javaProgram;

import java.util.Arrays;

public class SecondHighestArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a[] = {1,2,3,10,15,7};
		int num = a.length;
		Arrays.sort(a);

			System.out.println(a[num-2]);
	

	}

}
