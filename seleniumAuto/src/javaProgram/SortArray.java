package javaProgram;

import java.util.Arrays;
import java.util.Collections;

public class SortArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Integer a[] = {1,2,3,10,15,7,3};
//		Arrays.sort(a);
//		System.out.println(Arrays.toString(a));
		
		Arrays.sort(a,Collections.reverseOrder());
		System.out.println(Arrays.toString(a));

	}

}
