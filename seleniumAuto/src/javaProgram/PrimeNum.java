package javaProgram;

import java.util.Scanner;

public class PrimeNum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i = 1,c=0;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number");
		int num = sc.nextInt();
		
		while(i<num) {
			if((num%i)==0)
				c=c+1;
			i++;
		}
		if(c==2) {
			System.out.println("The prime number is "+num);
		} else {
			System.out.println("The prime number is not "+num);
		}

	}

}
