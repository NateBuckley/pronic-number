package com.revature;

import java.util.Scanner;

public class MainDriver {

	public static void main(String[] args) {
		Scanner sc =  new Scanner(System.in);
		
		System.out.print("Enter a positive integer: ");
		int number = sc.nextInt();
		
		if(isPronic(number)) {
			System.out.println(number + " is a pronic number.");
		} else {
			System.out.println(number + " is not a pronic number.");
		}

	}
	
	private static boolean isPronic(int number) {
		
		int i = 0;
		
		 while(i <= (int)Math.sqrt(number)) {
			 if(number == i*(i+1)) {
				 return true;
			 }
			 
			 i++;
		 }

	   return false;
	}

}
