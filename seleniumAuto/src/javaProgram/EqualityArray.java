package javaProgram;

import java.util.Arrays;

public class EqualityArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[] = {1,2,3,4};
		int b[] ={1,2,3,4};
		
		boolean status = Arrays.equals(a, b);
		if(status) {
			System.out.println("arrays are equal");
		}

	}

}
