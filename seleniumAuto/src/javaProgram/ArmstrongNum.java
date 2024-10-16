package javaProgram;

import java.util.Scanner;

public class ArmstrongNum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arm =0;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number");
		int num = sc.nextInt();
		int temp = num;
		while(temp!=0) {
			int rem = temp%10;
			arm = arm+(rem*rem*rem);
			temp = temp/10;
		}
		if(num==arm) {
			System.out.println("The arm number is "+num);
		} else {
			System.out.println("The arm number is not "+num);
		}

	}

}
