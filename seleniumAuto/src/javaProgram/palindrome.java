package javaProgram;

import java.util.Scanner;

public class palindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int sum=0;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number");
		int num = sc.nextInt();
//		int temp = num;
//		while(num!=0) {
//			int rem = num%10;
//			sum= (sum*10)+rem;
//			num= num/10;
//		}
//		if(temp==sum) {
//			System.out.println("The palin number is "+sum);
//		} else {
//			System.out.println("The palin number is not "+sum);
//		}
		int temp=num;
		while(num!=0) {
			int rem = num%10;
			sum = (sum*10)+rem;
			num = num/10;
		}
		if(temp==sum) {
			System.out.println("The palin number is "+sum);
		} else {
			System.out.println("The palin number is not"+sum);
		}
		

	}

}
