package javaProgram;

import java.util.Scanner;

public class ReverseNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int rev=0;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number");
		int num = sc.nextInt();
		while(num!=0) {
			int rem = num%10;
			rev = (rev*10)+rem;
			num = num/10;
			
		}
		System.out.println("The reverse number is "+rev);
		
       sc.close();
	}

}
