package com.run.java;

import java.util.Scanner;

public class PrimeClass {

	public static void main(String[] args) {
		System.out.println("prime number between one two hundred");
		for(int i=1 ;i<100;i++){
			
			if(squareRoot(i)){
				System.out.print(i+"  ");
			}
		}
    }

	private static boolean squareRoot(int num) {
		if(num<=1){
			System.out.print(num+" ");
			return false;
		}
		for(int j=2;j<=Math.sqrt(num);j++){
			
		 if(num%j==0){
				return false;
			}
				
		}
		return true;
	}
}
